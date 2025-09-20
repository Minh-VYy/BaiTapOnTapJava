package com.mycompany.baitapontapjava.Bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLyCanBo qlcb_350 = new QuanLyCanBo();
        Scanner sc_350 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi toan bo can bo");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_350 = Integer.parseInt(sc_350.nextLine());

            switch (chon_350) {
                case 1:
                    qlcb_350.nhapCanBo_350();
                    break;
                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String ten_350 = sc_350.nextLine();
                    qlcb_350.timKiemTheoTen_350(ten_350);
                    break;
                case 3:
                    qlcb_350.hienThiTatCa_350();
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
