package com.mycompany.baitapontapjava.Bai2;
public class CanBo {
     private String hoTen_332;
    private String ngaySinh_332;
    private String gioiTinh_332;
    private String diaChi_332;

    public CanBo() {}

    public CanBo(String hoTen_332, String ngaySinh_332, String gioiTinh_332, String diaChi_332) {
        this.hoTen_332 = hoTen_332;
        this.ngaySinh_332 = ngaySinh_332;
        this.gioiTinh_332 = gioiTinh_332;
        this.diaChi_332 = diaChi_332;
    }
    public String getHoTen_332() { return hoTen_332; }
    public void setHoTen_332(String hoTen_332) { this.hoTen_332 = hoTen_332; }

    public String getNgaySinh_332() { return ngaySinh_332; }
    public void setNgaySinh_332(String ngaySinh_332) { this.ngaySinh_332 = ngaySinh_332; }

    public String getGioiTinh_332() { return gioiTinh_332; }
    public void setGioiTinh_332(String gioiTinh_332) { this.gioiTinh_332 = gioiTinh_332; }

    public String getDiaChi_332() { return diaChi_332; }
    public void setDiaChi_332(String diaChi_332) { this.diaChi_332 = diaChi_332; }

    public void hienThiThongTin_332() {
        System.out.println("Ho ten: " + hoTen_332);
        System.out.println("Ngay sinh: " + ngaySinh_332);
        System.out.println("Gioi tinh: " + gioiTinh_332);
        System.out.println("Đia chi: " + diaChi_332);
    }
}
