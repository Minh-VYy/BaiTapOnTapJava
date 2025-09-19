package com.mycompany.baitapontapjava.Bai2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLyCanBo {
    private List<CanBo> danhSachCanBo_332 = new ArrayList<>();
    private Scanner sc_332 = new Scanner(System.in);
    public void nhapCanBo_332() {
        System.out.println("Chon loai can bo: 1. Cong nhan | 2. Ky su | 3. Nhan vien");
        int chon_332 = Integer.parseInt(sc_332.nextLine());
        System.out.print("Họ ten: ");
        String hoTen_332 = sc_332.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh_332 = sc_332.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh_332 = sc_332.nextLine();
        System.out.print("Đia chi: ");
        String diaChi_332 = sc_332.nextLine();
        switch (chon_332) {
            case 1:
                System.out.print("Nhap bac cong nhan (1-7): ");
                int bac_332 = Integer.parseInt(sc_332.nextLine());
                danhSachCanBo_332.add(new CongNhan(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332, bac_332));
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao_332 = sc_332.nextLine();
                danhSachCanBo_332.add(new KySu(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332, nganhDaoTao_332));
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec_332 = sc_332.nextLine();
                danhSachCanBo_332.add(new NhanVien(hoTen_332, ngaySinh_332, gioiTinh_332, diaChi_332, congViec_332));
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
    public void timKiemTheoTen_332(String ten_332) {
        boolean found_332 = false;
        for (CanBo cb_332 : danhSachCanBo_332) {
            if (cb_332.getHoTen_332().equalsIgnoreCase(ten_332)) {
                cb_332.hienThiThongTin_332();
                found_332 = true;
            }
        }
        if (!found_332) {
            System.out.println("Khong tim thay can bo co ten: " + ten_332);
        }
    }
    public void hienThiTatCa_332() {
        for (CanBo cb_332 : danhSachCanBo_332) {
            cb_332.hienThiThongTin_332();
            System.out.println("------------------");
        }
    }
}

