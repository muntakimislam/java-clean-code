package com.example.patterns.sf;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=".repeat(70));
        System.out.println("STATIC FACTORY METHODS VS PUBLIC CONSTRUCTORS");
        System.out.println("=".repeat(70));
        
        // PROBLEM
        System.out.println("\n1️⃣  BAD: Public Constructors");
        System.out.println("-".repeat(70));
        System.out.println("  new Bad(255, 0, 0) → " + new Bad(255, 0, 0).getColor());
        System.out.println("  new Bad(0, 255, 0) → " + new Bad(0, 255, 0).getColor());
        System.out.println("  new Bad(0, 0, 255) → " + new Bad(0, 0, 255).getColor());
        System.out.println("\nProblems:");
        System.out.println("  ❌ What do these numbers mean?");
        System.out.println("  ❌ Must remember RGB order");
        System.out.println("  ❌ Can't name them clearly");
        System.out.println("  ❌ Hard to add variants");
        
        // SOLUTION
        System.out.println("\n2️⃣  GOOD: Static Factory Methods");
        System.out.println("-".repeat(70));
        System.out.println("  Good.red()   → " + Good.red().getColor());
        System.out.println("  Good.green() → " + Good.green().getColor());
        System.out.println("  Good.blue()  → " + Good.blue().getColor());
        System.out.println("  Good.white() → " + Good.white().getColor());
        System.out.println("  Good.black() → " + Good.black().getColor());
        System.out.println("\nBenefits:");
        System.out.println("  ✅ Crystal clear what each color is");
        System.out.println("  ✅ Self-documenting code");
        System.out.println("  ✅ Easy to add new variants");
        System.out.println("  ✅ Professional and readable");
        
        // COMPARISON
        System.out.println("\n3️⃣  COMPARISON");
        System.out.println("-".repeat(70));
        System.out.println("Aspect              | Bad        | Good");
        System.out.println("-".repeat(70));
        System.out.println("Clarity             | ❌ Unclear | ✅ Clear");
        System.out.println("Self-documenting    | ❌ No      | ✅ Yes");
        System.out.println("Easy to extend      | ❌ Hard    | ✅ Easy");
        System.out.println("Professional        | ❌ No      | ✅ Yes");
    }
}
