import java.util.Scanner;

public class songuyento100 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n = 100;
        if (n >= 2) {
            System.out.print("các số nguyên tố nhỏ hơn 100 là : " +2);
        }
        for (int i = 3; i <= n; i+=2) {
            if (nam(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean nam(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int name = (int) Math.sqrt(n);
        for (int i = 2; i <= name; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}