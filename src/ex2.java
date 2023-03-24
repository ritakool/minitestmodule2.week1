public class ex2 {
    public static int maxArr(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > arr[index]){
                index = i;
            }
        } return index;
    }
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] Array = {1,5,6,4,8,10,15,48,6,5};
        int index = maxArr(Array);
        int sum = sumArr(Array);
        System.out.println("Tong cac phan tu trong mang la : " + sum);
        System.out.println("Phan tu lon nhat trong mang la: " + Array[index]);
    }
}
