package com.mycompany.baitapontapjava.Bai4;
class ThiSinh {
    protected String sbd_350;
    protected String hoTen_350;
    protected String diaChi_350;
    protected String uuTien_350;

    public ThiSinh(String sbd_350, String hoTen_350, String diaChi_350, String uuTien_350) {
        this.sbd_350 = sbd_350;
        this.hoTen_350 = hoTen_350;
        this.diaChi_350 = diaChi_350;
        this.uuTien_350 = uuTien_350;
    }

    public String getSbd_350() {
        return sbd_350;
    }

    public void hienThi() {
        System.out.println("SBD: " + sbd_350 + ", Ho ten: " + hoTen_350 + 
                ", Đia chi: " + diaChi_350 + ", Uu tien: " + uuTien_350);
    }
}