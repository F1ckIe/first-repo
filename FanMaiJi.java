//2024.3.30
//by cjm

import java.util.Scanner;

class jizi {
    int money, type;

    void setMeneyType(int m, int n) {
        money = m;
        type = n;
    }
}

public class FanMaiJi {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        jizi yinLiaoJi = new jizi();
        yinLiaoJi.money = reader.nextInt();
        if (yinLiaoJi.money == 2) {
            System.out.println("选择净净矿泉水(1),甜甜矿泉水(2)和美美矿泉水(3)之一 ");
            yinLiaoJi.type = reader.nextInt();
            if (yinLiaoJi.type == 1) {
                System.out.println("净净矿泉水");
            }
            if (yinLiaoJi.type == 1) {
                System.out.println("甜甜矿泉水");
            }
            if (yinLiaoJi.type == 3) {
                System.out.println("美美矿泉水");
            }
        }
        if (yinLiaoJi.money == 3) {
            System.out.println("选择爽口可乐(1),清凉雪碧(2)和雪山果汁(3)之一 ");
            yinLiaoJi.type = reader.nextInt();
            if (yinLiaoJi.type == 1) {
                System.out.println("爽口可乐");
            }
            if (yinLiaoJi.type == 2) {
                System.out.println("清凉雪碧");
            }
            if (yinLiaoJi.type == 3) {
                System.out.println("雪山果汁");
            }
        }
        reader.close();
    }
}
