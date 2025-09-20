
package com.mycompany.baitapontapjava.Bai3;
class Bao extends TaiLieu {
    private String ngayPhatHanh_350;

    public Bao(String maTaiLieu_350, String tenNXB_350, int soBanPhatHanh_350,
               String ngayPhatHanh_350) {
        super(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350);
        this.ngayPhatHanh_350 = ngayPhatHanh_350;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " + ngayPhatHanh_350);
    }
}
