import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("số tiền gửi :");
        money = sc.nextDouble();

        System.out.println("nhập tháng cần tính : ");
        month = sc.nextInt();

        System.out.println("nhập số lại % : ");
        interestRate = sc.nextDouble();

        double tonglai = 0;
        for (int i = 0; i < month; i++) {
            tonglai += money * (interestRate/100)/12 * month;
        }
        System.out.printf("tong lai =" + tonglai);
    }
}
