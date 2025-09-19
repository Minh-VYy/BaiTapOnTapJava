package com.mycompany.baitapontapjava.Bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLyCanBo qlcb_332 = new QuanLyCanBo();
        Scanner sc_332 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi toan bo can bo");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_332 = Integer.parseInt(sc_332.nextLine());

            switch (chon_332) {
                case 1:
                    qlcb_332.nhapCanBo_332();
                    break;
                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String ten_332 = sc_332.nextLine();
                    qlcb_332.timKiemTheoTen_332(ten_332);
                    break;
                case 3:
                    qlcb_332.hienThiTatCa_332();
                    break;
                case 4:
                    System.out.println("Ket thuc chương trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
