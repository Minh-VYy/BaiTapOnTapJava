package com.mycompany.baitapontapjava.Bai2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLyCanBo {
    private List<CanBo> danhSachCanBo_350 = new ArrayList<>();
    private Scanner sc_350 = new Scanner(System.in);
    public void nhapCanBo_350() {
        System.out.println("Chon loai can bo: 1. Cong nhan | 2. Ky su | 3. Nhan vien");
        int chon_350 = Integer.parseInt(sc_350.nextLine());
        System.out.print("Họ ten: ");
        String hoTen_350 = sc_350.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh_350 = sc_350.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh_350 = sc_350.nextLine();
        System.out.print("Đia chi: ");
        String diaChi_350 = sc_350.nextLine();
        switch (chon_350) {
            case 1:
                System.out.print("Nhap bac cong nhan (1-7): ");
                int bac_350 = Integer.parseInt(sc_350.nextLine());
                danhSachCanBo_350.add(new CongNhan(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350, bac_350));
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao_350 = sc_350.nextLine();
                danhSachCanBo_350.add(new KySu(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350, nganhDaoTao_350));
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec_350 = sc_350.nextLine();
                danhSachCanBo_350.add(new NhanVien(hoTen_350, ngaySinh_350, gioiTinh_350, diaChi_350, congViec_350));
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
    public void timKiemTheoTen_350(String ten_350) {
        boolean found_350 = false;
        for (CanBo cb_350 : danhSachCanBo_350) {
            if (cb_350.getHoTen_350().equalsIgnoreCase(ten_350)) {
                cb_350.hienThiThongTin_350();
                found_350 = true;
            }
        }
        if (!found_350) {
            System.out.println("Khong tim thay can bo co ten: " + ten_350);
        }
    }
    public void hienThiTatCa_350() {
        for (CanBo cb_350 : danhSachCanBo_350) {
            cb_350.hienThiThongTin_350();
            System.out.println("------------------");
        }
    }
}

