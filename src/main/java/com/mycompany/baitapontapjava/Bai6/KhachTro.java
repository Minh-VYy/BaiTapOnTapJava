package com.mycompany.baitapontapjava.Bai6;
class KhachTro {
    private Nguoi nguoi_332;
    private int soNgayTro_332;
    private String loaiPhong_332;
    private double giaPhong_332;

    public KhachTro(Nguoi nguoi_332, int soNgayTro_332, String loaiPhong_332, double giaPhong_332) {
        this.nguoi_332 = nguoi_332;
        this.soNgayTro_332 = soNgayTro_332;
        this.loaiPhong_332 = loaiPhong_332;
        this.giaPhong_332 = giaPhong_332;
    }

    public String getCmnd_332() {
        return nguoi_332.getCmnd_332();
    }

    public double tinhTien() {
        return soNgayTro_332 * giaPhong_332;
    }

    public void hienThi() {
        nguoi_332.hienThi();
        System.out.println("So ngay tro: " + soNgayTro_332 + ", Loai phong: " + loaiPhong_332 + ", Gia phong/ngay: " + giaPhong_332);
    }
}

