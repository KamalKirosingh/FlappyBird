package flappyBird;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FlappyBird implements ActionListener {
    public static FlappyBird flappyBird;
    public final int WIDTH = 800, HEIGHT = 800;
    public Renderer renderer = new Renderer();

    public FlappyBird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        jframe.add(renderer);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setTitle("Flappy Bird");
        jframe.setResizable(false);
        jframe.setVisible(true);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }

    public void repaint(Graphics g) {

    }
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }
}
