package com.mycompany.baitapontapjava.Bai4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TuyenSinh ts_332 = new TuyenSinh();
        Scanner sc_332 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Tim kiem theo SBD");
            System.out.println("3. Hien thi tat ca thi sinh");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_332 = Integer.parseInt(sc_332.nextLine());

            switch (chon_332) {
                case 1:
                    ts_332.nhapThiSinh();
                    break;
                case 2:
                    ts_332.timKiemTheoSBD();
                    break;
                case 3:
                    ts_332.hienThiTatCa();
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
