
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

class CharecterheightWidth{

     public static void main(String[] args) {
        
        // Create a dummy image to get a Graphics2D context
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();

        // Set the font
        Font font = new Font("Arial", Font.PLAIN, 16);
        g2d.setFont(font);

        // Get FontMetrics for the font
        FontMetrics metrics = g2d.getFontMetrics();

        // Character to measure
        char character = 'i';

        // Get width and height
        int charWidth = metrics.charWidth(character);
        int charHeight = metrics.getHeight();

        // Output the results
        System.out.println("Character: " + character);
        System.out.println("Width: " + charWidth);
        System.out.println("Height: " + charHeight);

        // Clean up
        g2d.dispose();


    }
}

// class testfont extends JPanel{

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);

//         // Set the font
//         Font font = new Font("Arial", Font.PLAIN, 24);
//         g.setFont(font);

//         // Get the FontMetrics object for the current font
//         FontMetrics metrics = g.getFontMetrics();

//         // Character to measure
//         char character = 'A';

//         // Get the width and height of the character
//         int charWidth = metrics.charWidth(character);
//         int charHeight = metrics.getHeight();

//         // Display the dimensions
//         g.drawString("Character: " + character, 20, 40);
//         g.drawString("Width: " + charWidth, 20, 70);
//         g.drawString("Height: " + charHeight, 20, 100);
// }
// }