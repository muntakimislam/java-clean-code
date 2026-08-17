package com.example.patterns.sf;

/**
 * ❌ BAD: Using Public Constructors
 * 
 * Problems:
 * - Unclear what Color(255, 0, 0) represents
 * - Must remember RGB order
 * - Can't add named variants
 * - No flexibility
 */
public class Bad {
    private final int red, green, blue;
    
    public Bad(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public String getColor() {
        return String.format("RGB(%d, %d, %d)", red, green, blue);
    }
}
