package com.mycompany.baitapontapjava.Bai6;
import java.util.ArrayList;
import java.util.Scanner;
class KhachSan {
    private ArrayList<KhachTro> dsKhach_350 = new ArrayList<>();
    private Scanner sc_350 = new Scanner(System.in);

    // Nhập khách trọ
    public void nhapKhach() {
        System.out.print("Nhap ho ten: ");
        String ten_350 = sc_350.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh_350 = sc_350.nextLine();
        System.out.print("Nhap CMND: ");
        String cmnd_350 = sc_350.nextLine();

        System.out.print("Nhap so ngay tro: ");
        int soNgay_350 = Integer.parseInt(sc_350.nextLine());
        System.out.print("Nhap loai phong: ");
        String loaiPhong_350 = sc_350.nextLine();
        System.out.print("Nhap gia phong/ngay: ");
        double giaPhong_350 = Double.parseDouble(sc_350.nextLine());

        Nguoi nguoi_350 = new Nguoi(ten_350, ngaySinh_350, cmnd_350);
        KhachTro khach_350 = new KhachTro(nguoi_350, soNgay_350, loaiPhong_350, giaPhong_350);

        dsKhach_350.add(khach_350);
        System.out.println("==> Đa them khach tro thanh cong!");
    }

    // Hiển thị danh sách khách trọ
    public void hienThiDS() {
        if (dsKhach_350.isEmpty()) {
            System.out.println("Chua co khach tro nao.");
        } else {
            for (KhachTro k : dsKhach_350) {
                k.hienThi();
                System.out.println("-----------------------");
            }
        }
    }

    // Xóa khách theo CMND
    public void xoaKhach() {
        System.out.print("Nhap CMND khach can xoa: ");
        String cmnd_350 = sc_350.nextLine();
        KhachTro khachXoa_350 = null;
        for (KhachTro k : dsKhach_350) {
            if (k.getCmnd_350().equalsIgnoreCase(cmnd_350)) {
                khachXoa_350 = k;
                break;
            }
        }
        if (khachXoa_350 != null) {
            dsKhach_350.remove(khachXoa_350);
            System.out.println("==> Đa xoa khach co CMND: " + cmnd_350);
        } else {
            System.out.println("Khong tim thay khach co CMND nay.");
        }
    }

    // Tính tiền trả phòng
    public void tinhTien() {
        System.out.print("Nhap CMND khach can tinh tien: ");
        String cmnd_350 = sc_350.nextLine();
        for (KhachTro k : dsKhach_350) {
            if (k.getCmnd_350().equalsIgnoreCase(cmnd_350)) {
                System.out.println("So tien phai tra: " + k.tinhTien() + " VND");
                return;
            }
        }
        System.out.println("Khong tim thay khach co CMND nay.");
    }
}
