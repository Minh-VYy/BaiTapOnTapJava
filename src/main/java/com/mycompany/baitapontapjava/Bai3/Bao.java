
package com.mycompany.baitapontapjava.Bai3;
class Bao extends TaiLieu {
    private String ngayPhatHanh_332;

    public Bao(String maTaiLieu_332, String tenNXB_332, int soBanPhatHanh_332,
               String ngayPhatHanh_332) {
        super(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332);
        this.ngayPhatHanh_332 = ngayPhatHanh_332;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " + ngayPhatHanh_332);
    }
}
