import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GravityBallSimulation extends JPanel {
    // frame properties
    static JFrame frame;
    static int frameWidth = 500;
    static int frameHeight = 500;
    static boolean frameResizable = false;
    static boolean frameOpaque = true;
    static String frameTitle = "Gravity Ball Simulation";
    static boolean frameVisible = true;

    // ball properties
    static int bx = 220;
    static int by = 30;
    static int bw = 50;
    static int bh = 50;

    // timer properties
    static Timer timer;
    static int timerDelay = 15;

    // physics properties
    static double g = 9.8;
    static double cor = 0.6;
    static double vy = 0.0;

    // color properties
    static int[] blackColor = { 0, 0, 0 };
    static int[] whiteColor = { 255, 255, 255 };
    static int[] colorGrey = { 211, 211, 211 };

    public static void main(String args[]) {
        frame = new JFrame(frameTitle);
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(frameResizable);
        GravityBallSimulation panel = new GravityBallSimulation();
        panel.setBounds(0, 0, frameWidth, frameHeight);
        panel.setBackground(new Color(blackColor[0], blackColor[1], blackColor[2]));
        frame.add(panel);
        frame.setVisible(frameVisible);

        timer = new Timer(timerDelay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                collisionCheck();
                updatePostion();
                panel.repaint();
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(colorGrey[0], colorGrey[1], colorGrey[2]));
        g.fillOval(bx, by, bw, bh);
        g.drawOval(bx, by, bw, bh);
    }

    private static void updatePostion() {
        vy += g;
        by += vy;
    }

    private static void collisionCheck() {
        if (by >= 400) {
            by = 400;
            vy = -vy * cor;
        }
    }
}
