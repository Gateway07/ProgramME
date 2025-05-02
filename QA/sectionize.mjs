import fs from 'fs';
import {unified} from 'unified'; // core unified processor
import remarkParse from 'remark-parse'; // parse Markdown → MDAST :contentReference[oaicite:0]{index=0}
import remarkGfm from 'remark-gfm'; // GFM: tables, task lists, links :contentReference[oaicite:1]{index=1}
import remarkFrontmatter from 'remark-frontmatter'; // strip YAML frontmatter :contentReference[oaicite:2]{index=2}
import removeComments from 'remark-remove-comments'; // drop <!-- … --> :contentReference[oaicite:3]{index=3}
import sectionize from 'remark-sectionize'; // wrap ##/### in <section> :contentReference[oaicite:4]{index=4}
import remarkRehype from 'remark-rehype'; // MDAST → HAST (HTML AST) :contentReference[oaicite:5]{index=5}
import rehypeRaw from 'rehype-raw'; // re-parse any inline HTML into HAST :contentReference[oaicite:6]{index=6}
import rehypeSlug from 'rehype-slug'; // (Optional) stable id="" on each heading :contentReference[oaicite:7]{index=7}
import rehypeStringify from 'rehype-stringify'; // HAST → HTML :contentReference[oaicite:8]{index=8}

const [, , inputPath, outputPath] = process.argv;
const md = fs.readFileSync(inputPath, 'utf8');

unified()
    .use(remarkParse)
    .use(remarkGfm)
    .use(remarkFrontmatter)
    .use(removeComments)
    .use(sectionize)
    .use(remarkRehype, {allowDangerousHtml: true})
    .use(rehypeRaw)
    .use(rehypeSlug)
    .use(rehypeStringify, {fragment: true})
    .process(md)
    .then(file => fs.writeFileSync(outputPath, String(file)))
    .catch(err => {
        console.error(err);
        process.exit(1);
    });
