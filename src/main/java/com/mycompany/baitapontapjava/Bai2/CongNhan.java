package com.mycompany.baitapontapjava.Bai2;
class CongNhan extends CanBo {
    private int bac_350; // bậc công nhân (1–7)

    public CongNhan(String hoTen_350, String ngaySinh_350, String gioiTinh_350, String diaChi_350, int bac_350) {
        super(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350);
        this.bac_350 = bac_350;
    }

    public int getBac_350() { return bac_350; }
    public void setBac_350(int bac_350) { this.bac_350 = bac_350; }

    @Override
    public void hienThiThongTin_350() {
        super.hienThiThongTin_350();
        System.out.println("Bac cong nhan: " + bac_350 + "/7");
    }
}
