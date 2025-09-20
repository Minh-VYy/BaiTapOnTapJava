package com.mycompany.baitapontapjava.Bai2;
class KySu extends CanBo {
    private String nganhDaoTao_350;

    public KySu(String hoTen_350, String ngaySinh_350, String gioiTinh_350, String diaChi_350, String nganhDaoTao_350) {
        super(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350);
        this.nganhDaoTao_350 = nganhDaoTao_350;
    }

    public String getNganhDaoTao_350() 
    { 
        return nganhDaoTao_350; 
    }
    public void setNganhDaoTao_350(String nganhDaoTao_350) 
    { 
        this.nganhDaoTao_350 = nganhDaoTao_350; 
    }

    @Override
    public void hienThiThongTin_350() {
        super.hienThiThongTin_350();
        System.out.println("Nganh đao tao: " + nganhDaoTao_350);
    }
}
