//2024.3.31
//by cjm

import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String args[]) {
        Random rand = new Random();
        int num = rand.nextInt(101);
        int ans = 0;
        Scanner reader = new Scanner(System.in);
        while (ans != num) {
            ans = reader.nextInt();
            if (ans > num) {
                System.out.println("猜大了,再输入你的猜测");
            }
            if (ans < num) {
                System.out.println("猜小了,再输入你的猜测");
            }
            if (ans == num) {
                System.out.println("猜对了!");
            }
        }
        reader.close();
    }
}
