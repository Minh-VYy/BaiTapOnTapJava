package com.mycompany.baitapontapjava.Bai3;
class TapChi extends TaiLieu {
    private int soPhatHanh_350;
    private int thangPhatHanh_350;

    public TapChi(String maTaiLieu_350, String tenNXB_350, int soBanPhatHanh_350,
                  int soPhatHanh_350, int thangPhatHanh_350) {
        super(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350);
        this.soPhatHanh_350 = soPhatHanh_350;
        this.thangPhatHanh_350 = thangPhatHanh_350;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh_350);
        System.out.println("Thang phat hanh: " + thangPhatHanh_350);
    }
}

