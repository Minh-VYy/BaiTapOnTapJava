package com.mycompany.baitapontapjava.Bai4;
class ThiSinhKhoiA extends ThiSinh {
    private final String khoi_350 = "Toan, Ly, Hoa";

    public ThiSinhKhoiA(String sbd_350, String hoTen_350, String diaChi_350, String uuTien_350) {
        super(sbd_350, hoTen_350, diaChi_350, uuTien_350);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Khoi A - Mon thi: " + khoi_350);
    }
}