import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x, y, size;
    private int xVelocity = 1, yVelocity = -2;

    // Steve Thomas
    // Dec. 05th, 2024
    // This class represents a Ball in a game with position, size, and velocity. It includes methods to move and draw the ball.
    
    // Constructor
    // Pre-condition: x, y, and size must be provided to initialize the ball's position and size.
    // Post-condition: A new ball object is created with the specified position and size.
    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    // Get the ball's X position
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: Returns the X coordinate of the ball.
    public int getXpos() {
        return x;
    }

    // Get the ball's Y position
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: Returns the Y coordinate of the ball.
    public int getYpos() {
        return y;
    }

    // Get the ball's size
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: Returns the size of the ball.
    public int getSize() {
        return size;
    }

    // Set the ball's X position
    // Pre-condition: x must be a valid integer within the screen's width.
    // Post-condition: The ball's X position is updated to the specified value.
    public void setX(int x) {
        this.x = x;
    }

    // Set the ball's Y position
    // Pre-condition: y must be a valid integer within the screen's height.
    // Post-condition: The ball's Y position is updated to the specified value.
    public void setY(int y) {
        this.y = y;
    }

    // Set the ball's X velocity
    // Pre-condition: xVelocity must be provided.
    // Post-condition: The ball's X velocity is updated.
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    // Set the ball's Y velocity
    // Pre-condition: yVelocity must be provided.
    // Post-condition: The ball's Y velocity is updated.
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    // Reverse the ball's X velocity
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: The ball's X velocity is reversed.
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    // Reverse the ball's Y velocity
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: The ball's Y velocity is reversed.
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Move the ball
    // Pre-condition: The ball object must be instantiated and initialized with position and velocity.
    // Post-condition: The ball's position is updated based on its velocity.
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Draw the ball on the screen
    // Pre-condition: The ball object must be instantiated.
    // Post-condition: The ball is drawn at its current position with the specified size and color.
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, size, size);
    }
}
