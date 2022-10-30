import java.util.Scanner;

public class RectangleArea {
    double yusufPole, yusufA, yusufB;

    private void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mr.karabudak: Enter the length of the first side of the rectangle:");
        yusufA = scanner.nextDouble();
        System.out.println("Mr.karabudak: Enter the length of the other side of the rectangle:");
        yusufB = scanner.nextDouble();

    }

    private void computerField() {
        yusufPole = yusufA * yusufB;
    }

    public void fieldybkDisplay() {
        getData();
        computerField();
        System.out.println("Pole prostoką:" + yusufPole);
    }
}