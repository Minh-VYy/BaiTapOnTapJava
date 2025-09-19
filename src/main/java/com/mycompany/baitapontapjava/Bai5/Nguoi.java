package com.mycompany.baitapontapjava.Bai5;
import java.time.LocalDate;
class Nguoi {
    private String hoTen_332;
    private int namSinh_332;
    private String ngheNghiep_332;

    public Nguoi(String hoTen_332, int namSinh_332, String ngheNghiep_332) {
        this.hoTen_332 = hoTen_332;
        this.namSinh_332 = namSinh_332;
        this.ngheNghiep_332 = ngheNghiep_332;
    }

    public int getTuoi() {
        int namHienTai_332 = LocalDate.now().getYear();
        return namHienTai_332 - namSinh_332;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_332 + ", Nam sinh: " + namSinh_332 +
                           ", Nghe nghiep: " + ngheNghiep_332 + ", Tuoi: " + getTuoi());
    }
}
