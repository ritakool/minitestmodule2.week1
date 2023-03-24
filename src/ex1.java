import java.util.Scanner;

public class ex1 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        int i = 0;
        while (i < n){
            if (isPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}
