package com.mycompany.baitapontapjava;
import java.time.*; import java.util.*;

public class Bai05_KhuPho {
    static class Nguoi{
        String hoTen, nghe; LocalDate ngaySinh;
        Nguoi(String h, LocalDate n, String g){ hoTen=h; ngaySinh=n; nghe=g; }
        int tuoi(){ return Period.between(ngaySinh, LocalDate.now()).getYears(); }
        @Override public String toString(){ return hoTen+" | "+ngaySinh+" | "+nghe+" | Tuoi="+tuoi(); }
    }
    static class HoDan{
        String soNha; List<Nguoi> tv=new ArrayList<>();
        HoDan(String s){ soNha=s; }
        void add(Nguoi n){ tv.add(n); }
        boolean coNguoi80(){ return tv.stream().anyMatch(x->x.tuoi()>=80); }
        @Override public String toString(){ return "So nha "+soNha+" | TV="+tv.size()+" -> "+tv; }
    }
    public static void run(){
        HoDan h1=new HoDan("10/5");
        h1.add(new Nguoi("Cu Ong X", LocalDate.of(1940,1,1), "Nghi huu"));
        h1.add(new Nguoi("Nguyen A", LocalDate.of(1985,5,20), "Cong nhan"));
        HoDan h2=new HoDan("12/8");
        h2.add(new Nguoi("Tran B", LocalDate.of(1990,2,2), "Ban hang"));

        System.out.println("== Tat ca =="); System.out.println(h1); System.out.println(h2);
        System.out.println("\n== Ho co nguoi >=80 =="); if(h1.coNguoi80()) System.out.println(h1); if(h2.coNguoi80()) System.out.println(h2);
    }
}
