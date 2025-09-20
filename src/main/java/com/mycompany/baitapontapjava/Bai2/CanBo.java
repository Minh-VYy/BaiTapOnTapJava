package com.mycompany.baitapontapjava.Bai2;
public class CanBo {
     private String hoTen_350;
    private String ngaySinh_350;
    private String gioiTinh_350;
    private String diaChi_350;

    public CanBo() {}

    public CanBo(String hoTen_350, String ngaySinh_350, String gioiTinh_350, String diaChi_350) {
        this.hoTen_350 = hoTen_350;
        this.ngaySinh_350 = ngaySinh_350;
        this.gioiTinh_350 = gioiTinh_350;
        this.diaChi_350 = diaChi_350;
    }
    public String getHoTen_350() { return hoTen_350; }
    public void setHoTen_350(String hoTen_350) { this.hoTen_350 = hoTen_350; }

    public String getNgaySinh_350() { return ngaySinh_350; }
    public void setNgaySinh_350(String ngaySinh_350) { this.ngaySinh_350 = ngaySinh_350; }

    public String getGioiTinh_350() { return gioiTinh_350; }
    public void setGioiTinh_350(String gioiTinh_350) { this.gioiTinh_350 = gioiTinh_350; }

    public String getDiaChi_350() { return diaChi_350; }
    public void setDiaChi_350(String diaChi_350) { this.diaChi_350 = diaChi_350; }

    public void hienThiThongTin_350() {
        System.out.println("Ho ten: " + hoTen_350);
        System.out.println("Ngay sinh: " + ngaySinh_350);
        System.out.println("Gioi tinh: " + gioiTinh_350);
        System.out.println("Đia chi: " + diaChi_350);
    }
}
