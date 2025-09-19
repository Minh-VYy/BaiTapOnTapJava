package com.mycompany.baitapontapjava.Bai4;
class ThiSinh {
    protected String sbd_332;
    protected String hoTen_332;
    protected String diaChi_332;
    protected String uuTien_332;

    public ThiSinh(String sbd_332, String hoTen_332, String diaChi_332, String uuTien_332) {
        this.sbd_332 = sbd_332;
        this.hoTen_332 = hoTen_332;
        this.diaChi_332 = diaChi_332;
        this.uuTien_332 = uuTien_332;
    }

    public String getSbd_332() {
        return sbd_332;
    }

    public void hienThi() {
        System.out.println("SBD: " + sbd_332 + ", Ho ten: " + hoTen_332 + 
                ", Đia chi: " + diaChi_332 + ", Uu tien: " + uuTien_332);
    }
}