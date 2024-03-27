//2024.3.24
//by cjm

import java.util.Scanner;

public class InputMess {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入姓名(回车确认):");
        String name = reader.next();
        System.out.println("输入年龄(回车确认):");
        byte age = reader.nextByte();
        System.out.println("输入身高(回车确认):");
        float height = reader.nextFloat();
        System.out.printf("%28s\n", "--基本信息--");
        System.out.printf("%10s%-10s", "姓名:", name);
        System.out.printf("%4s%-4d", "年龄:", age);
        System.out.printf("%4s%-4.2f", "身高:", height);
        reader.close();
    }
}
