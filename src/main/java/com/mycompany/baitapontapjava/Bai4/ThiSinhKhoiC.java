package com.mycompany.baitapontapjava.Bai4;
class ThiSinhKhoiC extends ThiSinh {
    private final String khoi_332 = "Van, Su, Dia";

    public ThiSinhKhoiC(String sbd_332, String hoTen_332, String diaChi_332, String uuTien_332) {
        super(sbd_332, hoTen_332, diaChi_332, uuTien_332);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Khoi C - Mon thi: " + khoi_332);
    }
}