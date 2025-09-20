package com.mycompany.baitapontapjava.Bai4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TuyenSinh ts_350 = new TuyenSinh();
        Scanner sc_350 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Tim kiem theo SBD");
            System.out.println("3. Hien thi tat ca thi sinh");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_350 = Integer.parseInt(sc_350.nextLine());

            switch (chon_350) {
                case 1:
                    ts_350.nhapThiSinh();
                    break;
                case 2:
                    ts_350.timKiemTheoSBD();
                    break;
                case 3:
                    ts_350.hienThiTatCa();
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
