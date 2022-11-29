package org.example;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        //sử dụng class Scanner để lấy dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        String n, m ;
        n = sc.nextLine();
        m = sc.nextLine();
        System.out.println(n.toUpperCase());
        System.out.println(m.toUpperCase());
        System.out.println("Đảo chuỗi");
        String word = new StringBuffer(n).reverse().toString();
        System.out.println("Chuỗi sau khi đảo:" + word );
        System.out.println("Đếm số kí tự: ");
        for (int i = 0; i < m.length(); i++){
            char s = m.charAt(i);

            int dem = 0;
            for (int j = 0; j <m.length(); j++){
                if (s == m.charAt(j)){
                    dem++;
                }
            }
            System.out.println(s + ":"+ dem);
        }
    }
}
