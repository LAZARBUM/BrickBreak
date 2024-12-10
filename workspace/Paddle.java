import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
    private int x, y, width, height;
    private int velocity = 0;

    // Steve Thomas
    // December 5th, 2024
    // This class represents a Paddle in a game with position, size, and velocity. It includes methods to move and draw the paddle.
    
    // Constructor
    // Pre-condition: x, y, width, and height must be provided to initialize the paddle's position and size.
    // Post-condition: A new paddle object is created with the specified position and size.
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Get the paddle's X position
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: Returns the X coordinate of the paddle.
    public int getX() {
        return x;
    }

    // Get the paddle's Y position
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: Returns the Y coordinate of the paddle.
    public int getY() {
        return y;
    }

    // Get the paddle's width
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: Returns the width of the paddle.
    public int getWidth() {
        return width;
    }

    // Get the paddle's height
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: Returns the height of the paddle.
    public int getHeight() {
        return height;
    }

    // Get the paddle's velocity
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: returns the current velocity of the paddle.
    public int getVelocity() {
        return velocity;
    }

    // Set the paddle's X position
    // Pre-condition: X must be a valid integer within the screen's widh.
    // Post-condition: The paddle's X position is updated to the specified value.
    public void setX(int x) {
        this.x = x;
    }

    // Set the paddle's velocity
    // Pre-condition: velocity must be an integer value.
    // Post-condition: The paddles velocity is updated.
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    // Increase the paddle's velocity
    // Pre-condition: increment must be a valid integer.
    // Post-condition: The paddle's velocity is increased by the specified value.
    public void addVelocity(int increment) {
        this.velocity += increment;
    }

    // Move the paddle
    // Pre-condition: the paddle object must be instntiated and initialized with position and velocity.
    // Post-condition: The paddle's position is updated based on its velocity and it stays within the screen bounds.
    public void move() {
        x += velocity;

        // ensures paddle doesn't go off the screen
        if (x < 0) x = 0;
        if (x + width > 682) x = 682 - width; // Assuming screen width is 682
    }

    // draw the paddle on the screen
    // Pre-condition: The paddle object must be instantiated.
    // Post-condition: The paddle is drawn at its current position with the specified width, height, and color.
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
}
