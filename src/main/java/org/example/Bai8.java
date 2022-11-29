package org.example;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n,m, i;
        System.out.println("Số phần tử của mảng 1:");
        Scanner sc = new Scanner(System.in);
        // sc.nextInt() Hàm giúp get số nhé, với trường hợp lấy giá trị là chuỗi thì sẽ dùng nextLine()
        n = sc.nextInt();
        System.out.println("Số phần tử của mảng 2:");
        m = sc.nextInt();
        //khai báo mảng
        System.out.println("phần tử của mảng 1");
        int[] arr1 = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("phần tử " + i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("phần tử của mảng 2");
        int[] arr2 = new int[m];
        for (i = 0; i < m; i++) {
            System.out.println("phần tử " + i);
            arr2[i] = sc.nextInt();
        }
// sắp xếp giảm dần

        for (i = 0; i < n - 1; i++) {
            int j;
            int temp = arr1[0];
            int temp1 = arr2[0];
            for (i = 0; i < arr1.length - 1; i++) {
                for (j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] < arr1[j]) {
                        temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                }
            }
            for (i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " "+"\n" );

            }
            for (i = 0; i < arr2.length - 1; i++) {
                for (j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] < arr2[j]) {
                        temp1 = arr2[j];
                        arr2[j] = arr2[i];
                        arr2[i] = temp1;
                    }
                }
            }
        }
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
