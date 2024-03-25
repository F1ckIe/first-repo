//2024.3.24
//by cjm

public class E {
    public static void main(String args[]) {
        char ch = '研', zifu = 0;
        int p = 22920, count = 5, position = 0;
        System.out.printf("输出%d个石字傍的汉字:\n", count);
        for (char c = ch; c <= ch + count; c++) {
            position = (int) c;
            System.out.printf("%c(%d)", c, position);
        }
        System.out.printf("\n输出%d个女字傍的汉字:\n", count);
        for (int n = p; n <= p + count; n++) {
            zifu = (char) n;
            System.out.printf("%c(%d)", zifu, n);
        }
    }
}