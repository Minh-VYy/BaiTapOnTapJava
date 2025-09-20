package com.mycompany.baitapontapjava.Bai4;
class ThiSinhKhoiC extends ThiSinh {
    private final String khoi_350 = "Van, Su, Dia";

    public ThiSinhKhoiC(String sbd_350, String hoTen_350, String diaChi_350, String uuTien_350) {
        super(sbd_350, hoTen_350, diaChi_350, uuTien_350);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Khoi C - Mon thi: " + khoi_350);
    }
}