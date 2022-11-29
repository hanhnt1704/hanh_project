package org.example;

public class Bai9 {
    private int maSV;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;
    private double diemTrungBinh;

    public Bai9(int maSV, String hoTen,double diemLyThuyet, double diemThucHanh){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public void displayInformation() {
        System.out.print("MSV: " + maSV + " - Ho ten: " + hoTen + " - diemLT: " + diemLyThuyet + " - diemTH: " + diemThucHanh );
    }

    public double diemTrungBinh() {
//        this.diemLyThuyet;
//        this.diemThucHanh;
        this.diemTrungBinh = (this.diemLyThuyet + this.diemThucHanh)/2;
        return diemTrungBinh;
    }

    public void xepLoai() {

        if (diemTrungBinh< 5){
            System.out.println("Trung bình");
        }
        else if (diemTrungBinh< 7.9){
            System.out.println("Khá");
        }
        else if (diemTrungBinh <= 10 || diemTrungBinh > 8){
            System.out.println("Giỏi");
        }
    }


}
