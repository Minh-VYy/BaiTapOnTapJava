package com.mycompany.baitapontapjava.Bai3;
class TapChi extends TaiLieu {
    private int soPhatHanh_332;
    private int thangPhatHanh_332;

    public TapChi(String maTaiLieu_332, String tenNXB_332, int soBanPhatHanh_332,
                  int soPhatHanh_332, int thangPhatHanh_332) {
        super(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332);
        this.soPhatHanh_332 = soPhatHanh_332;
        this.thangPhatHanh_332 = thangPhatHanh_332;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh_332);
        System.out.println("Thang phat hanh: " + thangPhatHanh_332);
    }
}

