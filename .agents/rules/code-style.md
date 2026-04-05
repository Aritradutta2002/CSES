---
trigger: always_on
glob: "*.java"
description: Standard instructions for CSES problem scaffolding in Java
---

When a problem is provided, follow these rules strictly:

1. **Problem Source**: The problem will always be from the CSES problem set. Search the problem on the CSES website to retrieve the full problem details.
2. **File Naming**: Create the Java file with an underscore-separated naming convention representing the problem name (e.g., `Weird_Algorithm.java`, `Missing_Number.java`).
3. **Documentation**: Include the FULL problem description as a comment block at the top of the Java file.
4. **Imports**: Import all standard Java packages/classes likely to be required (e.g., `java.util.*`, `java.io.*`).
5. **Scaffold Structure**: Create the main class (matching the file name) and a `main` method ready for testing. Set up standard standard competitive programming I/O if needed.
6. **No Solution Implementation**: **DO NOT write the logic for the solution.** The solution will be written by the user. Only generate the required boilerplate, documentation, and class structure.
