package com.mycompany.baitapontapjava.Bai6;
class Nguoi {
    private String hoTen_332;
    private String ngaySinh_332;
    private String cmnd_332;

    public Nguoi(String hoTen_332, String ngaySinh_332, String cmnd_332) {
        this.hoTen_332 = hoTen_332;
        this.ngaySinh_332 = ngaySinh_332;
        this.cmnd_332 = cmnd_332;
    }

    public String getCmnd_332() {
        return cmnd_332;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_332 + ", Ngay sinh: " + ngaySinh_332 + ", CMND: " + cmnd_332);
    }
}
