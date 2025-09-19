package com.mycompany.baitapontapjava;
import java.util.*;

public class Bai03_TaiLieu {
    static abstract class TaiLieu{ String ma,nxb; int soBan;
        TaiLieu(String m,String n,int s){ ma=m;nxb=n;soBan=s; }
        @Override public String toString(){ return ma+" | NXB="+nxb+" | SoBan="+soBan; } }
    static class Sach extends TaiLieu{ String tacGia; int soTrang;
        Sach(String m,String n,int s,String tg,int tr){ super(m,n,s); tacGia=tg; soTrang=tr; }
        @Override public String toString(){ return "Sach: "+super.toString()+" | TG="+tacGia+" | Trang="+soTrang; } }
    static class TapChi extends TaiLieu{ int so,thang;
        TapChi(String m,String n,int s,int so,int th){ super(m,n,s); this.so=so; thang=th; }
        @Override public String toString(){ return "TapChi: "+super.toString()+" | So="+so+" | Thang="+thang; } }
    static class Bao extends TaiLieu{ String ngay; Bao(String m,String n,int s,String d){ super(m,n,s); ngay=d; }
        @Override public String toString(){ return "Bao: "+super.toString()+" | Ngay="+ngay; } }

    public static void run(){
        List<TaiLieu> ds = new ArrayList<>();
        ds.add(new Sach("S1","Tre",100,"T.A",250));
        ds.add(new TapChi("TC1","GDDT",80,12,9));
        ds.add(new Bao("B1","TT",500,"30/09/2025"));

        System.out.println("== Tat ca =="); ds.forEach(System.out::println);
        System.out.println("\n== Chi in Sach =="); ds.stream().filter(t->t instanceof Sach).forEach(System.out::println);
        System.out.println("\n== Tim ma 'TC1' =="); ds.stream().filter(t->"TC1".equalsIgnoreCase(((TaiLieu)t).ma)).findFirst().ifPresent(System.out::println);
    }
}
