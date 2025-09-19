
package com.mycompany.baitapontapjava.Bai3;
class Sach extends TaiLieu {
    private String tenTacGia_332;
    private int soTrang_332;

    public Sach(String maTaiLieu_332, String tenNXB_332, int soBanPhatHanh_332,
                String tenTacGia_332, int soTrang_332) {
        super(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332);
        this.tenTacGia_332 = tenTacGia_332;
        this.soTrang_332 = soTrang_332;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tac gia: " + tenTacGia_332);
        System.out.println("So trang: " + soTrang_332);
    }
}
