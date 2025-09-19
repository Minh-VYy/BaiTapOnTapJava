package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class TheMuon {
    private String soPhieuMuon_332;
    private String ngayMuon_332;
    private String hanTra_332;
    private String soHieuSach_332;
    private String tenSach_332;
    private SinhVien sv; // thông tin sinh viên mượn sách
    public void nhap(Scanner sc) {
        sv = new SinhVien();
        System.out.println("=== Nhap thong tin sinh vien ===");
        sv.nhap(sc);
        System.out.println("=== Nhap thong tin the muon ===");
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon_332 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
        ngayMuon_332 = sc.nextLine();
        System.out.print("Nhap han tra (dd/mm/yyyy): ");
        hanTra_332 = sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach_332 = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach_332 = sc.nextLine();
    }
    public void hienThi() {
        sv.hienThi();
        System.out.println("So phieu muon: " + soPhieuMuon_332);
        System.out.println("Ngay muon: " + ngayMuon_332);
        System.out.println("Han tra: " + hanTra_332);
        System.out.println("So hieu sach: " + soHieuSach_332);
        System.out.println("Ten sach: " + tenSach_332);
    }
    public String getHanTra() {
        return hanTra_332;
    }
    public String getTenSach() {
        return tenSach_332;
    }
    public SinhVien getSinhVien() {
        return sv;
    }
}
