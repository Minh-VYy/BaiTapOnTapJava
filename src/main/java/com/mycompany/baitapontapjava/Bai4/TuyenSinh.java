package com.mycompany.baitapontapjava.Bai4;
import java.util.ArrayList;
import java.util.Scanner;
class TuyenSinh {
    private ArrayList<ThiSinh> dsThiSinh_332 = new ArrayList<>();
    private Scanner sc_332 = new Scanner(System.in);

    // Nhập thí sinh
    public void nhapThiSinh() {
        System.out.print("Nhap SBD: ");
        String sbd_332 = sc_332.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen_332 = sc_332.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi_332 = sc_332.nextLine();
        System.out.print("Nhap dien uu tien: ");
        String uuTien_332 = sc_332.nextLine();
        System.out.print("Chon khoi (A/B/C): ");
        String khoi_332 = sc_332.nextLine();

        ThiSinh ts_332 = null;
        if (khoi_332.equalsIgnoreCase("A")) {
            ts_332 = new ThiSinhKhoiA(sbd_332, hoTen_332, diaChi_332, uuTien_332);
        } else if (khoi_332.equalsIgnoreCase("B")) {
            ts_332 = new ThiSinhKhoiB(sbd_332, hoTen_332, diaChi_332, uuTien_332);
        } else if (khoi_332.equalsIgnoreCase("C")) {
            ts_332 = new ThiSinhKhoiC(sbd_332, hoTen_332, diaChi_332, uuTien_332);
        }

        if (ts_332 != null) {
            dsThiSinh_332.add(ts_332);
            System.out.println("==> Da them thi sinh thanh cong!");
        } else {
            System.out.println("Khoi khong hop le!");
        }
    }

    // Tìm kiếm theo số báo danh
    public void timKiemTheoSBD() {
        System.out.print("Nhap SBD can tim: ");
        String sbdTim_332 = sc_332.nextLine();
        for (ThiSinh ts : dsThiSinh_332) {
            if (ts.getSbd_332().equalsIgnoreCase(sbdTim_332)) {
                ts.hienThi();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD = " + sbdTim_332);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        if (dsThiSinh_332.isEmpty()) {
            System.out.println("Chua co thi sinh nao.");
        } else {
            for (ThiSinh ts : dsThiSinh_332) {
                ts.hienThi();
                System.out.println("-------------------");
            }
        }
    }
}
