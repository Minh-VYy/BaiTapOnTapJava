package com.mycompany.baitapontapjava.Bai6;
class Nguoi {
    private String hoTen_350;
    private String ngaySinh_350;
    private String cmnd_350;

    public Nguoi(String hoTen_350, String ngaySinh_350, String cmnd_350) {
        this.hoTen_350 = hoTen_350;
        this.ngaySinh_350 = ngaySinh_350;
        this.cmnd_350 = cmnd_350;
    }

    public String getCmnd_350() {
        return cmnd_350;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_350 + ", Ngay sinh: " + ngaySinh_350 + ", CMND: " + cmnd_350);
    }
}
