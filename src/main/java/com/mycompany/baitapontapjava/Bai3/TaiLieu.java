package com.mycompany.baitapontapjava.Bai3;
class TaiLieu {
    private String maTaiLieu_332;
    private String tenNXB_332;
    private int soBanPhatHanh_332;

    public TaiLieu(String maTaiLieu_332, String tenNXB_332, int soBanPhatHanh_332) {
        this.maTaiLieu_332 = maTaiLieu_332;
        this.tenNXB_332 = tenNXB_332;
        this.soBanPhatHanh_332 = soBanPhatHanh_332;
    }

    public String getMaTaiLieu_332() { return maTaiLieu_332; }
    public void setMaTaiLieu_332(String maTaiLieu_332) { this.maTaiLieu_332 = maTaiLieu_332; }

    public String getTenNXB_332() { return tenNXB_332; }
    public void setTenNXB_332(String tenNXB_332) { this.tenNXB_332 = tenNXB_332; }

    public int getSoBanPhatHanh_332() { return soBanPhatHanh_332; }
    public void setSoBanPhatHanh_332(int soBanPhatHanh_332) { this.soBanPhatHanh_332 = soBanPhatHanh_332; }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu_332);
        System.out.println("Nha xuat ban: " + tenNXB_332);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_332);
    }
}
