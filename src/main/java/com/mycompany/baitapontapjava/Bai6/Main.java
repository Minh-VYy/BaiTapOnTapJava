package com.mycompany.baitapontapjava.Bai6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        KhachSan ks_350 = new KhachSan();
        Scanner sc_350 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU KHACH SAN =====");
            System.out.println("1. Nhap khach tro");
            System.out.println("2. Hien thi danh sach khach tro");
            System.out.println("3. Xoa khach tro theo CMND");
            System.out.println("4. Tinh tien tra phong");
            System.out.println("5. Thoat");
            System.out.print("Chọn: ");
            int chon_350 = Integer.parseInt(sc_350.nextLine());

            switch (chon_350) {
                case 1:
                    ks_350.nhapKhach();
                    break;
                case 2:
                    ks_350.hienThiDS();
                    break;
                case 3:
                    ks_350.xoaKhach();
                    break;
                case 4:
                    ks_350.tinhTien();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}