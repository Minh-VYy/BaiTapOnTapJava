
package com.mycompany.baitapontapjava.Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BienLai> ds = new ArrayList<>();

        System.out.print("Nhap so ho su dung dien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin bien lai thu " + (i + 1));
            BienLai bl = new BienLai();
            bl.nhap(sc);
            ds.add(bl);
        }

        System.out.println("\n=== Danh sach bien lai ===");
        for (BienLai bl : ds) {
            bl.hienThi();
            System.out.println("-------------------");
        }
    }
}
