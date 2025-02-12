import javax.swing.*;
import java.awt.*;

 class GraphicsSwingDemo extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("hi hello", 50, 50);
        g.drawLine(200000000, 30, 20, 300);
        g.drawRect(700, 100, 30, 30);
        g.fillRect(1700, 100, 30, 30);
        g.drawOval(70, 200, 30, 30);
        
        g.setColor(Color.pink);
        g.fillOval(170, 200, 30, 30);
        g.drawArc(90, 150, 30, 30, 30, 270);
        g.fillArc(270, 150, 30, 30, 0, 180);
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GraphicsSwingDemo());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
