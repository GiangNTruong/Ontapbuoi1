import java.util.Scanner;

public class Bai7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//
//        System.out.println("Nhập giá trị cho các phần tử của mảng:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Phần tử thứ " + (i+1) + ": ");
//            array[i] = scanner.nextInt();
//        }
//
//        System.out.print("Nhập giá trị cần chèn (addValue): ");
//        int addValue = scanner.nextInt();
//        System.out.print("Nhập chỉ số cần chèn (addIndex): ");
//        int addIndex = scanner.nextInt();
//
//        int[] newArray;
//        if(addIndex >= 0 && addIndex <= n){
//            newArray = new int[n+1];
//            for (int i = 0; i < addIndex; i++) {
//                newArray[i] = array[i];
//            }
//            newArray[addIndex] = addValue;
//            for (int i = addIndex+1; i < n+1; i++) {
//                newArray[i] = array[i-1];
//            }
//        } else {
//            newArray = new int[addIndex+1];
//            for (int i = 0; i < n; i++) {
//                newArray[i] = array[i];
//            }
//            for (int i = n; i < addIndex; i++) {
//                newArray[i] = 0;
//            }
//            newArray[addIndex] = addValue;
//        }
//
//        array = newArray;
//        System.out.println("mảng sau khi chèn : ");
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//    }



    //7: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần

//tử của mảng 1 chiều số nguyên. Nhập giá trị (addValue) và chỉ số chèn

//phần tử vào mảng (addIndex), thực hiện thêm chèn giá trị addValue và chỉ

//số addIndex của mảng

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();

        }
        while (true) {
            System.out.print("Nhập giá trị cần chèn (addValue): ");
            int addValue = scanner.nextInt();
            System.out.print("Nhập chỉ số cần chèn (addIndex): ");
            int addIndex = scanner.nextInt();
            if (addIndex >= 0 && addIndex <= n) {
                int[] newArray = new int[n + 1];
                for (int i = 0; i < addIndex; i++) {
                    newArray[i] = array[i];
                    newArray[addIndex] = addValue;
                }
                for (int i = addIndex + 1; i < n + 1; i++) {
                    newArray[i] = array[i - 1];
                }
                array = newArray;
                System.out.println("mảng sau khi chèn : ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
                return;
            } else {

                System.out.println("Ngoài khoảng");
            }
        }
    }
}