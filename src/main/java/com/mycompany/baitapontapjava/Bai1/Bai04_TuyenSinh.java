package com.mycompany.baitapontapjava.Bai1;
import java.util.*;

public class Bai04_TuyenSinh {
    static abstract class ThiSinh{
        String sbd,hoTen,diaChi; int uuTien;
        ThiSinh(String s,String h,String d,int u){ sbd=s; hoTen=h; diaChi=d; uuTien=u; }
        abstract String khoi();
        @Override public String toString(){ return sbd+" | "+hoTen+" | "+diaChi+" | UT="+uuTien+" | Khoi="+khoi(); }
    }
    static class KhoiA extends ThiSinh{ KhoiA(String s,String h,String d,int u){ super(s,h,d,u);} String khoi(){ return "A(Toan,Ly,Hoa)"; } }
    static class KhoiB extends ThiSinh{ KhoiB(String s,String h,String d,int u){ super(s,h,d,u);} String khoi(){ return "B(Toan,Hoa,Sinh)"; } }
    static class KhoiC extends ThiSinh{ KhoiC(String s,String h,String d,int u){ super(s,h,d,u);} String khoi(){ return "C(Van,Su,Dia)"; } }

    public static void run(){
        Map<String,ThiSinh> map = new HashMap<>();
        map.put("001", new KhoiA("001","Nguyen A","Da Nang",1));
        map.put("002", new KhoiB("002","Tran B","Hue",0));
        map.put("003", new KhoiC("003","Le C","QN",2));

        System.out.println("== DS Thi sinh =="); map.values().forEach(System.out::println);
        System.out.println("\n== Tim 002 =="); System.out.println(map.get("002"));
    }
}
