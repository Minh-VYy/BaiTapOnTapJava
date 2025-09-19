package com.mycompany.baitapontapjava.Bai1;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n=== CHON BAI ===");
            System.out.println("1.Phan so | 2.Can bo | 3.Tai lieu | 4.Tuyen sinh | 5.Khu pho");
            System.out.println("6.Khach san | 7.Hoc sinh | 8.CBGV | 9.Thu vien | 10.Bien lai");
            System.out.println("0.Thoat");
            System.out.print("Nhap so bai: ");
            String ch = sc.nextLine().trim();
            switch (ch){
                case "1": Bai01_PhanSo.run(); break;
                case "2": Bai02_CanBo.run(); break;
                case "3": Bai03_TaiLieu.run(); break;
                case "4": Bai04_TuyenSinh.run(); break;
                case "5": Bai05_KhuPho.run(); break;
                case "6": Bai06_KhachSan.run(); break;
                case "7": Bai07_HocSinh.run(); break;
                case "8": Bai08_CBGV.run(); break;
                case "9": Bai09_ThuVien.run(); break;
                case "10": Bai10_BienLai.run(); break;
                case "0": System.out.println("Bye!"); return;
                default: System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
