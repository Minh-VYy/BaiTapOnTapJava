package com.mycompany.baitapontapjava.Bai3;
class TaiLieu {
    private String maTaiLieu_350;
    private String tenNXB_350;
    private int soBanPhatHanh_350;

    public TaiLieu(String maTaiLieu_350, String tenNXB_350, int soBanPhatHanh_350) {
        this.maTaiLieu_350 = maTaiLieu_350;
        this.tenNXB_350 = tenNXB_350;
        this.soBanPhatHanh_350 = soBanPhatHanh_350;
    }

    public String getMaTaiLieu_350() { return maTaiLieu_350; }
    public void setMaTaiLieu_350(String maTaiLieu_350) { this.maTaiLieu_350 = maTaiLieu_350; }

    public String getTenNXB_350() { return tenNXB_350; }
    public void setTenNXB_350(String tenNXB_350) { this.tenNXB_350 = tenNXB_350; }

    public int getSoBanPhatHanh_350() { return soBanPhatHanh_350; }
    public void setSoBanPhatHanh_350(int soBanPhatHanh_350) { this.soBanPhatHanh_350 = soBanPhatHanh_350; }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu_350);
        System.out.println("Nha xuat ban: " + tenNXB_350);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_350);
    }
}
