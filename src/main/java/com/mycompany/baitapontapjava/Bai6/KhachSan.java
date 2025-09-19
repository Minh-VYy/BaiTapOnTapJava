package com.mycompany.baitapontapjava.Bai6;
import java.util.ArrayList;
import java.util.Scanner;
class KhachSan {
    private ArrayList<KhachTro> dsKhach_332 = new ArrayList<>();
    private Scanner sc_332 = new Scanner(System.in);

    // Nhập khách trọ
    public void nhapKhach() {
        System.out.print("Nhap ho ten: ");
        String ten_332 = sc_332.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh_332 = sc_332.nextLine();
        System.out.print("Nhap CMND: ");
        String cmnd_332 = sc_332.nextLine();

        System.out.print("Nhap so ngay tro: ");
        int soNgay_332 = Integer.parseInt(sc_332.nextLine());
        System.out.print("Nhap loai phong: ");
        String loaiPhong_332 = sc_332.nextLine();
        System.out.print("Nhap gia phong/ngay: ");
        double giaPhong_332 = Double.parseDouble(sc_332.nextLine());

        Nguoi nguoi_332 = new Nguoi(ten_332, ngaySinh_332, cmnd_332);
        KhachTro khach_332 = new KhachTro(nguoi_332, soNgay_332, loaiPhong_332, giaPhong_332);

        dsKhach_332.add(khach_332);
        System.out.println("==> Đa them khach tro thanh cong!");
    }

    // Hiển thị danh sách khách trọ
    public void hienThiDS() {
        if (dsKhach_332.isEmpty()) {
            System.out.println("Chua co khach tro nao.");
        } else {
            for (KhachTro k : dsKhach_332) {
                k.hienThi();
                System.out.println("-----------------------");
            }
        }
    }

    // Xóa khách theo CMND
    public void xoaKhach() {
        System.out.print("Nhap CMND khach can xoa: ");
        String cmnd_332 = sc_332.nextLine();
        KhachTro khachXoa_332 = null;
        for (KhachTro k : dsKhach_332) {
            if (k.getCmnd_332().equalsIgnoreCase(cmnd_332)) {
                khachXoa_332 = k;
                break;
            }
        }
        if (khachXoa_332 != null) {
            dsKhach_332.remove(khachXoa_332);
            System.out.println("==> Đa xoa khach co CMND: " + cmnd_332);
        } else {
            System.out.println("Khong tim thay khach co CMND nay.");
        }
    }

    // Tính tiền trả phòng
    public void tinhTien() {
        System.out.print("Nhap CMND khach can tinh tien: ");
        String cmnd_332 = sc_332.nextLine();
        for (KhachTro k : dsKhach_332) {
            if (k.getCmnd_332().equalsIgnoreCase(cmnd_332)) {
                System.out.println("So tien phai tra: " + k.tinhTien() + " VND");
                return;
            }
        }
        System.out.println("Khong tim thay khach co CMND nay.");
    }
}
