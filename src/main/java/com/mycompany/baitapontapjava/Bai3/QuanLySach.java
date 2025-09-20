
package com.mycompany.baitapontapjava.Bai3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu_350 = new ArrayList<>();
    private Scanner sc_350 = new Scanner(System.in);

    // Nhập thông tin tài liệu
    public void nhapTaiLieu() {
        System.out.println("Chon loai tai lieu: 1. Sach | 2. Tap chi | 3. Bao");
        int loai_350 = Integer.parseInt(sc_350.nextLine());

        System.out.print("Ma tai lieu: ");
        String maTaiLieu_350 = sc_350.nextLine();
        System.out.print("Nha xuat ban: ");
        String tenNXB_350 = sc_350.nextLine();
        System.out.print("So ban phat hanh: ");
        int soBanPhatHanh_350 = Integer.parseInt(sc_350.nextLine());

        switch (loai_350) {
            case 1:
                System.out.print("Ten tac gia: ");
                String tenTacGia_350 = sc_350.nextLine();
                System.out.print("So trang: ");
                int soTrang_350 = Integer.parseInt(sc_350.nextLine());
                danhSachTaiLieu_350.add(new Sach(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350, tenTacGia_350, soTrang_350));
                break;
            case 2:
                System.out.print("So phat hanh: ");
                int soPhatHanh_350 = Integer.parseInt(sc_350.nextLine());
                System.out.print("Thang phat hanh: ");
                int thangPhatHanh_350 = Integer.parseInt(sc_350.nextLine());
                danhSachTaiLieu_350.add(new TapChi(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350, soPhatHanh_350, thangPhatHanh_350));
                break;
            case 3:
                System.out.print("Ngay phat hanh: ");
                String ngayPhatHanh_350 = sc_350.nextLine();
                danhSachTaiLieu_350.add(new Bao(maTaiLieu_350, tenNXB_350, soBanPhatHanh_350, ngayPhatHanh_350));
                break;
            default:
                System.out.println("Loai khong ho le!");
        }
    }
    public void timKiemTheoMa(String ma_350) {
        boolean found_350 = false;
        for (TaiLieu tl_350 : danhSachTaiLieu_350) {
            if (tl_350.getMaTaiLieu_350().equalsIgnoreCase(ma_350)) {
                tl_350.hienThiThongTin();
                found_350 = true;
            }
        }
        if (!found_350) {
            System.out.println("Khong tim thay tai lieu co ma: " + ma_350);
        }
    }
    public void timKiemTheoLoai(String loai_350) {
        boolean found_350 = false;
        for (TaiLieu tl_350 : danhSachTaiLieu_350) {
            if ((loai_350.equalsIgnoreCase("sach") && tl_350 instanceof Sach) ||
                (loai_350.equalsIgnoreCase("tapchi") && tl_350 instanceof TapChi) ||
                (loai_350.equalsIgnoreCase("bao") && tl_350 instanceof Bao)) {
                tl_350.hienThiThongTin();
                System.out.println("----------------");
                found_350 = true;
            }
        }
        if (!found_350) {
            System.out.println("Khong co tai lieu thuoc loai: " + loai_350);
        }
    }
    public void hienThiTatCa() {
        for (TaiLieu tl_350 : danhSachTaiLieu_350) {
            tl_350.hienThiThongTin();
            System.out.println("----------------");
        }
    }
}
