package com.mycompany.baitapontapjava.Bai1;
import java.time.*;import java.time.temporal.TemporalAdjusters;
 import java.util.*;

public class Bai09_ThuVien {
    static class SinhVien{ String hoTen, maSV, ngaySinh, lop;
        SinhVien(String h,String m,String n,String l){ hoTen=h; maSV=m; ngaySinh=n; lop=l; }
        @Override public String toString(){ return maSV+" - "+hoTen+" - "+lop; } }
    static class TheMuon{
        String soPhieu, soHieuSach; LocalDate ngayMuon, hanTra; SinhVien sv;
        TheMuon(String sp, LocalDate m, LocalDate h, String sh, SinhVien s){ soPhieu=sp; ngayMuon=m; hanTra=h; soHieuSach=sh; sv=s; }
        @Override public String toString(){ return soPhieu+" | "+sv+" | Sach="+soHieuSach+" | HanTra="+hanTra; }
    }
    public static void run(){
        LocalDate cuoiThang=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        SinhVien sv1=new SinhVien("Nguyen A","SV001","01/01/2004","22CNTT1");
        SinhVien sv2=new SinhVien("Tran B","SV002","02/02/2004","22CNTT2");
        List<TheMuon> ds=List.of(
            new TheMuon("PM01", LocalDate.now().minusDays(2), cuoiThang, "S001", sv1),
            new TheMuon("PM02", LocalDate.now().minusDays(5), LocalDate.now().plusDays(10), "S002", sv2)
        );
        System.out.println("== Han tra ngay cuoi thang =="); 
        ds.stream().filter(t->t.hanTra.equals(cuoiThang)).forEach(System.out::println);
    }
}
