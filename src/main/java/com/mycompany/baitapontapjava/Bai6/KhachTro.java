package com.mycompany.baitapontapjava.Bai6;
class KhachTro {
    private Nguoi nguoi_350;
    private int soNgayTro_350;
    private String loaiPhong_350;
    private double giaPhong_350;

    public KhachTro(Nguoi nguoi_350, int soNgayTro_350, String loaiPhong_350, double giaPhong_350) {
        this.nguoi_350 = nguoi_350;
        this.soNgayTro_350 = soNgayTro_350;
        this.loaiPhong_350 = loaiPhong_350;
        this.giaPhong_350 = giaPhong_350;
    }

    public String getCmnd_350() {
        return nguoi_350.getCmnd_350();
    }

    public double tinhTien() {
        return soNgayTro_350 * giaPhong_350;
    }

    public void hienThi() {
        nguoi_350.hienThi();
        System.out.println("So ngay tro: " + soNgayTro_350 + ", Loai phong: " + loaiPhong_350 + ", Gia phong/ngay: " + giaPhong_350);
    }
}

