package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class TheMuon {
    private String soPhieuMuon_350;
    private String ngayMuon_350;
    private String hanTra_350;
    private String soHieuSach_350;
    private String tenSach_350;
    private SinhVien sv; // thông tin sinh viên mượn sách
    public void nhap(Scanner sc) {
        sv = new SinhVien();
        System.out.println("=== Nhap thong tin sinh vien ===");
        sv.nhap(sc);
        System.out.println("=== Nhap thong tin the muon ===");
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon_350 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
        ngayMuon_350 = sc.nextLine();
        System.out.print("Nhap han tra (dd/mm/yyyy): ");
        hanTra_350 = sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach_350 = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach_350 = sc.nextLine();
    }
    public void hienThi() {
        sv.hienThi();
        System.out.println("So phieu muon: " + soPhieuMuon_350);
        System.out.println("Ngay muon: " + ngayMuon_350);
        System.out.println("Han tra: " + hanTra_350);
        System.out.println("So hieu sach: " + soHieuSach_350);
        System.out.println("Ten sach: " + tenSach_350);
    }
    public String getHanTra() {
        return hanTra_350;
    }
    public String getTenSach() {
        return tenSach_350;
    }
    public SinhVien getSinhVien() {
        return sv;
    }
}
