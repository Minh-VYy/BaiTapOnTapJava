package com.mycompany.baitapontapjava.Bai1;
import java.util.*; import java.util.stream.*;

public class Bai02_CanBo {
    static abstract class CanBo{
        String hoTen,ngaySinh,gioiTinh,diaChi;
        CanBo(String h,String n,String g,String d){ hoTen=h; ngaySinh=n; gioiTinh=g; diaChi=d; }
        @Override public String toString(){ return hoTen+" | "+ngaySinh+" | "+gioiTinh+" | "+diaChi; }
    }
    static class CongNhan extends CanBo{ int bac; CongNhan(String h,String n,String g,String d,int b){ super(h,n,g,d); bac=b; }
        @Override public String toString(){ return "CongNhan: "+super.toString()+" | Bac="+bac; } }
    static class KySu extends CanBo{ String nganh; KySu(String h,String n,String g,String d,String m){ super(h,n,g,d); nganh=m; }
        @Override public String toString(){ return "KySu: "+super.toString()+" | Nganh="+nganh; } }
    static class NhanVien extends CanBo{ String congViec; NhanVien(String h,String n,String g,String d,String cv){ super(h,n,g,d); congViec=cv; }
        @Override public String toString(){ return "NhanVien: "+super.toString()+" | CV="+congViec; } }

    public static void run(){
        List<CanBo> ds = new ArrayList<>();
        ds.add(new CongNhan("Nguyen A","01/01/1980","Nam","Da Nang",5));
        ds.add(new KySu("Tran B","02/02/1990","Nu","Hue","Xay dung"));
        ds.add(new NhanVien("Le C","03/03/1995","Nam","Quang Nam","Van thu"));

        System.out.println("== DS Can bo =="); ds.forEach(System.out::println);
        System.out.println("\n== Tim chua 'an' =="); 
        ds.stream().filter(x->x.hoTen.toLowerCase().contains("an")).forEach(System.out::println);
    }
}
