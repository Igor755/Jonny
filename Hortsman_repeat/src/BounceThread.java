import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;


/**
 * Created by i.metlin on 30.06.2017.
 */
public class BounceThread {
    public static void main(String[] args) {
        JFrame frame = new BounceFrame2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class BallRunnable implements Runnable {
    public BallRunnable(Ball2 aBall, Component aComponent) {
        ball = aBall;
        component = aComponent;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= STEPS; i++) {
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e)
        {

        }
    }

    private Ball2 ball;
    private Component component;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

}

class Ball2
{
    public void move(Rectangle2D bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            dx = -dx;

        }
        if (x + XSIZE >= bounds.getMaxX()) {
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if (y < bounds.getMinY()) {
            y = bounds.getMinY();
            dy = -dy;
        }
        if (y + YSIZE >= bounds.getMaxY()) {
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }

    private static final int XSIZE = 15;
    private static final int YSIZE = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

}

class BallPanel2 extends JPanel
{

    public void add(Ball2 b) {

        balls.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball2 b : balls) {
            g2.fill(b.getShape());
        }
    }

    private ArrayList<Ball2> balls = new ArrayList<Ball2>();

}

class BounceFrame2 extends JFrame {
    public BounceFrame2() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("BounceThread");
        panel = new BallPanel2();
        add(panel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                addBall();
            }

        });
        addButton(buttonPanel, "Close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);

            }
        });
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addButton(Container c, String title,
                          ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);

    }

    public void addBall() {
        Ball2 b = new Ball2();
        panel.add(b);
        Runnable r = new BallRunnable(b, panel);
        Thread t = new Thread(r);
        t.start();
    }

    private BallPanel2 panel;
    public static final int DEFAULT_WIDTH = 450;
    public static final int DEFAULT_HEIGHT = 350;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;
}