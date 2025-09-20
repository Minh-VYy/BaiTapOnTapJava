package com.mycompany.baitapontapjava.Bai4;
import java.util.ArrayList;
import java.util.Scanner;
class TuyenSinh {
    private ArrayList<ThiSinh> dsThiSinh_350 = new ArrayList<>();
    private Scanner sc_350 = new Scanner(System.in);

    // Nhập thí sinh
    public void nhapThiSinh() {
        System.out.print("Nhap SBD: ");
        String sbd_350 = sc_350.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen_350 = sc_350.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi_350 = sc_350.nextLine();
        System.out.print("Nhap dien uu tien: ");
        String uuTien_350 = sc_350.nextLine();
        System.out.print("Chon khoi (A/B/C): ");
        String khoi_350 = sc_350.nextLine();

        ThiSinh ts_350 = null;
        if (khoi_350.equalsIgnoreCase("A")) {
            ts_350 = new ThiSinhKhoiA(sbd_350, hoTen_350, diaChi_350, uuTien_350);
        } else if (khoi_350.equalsIgnoreCase("B")) {
            ts_350 = new ThiSinhKhoiB(sbd_350, hoTen_350, diaChi_350, uuTien_350);
        } else if (khoi_350.equalsIgnoreCase("C")) {
            ts_350 = new ThiSinhKhoiC(sbd_350, hoTen_350, diaChi_350, uuTien_350);
        }

        if (ts_350 != null) {
            dsThiSinh_350.add(ts_350);
            System.out.println("==> Da them thi sinh thanh cong!");
        } else {
            System.out.println("Khoi khong hop le!");
        }
    }

    // Tìm kiếm theo số báo danh
    public void timKiemTheoSBD() {
        System.out.print("Nhap SBD can tim: ");
        String sbdTim_350 = sc_350.nextLine();
        for (ThiSinh ts : dsThiSinh_350) {
            if (ts.getSbd_350().equalsIgnoreCase(sbdTim_350)) {
                ts.hienThi();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD = " + sbdTim_350);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        if (dsThiSinh_350.isEmpty()) {
            System.out.println("Chua co thi sinh nao.");
        } else {
            for (ThiSinh ts : dsThiSinh_350) {
                ts.hienThi();
                System.out.println("-------------------");
            }
        }
    }
}
