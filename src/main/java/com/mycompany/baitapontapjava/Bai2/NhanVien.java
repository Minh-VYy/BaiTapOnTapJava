package com.mycompany.baitapontapjava.Bai2;
class NhanVien extends CanBo {
    private String congViec_350;

    public NhanVien(String hoTen_350, String ngaySinh_350, String gioiTinh_350, String diaChi_350, String congViec_350) {
        super(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350);
        this.congViec_350 = congViec_350;
    }

    public String getCongViec_350() { return congViec_350; }
    public void setCongViec_350(String congViec_350) { this.congViec_350 = congViec_350; }

    @Override
    public void hienThiThongTin_350() {
        super.hienThiThongTin_350();
        System.out.println("Cong viec: " + congViec_350);
    }
}
