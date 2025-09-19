package com.mycompany.baitapontapjava.Bai2;
class NhanVien extends CanBo {
    private String congViec_332;

    public NhanVien(String hoTen_332, String ngaySinh_332, String gioiTinh_332, String diaChi_332, String congViec_332) {
        super(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332);
        this.congViec_332 = congViec_332;
    }

    public String getCongViec_332() { return congViec_332; }
    public void setCongViec_332(String congViec_332) { this.congViec_332 = congViec_332; }

    @Override
    public void hienThiThongTin_332() {
        super.hienThiThongTin_332();
        System.out.println("Cong viec: " + congViec_332);
    }
}
