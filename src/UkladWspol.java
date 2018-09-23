import java.util.Scanner;

public class UkladWspol {

   double x;
   double y;

    public UkladWspol() {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX() {
        System.out.println("Podaj punkt X:");
        Scanner scanner = new Scanner(System.in);
        this.x = scanner.nextDouble();
    }

    public void setY() {
        System.out.println("Podaj punkt Y:");
        Scanner scanner = new Scanner(System.in);
        this.y = scanner.nextDouble();
    }
}
