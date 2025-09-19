package com.mycompany.baitapontapjava.Bai9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TheMuon> ds = new ArrayList<>();

        System.out.print("Nhap so luong the muon: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin the muon thu " + (i + 1));
            TheMuon tm = new TheMuon();
            tm.nhap(sc);
            ds.add(tm);
        }

        System.out.println("\n=== Danh sach tat ca the muon ===");
        for (TheMuon tm : ds) {
            tm.hienThi();
            System.out.println("-------------------");
        }
        System.out.println("\n=== Danh sach sinh vien phai tra sach vao ngay cuoi thang ===");
        for (TheMuon tm : ds) {
            String hanTra = tm.getHanTra();
            if (hanTra.startsWith("30/") || hanTra.startsWith("31/")) {
                System.out.println("Sinh vien: " + tm.getSinhVien().getHoTen() +
                                   " - Ten sach: " + tm.getTenSach() +
                                   " - Han tra: " + hanTra);
            }
        }
    }
}