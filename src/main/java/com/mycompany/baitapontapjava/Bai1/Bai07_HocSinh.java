package com.mycompany.baitapontapjava.Bai1;
import java.time.*; import java.util.*;

public class Bai07_HocSinh {
    static class Nguoi{ String hoTen, queQuan; LocalDate ngaySinh;
        Nguoi(String h, LocalDate n, String q){ hoTen=h; ngaySinh=n; queQuan=q; } }
    static class HocSinh extends Nguoi{
        String lop,khoa,ky; HocSinh(String h,LocalDate n,String q,String lop,String khoa,String ky){
            super(h,n,q); this.lop=lop; this.khoa=khoa; this.ky=ky; }
        @Override public String toString(){ return hoTen+" | "+lop+" | "+khoa+" | "+ky+" | "+queQuan+" | "+ngaySinh; }
    }
    public static void run(){
        List<HocSinh> ds=List.of(
            new HocSinh("Nguyen A", LocalDate.of(1985,3,1), "Thai Nguyen","10A1","K2000","1"),
            new HocSinh("Tran B",   LocalDate.of(2007,4,2), "Da Nang","10A1","K2024","1"),
            new HocSinh("Le C",     LocalDate.of(1985,6,3), "Thai Nguyen","11A3","K2000","2")
        );
        System.out.println("== 1985 & Thai Nguyen =="); 
        ds.stream().filter(h->h.ngaySinh.getYear()==1985 && "Thai Nguyen".equalsIgnoreCase(h.queQuan)).forEach(System.out::println);
        System.out.println("\n== Lop 10A1 =="); ds.stream().filter(h->"10A1".equalsIgnoreCase(h.lop)).forEach(System.out::println);
    }
}
