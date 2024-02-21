from tree_sitter import Language

Language.build_library(
    # Store the library in the `build` directory
    "build/ts-java.dll",
    # Include one or more languages
    ["tree-sitter-java"],
)
