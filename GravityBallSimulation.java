import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GravityBallSimulation extends JPanel {
    // frame properties
    static JFrame frame;
    static int frameHeight = 500;
    static boolean frameResizable = false;
    static boolean frameOpaque = true;
    static String frameTitle = "Gravity Ball Simulation";
    static boolean frameVisible = true;
    static int frameWidth = 500;

    // ball properties
    static int bx = 500;
    static int by = 100;
    static int bw = 50;
    static int bh = 50;

    // floor properties
    static JLabel floor;
    static int floorWidth = frameWidth;
    static int floorHeight = 20;
    static int floorX = 0;
    static int floorY = 450;

    // timer properties
    static Timer timer;
    static int timerDelay = 10;

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
        frame.getContentPane().setBackground(new Color(blackColor[0], blackColor[1], blackColor[2]));
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(frameResizable);
        GravityBallSimulation panel = new GravityBallSimulation();
        floor = new JLabel();
        floor.setBounds(floorX, floorY, floorWidth, floorHeight);
        floor.setBackground(new Color(whiteColor[0], whiteColor[1], whiteColor[2]));
        floor.setOpaque(frameOpaque);
        frame.add(floor);
        frame.add(panel);
        frame.setVisible(frameVisible);

        timer = new Timer(timerDelay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                collisionCheck();
                updatePostion();
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
    }

    private static void collisionCheck() {
    }
}