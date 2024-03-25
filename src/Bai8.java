import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        //Bài 8: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
        //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số phần
        //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
        //phần tử có chỉ số updateIndex
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng (n)");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        //Giá trị mảng
        System.out.println("Nhập giá trị mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Phẩn tử thứ " + (i+1)+" : " );
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập giá trị sửa(updateValue): ");
        int updateValue = scanner.nextInt();
        System.out.print("Nhập chỉ số cần sửa (updateIndex): ");
        int updateIndex = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(updateIndex == i){
                arr[i] = updateValue;
            }
        }
        for (int value : arr){
            System.out.println(value + " ");
        }



    }
}
