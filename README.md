# CSES Problem Set Solutions

Java solutions for [CSES Problem Set](https://cses.fi/problemset/)

[![CSES](https://img.shields.io/badge/CSES-Problem%20Set-blue)](https://cses.fi/problemset/)
[![Java](https://img.shields.io/badge/Java-17+-orange)](https://www.oracle.com/java/)

## 📊 Progress

Track detailed progress in [PROBLEMS.md](PROBLEMS.md)

- **Introductory Problems**: 14/24 solved
- **Sorting and Searching**: 13/35 solved
- **Dynamic Programming**: 4/19 solved
- **Graph Algorithms**: 1/36 solved
- **Mathematics**: 9/31 solved
- **String Algorithms**: 2/16 solved
- And more...

## 📁 Project Structure

```
src/
├── introductory/          # Introductory Problems (14 solved)
├── sorting/               # Sorting and Searching (13 solved)
├── dp/                    # Dynamic Programming (4 solved)
├── graph/                 # Graph Algorithms (1 solved)
├── range/                 # Range Queries (1 solved)
├── tree/                  # Tree Algorithms (1 solved)
├── math/                  # Mathematics (9 solved)
├── string/                # String Algorithms (2 solved)
├── geometry/              # Geometry (1 solved)
├── advanced/              # Advanced Techniques (1 solved)
├── sliding/               # Sliding Window Problems (1 solved)
├── interactive/           # Interactive Problems (1 solved)
├── bitwise/               # Bitwise Operations (1 solved)
├── construction/          # Construction Problems (1 solved)
├── advgraph/              # Advanced Graph Problems (1 solved)
├── counting/              # Counting Problems (1 solved)
├── additional1/           # Additional Problems I (1 solved)
└── additional2/           # Additional Problems II (2 solved)
```

## 🚀 Usage

### Compile and Run

Each problem has its own Java file with proper package structure. To run a solution:

```bash
# From project root
javac src/<category>/<ProblemName>.java
java -cp src <category>.<ProblemName> < input.txt
```

**Example:**
```bash
javac src/introductory/WeirdAlgorithm.java
java -cp src introductory.WeirdAlgorithm < input.txt
```

### Using VS Code

1. Open the Java file
2. Click the "Run" button (or press F5)
3. Input will be read from stdin

### Using Command Line with Package

```bash
# Compile
javac -d bin src/introductory/WeirdAlgorithm.java

# Run
java -cp bin introductory.WeirdAlgorithm < input.txt
```

## 📝 Code Template

Each solution follows a consistent template structure:

```java
package <category>;

import java.io.*;
import java.util.*;

public class ProblemName {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        // Solution code
        out.close();
    }
    
    // Fast I/O helper methods
    static String next() throws IOException { ... }
    static int nextInt() throws IOException { ... }
    static long nextLong() throws IOException { ... }
    
    // Utility methods (GCD, modular arithmetic, etc.)
}
```

### Key Features:
- ✅ Fast I/O using BufferedReader and PrintWriter
- ✅ Proper package structure for organization
- ✅ Reusable utility methods (GCD, LCM, modular exponentiation, etc.)
- ✅ Clean and readable code
- ✅ Optimized for competitive programming

## 🛠️ Setup

### Prerequisites
- Java 17 or higher
- VS Code with Java Extension Pack (optional)

### Clone and Run
```bash
git clone <your-repo-url>
cd CSES
javac src/introductory/WeirdAlgorithm.java
java -cp src introductory.WeirdAlgorithm
```

## 📚 Resources

- [CSES Problem Set](https://cses.fi/problemset/) - Official problem set
- [CSES Solutions Guide](https://cses.fi/book/book.pdf) - Competitive Programmer's Handbook
- [CP Algorithms](https://cp-algorithms.com/) - Algorithm reference

## 🎯 Problem Categories

| Category | Description | Difficulty |
|----------|-------------|------------|
| Introductory | Basic programming concepts | ⭐ |
| Sorting and Searching | Sorting algorithms, binary search, two pointers | ⭐⭐ |
| Dynamic Programming | DP patterns and optimization | ⭐⭐⭐ |
| Graph Algorithms | DFS, BFS, shortest paths, MST | ⭐⭐⭐ |
| Range Queries | Segment trees, BIT, sparse tables | ⭐⭐⭐⭐ |
| Tree Algorithms | Tree DP, LCA, tree traversals | ⭐⭐⭐⭐ |
| Mathematics | Number theory, combinatorics | ⭐⭐⭐ |
| String Algorithms | Pattern matching, hashing, tries | ⭐⭐⭐⭐ |
| Geometry | Computational geometry | ⭐⭐⭐⭐ |
| Advanced Techniques | Meet in the middle, sqrt decomposition | ⭐⭐⭐⭐⭐ |

## 📈 Learning Path

1. **Start with Introductory** - Build fundamentals
2. **Master Sorting and Searching** - Essential techniques
3. **Learn Dynamic Programming** - Problem-solving patterns
4. **Explore Graph Algorithms** - Core CS concepts
5. **Advanced Topics** - Competitive programming mastery

## 🤝 Contributing

Feel free to:
- Add new solutions
- Optimize existing code
- Fix bugs
- Improve documentation

## 📄 License

This project is for educational purposes. Solutions are original implementations.

---

**Author**: Aritra Dutta  
**Target**: Codeforces Expert / CSES Completion  
**Last Updated**: March 2026
