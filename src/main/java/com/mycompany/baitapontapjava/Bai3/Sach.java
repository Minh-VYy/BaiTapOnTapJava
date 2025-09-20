
package com.mycompany.baitapontapjava.Bai3;
class Sach extends TaiLieu {
    private String tenTacGia_350;
    private int soTrang_350;

    public Sach(String maTaiLieu_350, String tenNXB_350, int soBanPhatHanh_350,
                String tenTacGia_350, int soTrang_350) {
        super(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350);
        this.tenTacGia_350 = tenTacGia_350;
        this.soTrang_350 = soTrang_350;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tac gia: " + tenTacGia_350);
        System.out.println("So trang: " + soTrang_350);
    }
}
