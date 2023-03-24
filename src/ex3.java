import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
    int[] Arra;
    int size;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang: ");
        size = sc.nextInt();
        Arra = new int[size];
        while (i < size){
            System.out.println("Nhap phan tu thu " + (i +1) + " : ");
            Arra[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mang vua nhap: " + Arrays.toString(Arra));
    }
}
