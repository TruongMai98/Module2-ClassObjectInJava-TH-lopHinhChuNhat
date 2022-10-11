import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double width = scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double height = scanner.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println("Hinh chua nhat \n" + rect.display());
        System.out.println("dien tich hinh chu nhat la: " + rect.getArea());
        System.out.println("chu vi hinh chu nhat la: " + rect.getPerimeter());
    }
}
