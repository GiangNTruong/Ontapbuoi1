import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá
        //trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị
        //trung bình cộng của các phần tử trong mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu của mang 1 chieu");
        int count = Integer.parseInt(sc.nextLine());
        double[] arr = new double[count];
        double sum =0 ;
        System.out.println("Nhap gia tri tung phan tu vao trong mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu" + i + " : ");
            arr[i] = sc.nextDouble();
            sum +=arr[i];
        }
        double tbc = sum/count;
        System.out.println("TBC cuar mang là : " + tbc);
    }
}
