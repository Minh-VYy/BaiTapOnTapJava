package com.mycompany.baitapontapjava.Bai5;
import java.time.LocalDate;
class Nguoi {
    private String hoTen_350;
    private int namSinh_350;
    private String ngheNghiep_350;

    public Nguoi(String hoTen_350, int namSinh_350, String ngheNghiep_350) {
        this.hoTen_350 = hoTen_350;
        this.namSinh_350 = namSinh_350;
        this.ngheNghiep_350 = ngheNghiep_350;
    }

    public int getTuoi() {
        int namHienTai_350 = LocalDate.now().getYear();
        return namHienTai_350 - namSinh_350;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_350 + ", Nam sinh: " + namSinh_350 +
                           ", Nghe nghiep: " + ngheNghiep_350 + ", Tuoi: " + getTuoi());
    }
}
