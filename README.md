# Java Clean Code

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java 11+](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.java.com/)
[![GitHub stars](https://img.shields.io/github/stars/yourname/java-clean-code?style=social)](https://github.com/yourname/java-clean-code)

> Master clean code principles and design patterns through practical, runnable examples. No frameworks. No complexity. Just clean Java.

---

## 🎯 What This Is

A hands-on collection of **clean code patterns and best practices** with working Java examples. Each pattern shows:
- ❌ What NOT to do (Bad.java)
- ✅ What TO do (Good.java)
- 🎯 How to use it (Demo.java)

**No Gradle. No Maven. No tests. Just Java.**

Clone it. Run it. Learn from it. Apply it to your code.

---

## 🚀 Quick Start

```bash
# Clone the repository
git clone https://github.com/yourname/java-clean-code.git
cd java-clean-code

# Navigate to a pattern
cd dependency-injection

# Compile and run
javac *.java
java Demo
```

That's it! See the pattern in action.

---

## 📚 Patterns Included

### Creational Patterns
Learn how to create objects cleanly and efficiently.

- **[Static Factory Methods](./static-factories/)** - Flexible object creation
  > Instead of `new`, use factory methods for flexibility, clarity, and control.

- **[Dependency Injection](./dependency-injection/)** - Decouple your components
  > Pass dependencies in, don't grab them yourself. Enables testing and flexibility.

- **[Builder Pattern](./builder-pattern/)** - Complex object construction
  > Replace telescoping constructors with clean, readable builder syntax.

- **[Singleton Pattern](./singleton-pattern/)** - Controlled instantiation
  > When you need exactly one instance. Do it right or don't do it at all.

- **[Factory Pattern](./factory-pattern/)** - Object creation abstraction
  > Hide implementation details behind a factory interface.

### Structural Patterns
Design better class and object hierarchies.

- **[Immutable Objects](./immutable-objects/)** - Thread-safe by design
  > Once created, never change. Perfect for concurrent code.

- **[Adapter Pattern](./adapter-pattern/)** - Making incompatible interfaces work
  > Bridge the gap between different APIs gracefully.

- **[Decorator Pattern](./decorator-pattern/)** - Flexible behavior composition
  > Add responsibilities dynamically without subclassing.

### SOLID Principles
Master the foundation of clean code.

- **[Dependency Inversion](./solid/dependency-inversion/)** - Depend on abstractions
  > Depend on interfaces and abstractions, not concrete implementations.

- **[Single Responsibility](./solid/single-responsibility/)** - One reason to change
  > Each class should have one job and do it well.

- **[Open/Closed Principle](./solid/open-closed/)** - Extend, don't modify
  > Classes should be open for extension, closed for modification.

### Best Practices
Essential techniques for professional code.

- **[Clean Code Naming](./best-practices/naming/)** - Clear and meaningful names
  > Names should reveal intent. Make code self-documenting.

- **[Method Design](./best-practices/methods/)** - Small, focused methods
  > Methods should do one thing and do it well.

- **[Error Handling](./best-practices/error-handling/)** - Proper exception usage
  > Use checked exceptions for recoverable errors, unchecked for programming errors.

---

## 📖 How Each Pattern Is Structured

Every pattern folder contains exactly 3 Java files:

### Bad.java ❌
Shows the problem clearly:
- Common mistakes
- Why it fails
- Tight coupling issues
- Testing problems

### Good.java ✅
Shows the solution:
- Correct approach
- Multiple implementations
- Flexible design
- SOLID principles

### Demo.java 🎯
Shows them working together:
- Direct comparison
- Real-world scenarios
- Output shows the difference
- Why Good is better

### README.md
Links to your blog post and explains the pattern.

---

## 📖 Each Pattern Teaches You

After studying a pattern, you'll understand:

✅ **The Problem** - Why the bad approach fails  
✅ **The Solution** - How the good approach solves it  
✅ **When to Use** - When this pattern applies  
✅ **Real Examples** - Practical usage in production code  
✅ **Why It Matters** - Benefits and trade-offs

---

## 🎓 Learning Path

### Beginner (Start Here)
Perfect if you're new to design patterns.

1. **[Static Factory Methods](./static-factories/)** - Simple and practical
2. **[Dependency Injection](./dependency-injection/)** - Fundamental for all code
3. **[Builder Pattern](./builder-pattern/)** - Common in real projects
4. **[Clean Code Naming](./best-practices/naming/)** - Write readable code

### Intermediate
Once you understand basics, level up.

5. **[Immutable Objects](./immutable-objects/)** - Thread safety made easy
6. **[Singleton Pattern](./singleton-pattern/)** - Controlled instances
7. **[Factory Pattern](./factory-pattern/)** - Advanced creation
8. **[Adapter Pattern](./adapter-pattern/)** - Integration patterns

### Advanced
Master the principles.

9. **[SOLID Principles](./solid/)** - The foundation of great design
10. **[Decorator Pattern](./decorator-pattern/)** - Flexible compositions
11. **[Error Handling](./best-practices/error-handling/)** - Production-ready code

---

## 🔗 Blog Posts

Each pattern has a detailed blog post on Medium:

| Pattern | Blog Post |
|---------|-----------|
| Static Factory Methods | [Stop Using Constructors](https://medium.com/@m-i-idrak/stop-using-constructors-the-hidden-power-of-static-factory-methods-536d4bdbd790) |
| Dependency Injection | [Stop Hardwiring Your Resources](https://medium.com/@m-i-idrak/) |
| Builder Pattern | Coming soon |
| And more | [View all on Medium](https://medium.com/@m-i-idrak) |

---

## 💻 System Requirements

**That's all you need:**
- Java 11 or higher
- A terminal
- A text editor

**No build tools. No dependencies. No setup.**

### Check Your Java Version

```bash
java -version
javac -version
```

If you see Java 11+, you're ready to go!

---

## 🏃 How to Use This Repository

### For Learning
1. Pick a pattern that interests you
2. Read the README in that folder
3. Study Bad.java (understand the problem)
4. Study Good.java (understand the solution)
5. Run Demo.java (see them in action)
6. Read the blog post (full explanation)

### For Reference
- Bookmark your favorite patterns
- Come back when you need them
- Use as a refresher
- Share with teammates

### For Teaching
- Use in code reviews
- Share with junior developers
- Discuss in team meetings
- Reference in architecture discussions

### For Interviews
- Study these patterns before interviews
- Show you understand the "why"
- Explain trade-offs
- Discuss SOLID principles

---

## 📂 Repository Structure

```
java-clean-code/
│
├── README.md (this file)
├── LICENSE
├── .gitignore
│
├── static-factories/
│   ├── README.md
│   ├── Bad.java
│   ├── Good.java
│   └── Demo.java
│
├── dependency-injection/
│   ├── README.md
│   ├── Bad.java
│   ├── Good.java
│   └── Demo.java
│
├── builder-pattern/
│   ├── README.md
│   ├── Bad.java
│   ├── Good.java
│   └── Demo.java
│
├── solid/
│   ├── dependency-inversion/
│   ├── single-responsibility/
│   └── open-closed/
│
├── best-practices/
│   ├── naming/
│   ├── methods/
│   └── error-handling/
│
└── ... more patterns
```

---

## 🎯 Key Principles

This repository teaches you to:

✅ **Write Flexible Code** - Easy to change and extend  
✅ **Write Testable Code** - Mockable dependencies  
✅ **Write Readable Code** - Self-documenting  
✅ **Write Maintainable Code** - Easy for others to understand  
✅ **Follow SOLID** - Professional design patterns

---

## 🌟 What Makes This Different

### No Frameworks
- No Spring
- No Guice
- No complexity

### No Build Tools
- No Maven
- No Gradle
- No configuration hell

### No Tests
- Focus on the pattern
- See the code clearly
- Understand the concept

### Just Java
- Pure, clean code
- Educational focus
- Easy to run

---

## 📖 Recommended Resources

### Books
- **Clean Code** by Robert C. Martin - Essential reading
- **Effective Java** by Joshua Bloch - Java best practices
- **Design Patterns** by Gang of Four - Classic patterns
- **Refactoring** by Martin Fowler - Code improvement

### Online
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
- [Refactoring Guru Patterns](https://refactoring.guru/design-patterns)

---

## 🚀 Getting Started Now

### 1. Clone This Repository
```bash
git clone https://github.com/yourname/java-clean-code.git
cd java-clean-code
```

### 2. Pick a Pattern
```bash
cd static-factories
```

### 3. Read the Code
```bash
# Open and read these files
cat README.md
cat Bad.java
cat Good.java
cat Demo.java
```

### 4. Run the Demo
```bash
javac *.java
java Demo
```

### 5. Read the Blog Post
Check the README.md for the Medium link.

---

## ✨ What You'll Learn

After going through this repository, you'll:

✅ Understand common design patterns  
✅ Know when to use each pattern  
✅ Write more flexible code  
✅ Design better APIs  
✅ Follow SOLID principles  
✅ Write code others can maintain  
✅ Pass better technical interviews

---

## 📊 Repository Stats

- **Patterns Included:** 15+
- **Java Files:** 50+
- **Lines of Code:** 2,000+
- **Blog Posts:** 10+
- **Learning Paths:** 3 (Beginner, Intermediate, Advanced)
- **No Dependencies:** 0 external libraries
- **Setup Time:** 5 minutes

---

## 💡 Quick Examples

### Static Factory vs Constructor

```bash
cd static-factories
javac *.java
java Demo
```

Output shows why `Color.red()` is better than `new Color(255, 0, 0)`.

### Dependency Injection

```bash
cd dependency-injection
javac *.java
java Demo
```

Output shows how DI makes testing easy and code flexible.

### Builder Pattern

```bash
cd builder-pattern
javac *.java
java Demo
```

Output shows how builders replace ugly constructor chains.

---

## 🤝 Contributing

Found an issue? Want to improve?

1. Fork the repository
2. Create a branch
3. Make your changes
4. Submit a pull request

See [CONTRIBUTING.md](./CONTRIBUTING.md) for details.

---

## 📜 License

MIT License - Free to use, modify, and distribute.

See [LICENSE](./LICENSE) for details.

---

## 📧 Connect

- **Medium:** [@m-i-idrak](https://medium.com/@m-i-idrak)
- **GitHub:** [yourname](https://github.com/yourname)
- **LinkedIn:** [Your Profile](https://linkedin.com/in/yourname)

---

## 🎯 Your Next Steps

1. **Clone the repo** - `git clone ...`
2. **Pick a pattern** - Start with Static Factories
3. **Run the demo** - `javac *.java && java Demo`
4. **Read the blog** - Link in each pattern's README
5. **Apply it** - Use in your next project

---

## 💬 Questions?

- Check the README in each pattern folder
- Read the blog post linked there
- Review the code comments
- Study the Demo.java output

---

## 🌟 If You Found This Helpful

Please **⭐ star this repository!** It helps others discover it.

---

**Happy coding! Remember: Clean code is not written once and left alone. It's a continuous practice of improvement.** 💪

---

**Last Updated:** August 2026  
**Status:** Actively Maintained ✅  
**License:** MIT