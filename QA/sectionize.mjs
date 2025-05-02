import fs from 'fs';
import { unified } from 'unified';                                // core unified processor :contentReference[oaicite:1]{index=1}
import remarkParse from 'remark-parse';                           // parse Markdown → MDAST :contentReference[oaicite:2]{index=2}
import remarkGfm from 'remark-gfm';                               // GFM tables, task lists :contentReference[oaicite:3]{index=3}
import remarkFrontmatter from 'remark-frontmatter';               // strip YAML frontmatter :contentReference[oaicite:4]{index=4}
import removeComments from 'remark-remove-comments';              // drop <!-- … --> :contentReference[oaicite:5]{index=5}
import stripHtml from 'remark-strip-html';                       // remove any remaining HTML/JSX tags
import sectionize from 'remark-sectionize';                      // wrap each ##/### in <section> :contentReference[oaicite:6]{index=6}
import remarkRehype from 'remark-rehype';                         // mdast → hast (HTML AST) :contentReference[oaicite:7]{index=7}
import rehypeStringify from 'rehype-stringify';                   // serialize HTML AST → HTML :contentReference[oaicite:8]{index=8}

const [,, inputPath, outputPath] = process.argv;
const md = fs.readFileSync(inputPath, 'utf8');

unified()
  .use(remarkParse)
  .use(remarkGfm)
  .use(remarkFrontmatter)
  .use(removeComments)
  .use(stripHtml)
  .use(sectionize)
  .use(remarkRehype)
  .use(rehypeStringify, { fragment: true })
  .process(md)
  .then(file => fs.writeFileSync(outputPath, String(file)))
  .catch(err => { console.error(err); process.exit(1); });
