package com.mycompany.baitapontapjava;

public class Bai10_BienLai {
    static class KhachHang{ String chuHo, soNha, maCongTo;
        KhachHang(String c,String s,String m){ chuHo=c; soNha=s; maCongTo=m; }
        @Override public String toString(){ return chuHo+" | "+soNha+" | CT:"+maCongTo; } }
    static class BienLai{
        KhachHang kh; int cu, moi;
        BienLai(KhachHang k,int c,int m){ if(m<c) throw new IllegalArgumentException("Chi so moi < cu"); kh=k; cu=c; moi=m; }
        long tien(){ return (long)(moi-cu)*750L; }
        @Override public String toString(){ return kh+" | CS: "+cu+" -> "+moi+" | Tien="+tien(); }
    }
    public static void run(){
        BienLai b1=new BienLai(new KhachHang("Nguyen A","10/5","CT001"),1200,1270);
        BienLai b2=new BienLai(new KhachHang("Tran B","12/8","CT002"),500,550);
        System.out.println("== Bien lai =="); System.out.println(b1); System.out.println(b2);
    }
}
