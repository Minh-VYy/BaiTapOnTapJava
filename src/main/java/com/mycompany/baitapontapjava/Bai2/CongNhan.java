package com.mycompany.baitapontapjava.Bai2;
class CongNhan extends CanBo {
    private int bac_332; // bậc công nhân (1–7)

    public CongNhan(String hoTen_332, String ngaySinh_332, String gioiTinh_332, String diaChi_332, int bac_332) {
        super(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332);
        this.bac_332 = bac_332;
    }

    public int getBac_332() { return bac_332; }
    public void setBac_332(int bac_332) { this.bac_332 = bac_332; }

    @Override
    public void hienThiThongTin_332() {
        super.hienThiThongTin_332();
        System.out.println("Bac cong nhan: " + bac_332 + "/7");
    }
}
