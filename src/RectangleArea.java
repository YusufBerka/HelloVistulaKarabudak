import java.util.Scanner;

public class RectangleArea {
    double yusufArea, yusufA, yusufB;

    private void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mr.karabudak: Enter the length of the long side of the rectangle:");
        yusufA = scanner.nextDouble();
        System.out.println("Mr.karabudak:Enter the length of the short side of the rectangle :");
        yusufB = scanner.nextDouble();

    }

    private void computerField() {
        yusufArea = yusufA * yusufB;
    }

    public void fieldybkDisplay() {
        getData();
        computerField();
        System.out.println("Mr.karabudak : area of this rectangle:" + yusufArea);
    }
}