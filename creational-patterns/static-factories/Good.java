package com.example.patterns.sf;

/**
 * ✅ GOOD: Using Static Factory Methods
 * 
 * Benefits:
 * - Clear, meaningful method names
 * - Self-documenting code
 * - Easy to add new variants
 * - Implementation is hidden
 */
public class Good {
    private final int red, green, blue;
    
    private Good(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    // ✅ Static factories - clear names
    public static Good red() { return new Good(255, 0, 0); }
    public static Good green() { return new Good(0, 255, 0); }
    public static Good blue() { return new Good(0, 0, 255); }
    public static Good white() { return new Good(255, 255, 255); }
    public static Good black() { return new Good(0, 0, 0); }
    public static Good fromRGB(int r, int g, int b) { return new Good(r, g, b); }
    
    public String getColor() {
        return String.format("RGB(%d, %d, %d)", red, green, blue);
    }
}
