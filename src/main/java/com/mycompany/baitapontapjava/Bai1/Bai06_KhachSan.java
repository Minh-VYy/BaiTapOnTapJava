package com.mycompany.baitapontapjava.Bai1;
import java.math.BigDecimal; import java.util.*;

public class Bai06_KhachSan {
    static class Nguoi{ String hoTen,ngaySinh,cmnd; Nguoi(String h,String n,String c){ hoTen=h; ngaySinh=n; cmnd=c; }
        @Override public String toString(){ return hoTen+" | "+ngaySinh+" | CMND:"+cmnd; } }
    static class KhachTro{
        Nguoi info; int soNgay; String loaiPhong; BigDecimal giaNgay;
        KhachTro(Nguoi i,int d,String lp,BigDecimal g){ info=i; soNgay=d; loaiPhong=lp; giaNgay=g; }
        BigDecimal tien(){ return giaNgay.multiply(BigDecimal.valueOf(soNgay)); }
        @Override public String toString(){ return info+" | "+loaiPhong+" | "+soNgay+" ngay | GiaNgay="+giaNgay; }
    }

    public static void run(){
        List<KhachTro> ds = new ArrayList<>();
        ds.add(new KhachTro(new Nguoi("Nguyen A","01/01/1990","123456789"),3,"VIP",new BigDecimal("500000")));
        ds.add(new KhachTro(new Nguoi("Tran B","02/02/1995","987654321"),2,"Thuong",new BigDecimal("250000")));
        System.out.println("== Dang tro =="); ds.forEach(System.out::println);
        System.out.println("\n== Tinh tien 123456789 ==");
        KhachTro k = ds.stream().filter(x->x.info.cmnd.equals("123456789")).findFirst().orElse(null);
        System.out.println(k+" | Thanh tien = "+k.tien());
    }
}
