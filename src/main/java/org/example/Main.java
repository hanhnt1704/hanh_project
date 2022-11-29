package org.example;

public class Main {
    public static void main(String[] args) {
        Bai9 sv1 = new Bai9(1,"HanhENT",2.2,10);
        sv1.diemTrungBinh();
        sv1.displayInformation();
        System.out.print(" - diemTB: " + sv1.diemTrungBinh() + " - Xep loai: ");
        sv1.xepLoai();

    }
}