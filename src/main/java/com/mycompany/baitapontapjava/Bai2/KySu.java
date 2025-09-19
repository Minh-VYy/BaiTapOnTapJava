package com.mycompany.baitapontapjava.Bai2;
class KySu extends CanBo {
    private String nganhDaoTao_332;

    public KySu(String hoTen_332, String ngaySinh_332, String gioiTinh_332, String diaChi_332, String nganhDaoTao_332) {
        super(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332);
        this.nganhDaoTao_332 = nganhDaoTao_332;
    }

    public String getNganhDaoTao_332() 
    { 
        return nganhDaoTao_332; 
    }
    public void setNganhDaoTao_332(String nganhDaoTao_332) 
    { 
        this.nganhDaoTao_332 = nganhDaoTao_332; 
    }

    @Override
    public void hienThiThongTin_332() {
        super.hienThiThongTin_332();
        System.out.println("Nganh đao tao: " + nganhDaoTao_332);
    }
}
