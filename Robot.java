import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Robot {
    public static final int TIME_IN_SECONDS = 60000;

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Robot robot = new Robot();
        Random random = new Random();
        int count = 0;

        while (true) {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();
            robot.mouseMove(random.nextInt(x+1), random.nextInt(y+1));
            robot.mouseMove(x, y);
            Thread.sleep(TIME_IN_SECONDS);
            count++;
        }
    }
}
