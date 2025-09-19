
package com.mycompany.baitapontapjava.Bai3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu_332 = new ArrayList<>();
    private Scanner sc_332 = new Scanner(System.in);

    // Nhập thông tin tài liệu
    public void nhapTaiLieu() {
        System.out.println("Chon loai tai lieu: 1. Sach | 2. Tap chi | 3. Bao");
        int loai_332 = Integer.parseInt(sc_332.nextLine());

        System.out.print("Ma tai lieu: ");
        String maTaiLieu_332 = sc_332.nextLine();
        System.out.print("Nha xuat ban: ");
        String tenNXB_332 = sc_332.nextLine();
        System.out.print("So ban phat hanh: ");
        int soBanPhatHanh_332 = Integer.parseInt(sc_332.nextLine());

        switch (loai_332) {
            case 1:
                System.out.print("Ten tac gia: ");
                String tenTacGia_332 = sc_332.nextLine();
                System.out.print("So trang: ");
                int soTrang_332 = Integer.parseInt(sc_332.nextLine());
                danhSachTaiLieu_332.add(new Sach(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332, tenTacGia_332, soTrang_332));
                break;
            case 2:
                System.out.print("So phat hanh: ");
                int soPhatHanh_332 = Integer.parseInt(sc_332.nextLine());
                System.out.print("Thang phat hanh: ");
                int thangPhatHanh_332 = Integer.parseInt(sc_332.nextLine());
                danhSachTaiLieu_332.add(new TapChi(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332, soPhatHanh_332, thangPhatHanh_332));
                break;
            case 3:
                System.out.print("Ngay phat hanh: ");
                String ngayPhatHanh_332 = sc_332.nextLine();
                danhSachTaiLieu_332.add(new Bao(maTaiLieu_332, tenNXB_332, soBanPhatHanh_332, ngayPhatHanh_332));
                break;
            default:
                System.out.println("Loai khong ho le!");
        }
    }
    public void timKiemTheoMa(String ma_332) {
        boolean found_332 = false;
        for (TaiLieu tl_332 : danhSachTaiLieu_332) {
            if (tl_332.getMaTaiLieu_332().equalsIgnoreCase(ma_332)) {
                tl_332.hienThiThongTin();
                found_332 = true;
            }
        }
        if (!found_332) {
            System.out.println("Khong tim thay tai lieu co ma: " + ma_332);
        }
    }
    public void timKiemTheoLoai(String loai_332) {
        boolean found_332 = false;
        for (TaiLieu tl_332 : danhSachTaiLieu_332) {
            if ((loai_332.equalsIgnoreCase("sach") && tl_332 instanceof Sach) ||
                (loai_332.equalsIgnoreCase("tapchi") && tl_332 instanceof TapChi) ||
                (loai_332.equalsIgnoreCase("bao") && tl_332 instanceof Bao)) {
                tl_332.hienThiThongTin();
                System.out.println("----------------");
                found_332 = true;
            }
        }
        if (!found_332) {
            System.out.println("Khong co tai lieu thuoc loai: " + loai_332);
        }
    }
    public void hienThiTatCa() {
        for (TaiLieu tl_332 : danhSachTaiLieu_332) {
            tl_332.hienThiThongTin();
            System.out.println("----------------");
        }
    }
}
