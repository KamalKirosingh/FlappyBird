package flappyBird;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird implements ActionListener {
    public static FlappyBird flappyBird;

    public final int WIDTH = 600, HEIGHT = 600;

    public Renderer renderer;

    public Random rand = new Random();

    public Rectangle bird = new Rectangle(WIDTH / 2-10, HEIGHT / 2 - 10, 20, 20);

    public ArrayList<Rectangle> columns = new ArrayList<>();

    public FlappyBird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);
        renderer = new Renderer();

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



    public void paintColumn(Graphics g, Rectangle column) {
        g.setColor(Color.GREEN.darker());
        g.fillRect(column.x, column.y, column.width, column.height);
    }

    public void repaint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.ORANGE);
        g.fillRect(0, HEIGHT - 120, WIDTH, 100);

        g.setColor(Color.GREEN);
        g.fillRect(0, HEIGHT - 120, WIDTH, 20);

        g.setColor(Color.RED);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);

    }
    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }
}
