//2024.3.24
//by cjm

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please input wide:");
        Double width = reader.nextDouble();
        System.out.println("please input height:");
        Double height = reader.nextDouble();
        Double area = width * height;
        System.out.printf("%10s%-10.2f", "wide:", width);
        System.out.printf("%4s%-4.2f", "height:", height);
        System.out.printf("%4s%-4.2f", "\narea:", area);
    }
}
