import java.util.Scanner;

public class hinhhoc {
    public static void main(String[] args) {
         int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("số 1 là hình chữ nhật");
        System.out.println("số 2 là tam giác cân");
        System.out.println("số 3 là hình tam giác có góc vuông ở dưới");
        System.out.println("số 4 là hình tam giác có góc vuông ở trên");
        System.out.println("số 5 là thoát");
        System.out.println("nhập lựa chọn của bạn :");
        int nhap = sc.nextInt();
        if (nhap == 1) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } else if (nhap == 2) {
            for (int i = 1; i <= 5; ++i,k=0) {
                for (int nam = 1; nam <= 5 - i; ++nam) {
                    System.out.print("  ");
                }
                while (k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }
                System.out.println();
            }

        } else if (nhap == 3) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (nhap == 4) {
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
