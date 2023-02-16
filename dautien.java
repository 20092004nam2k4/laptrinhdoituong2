import java.util.Scanner;

public class dautien {
    public static void main(String[] args) {
        int number;
        int count = 1;
        int N = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        number = scanner.nextInt();
        if (number >= 1) {
            System.out.println(number +" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=number ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(N) ; j++ ){
                if (N%j == 0 ) {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 ) {
                System.out.println(N);
                i++;
            }
            count = 1;
            N++;
        }
        }
    }

