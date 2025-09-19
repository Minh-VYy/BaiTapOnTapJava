package com.mycompany.baitapontapjava.Bai1;
import java.math.BigDecimal; import java.util.*;

public class Bai08_CBGV {
    static class CBGV{
        String hoTen, ngaySinh, queQuan; BigDecimal luongCung, thuong, phat;
        CBGV(String h,String n,String q, BigDecimal lc, BigDecimal th, BigDecimal ph){
            hoTen=h; ngaySinh=n; queQuan=q; luongCung=lc; thuong=th; phat=ph; }
        BigDecimal thucLinh(){ return luongCung.add(thuong).subtract(phat); }
        @Override public String toString(){ return hoTen+" | ThucLinh="+thucLinh(); }
    }
    public static void run(){
        List<CBGV> ds=List.of(
            new CBGV("Thay A","01/01/1980","Da Nang", new BigDecimal("7000000"), new BigDecimal("1500000"), new BigDecimal("200000")),
            new CBGV("Co B","02/02/1985","Hue",      new BigDecimal("6000000"), new BigDecimal("500000"),  new BigDecimal("0"))
        );
        System.out.println("== Tat ca =="); ds.forEach(System.out::println);
        System.out.println("\n== >= 8,000,000 =="); 
        ds.stream().filter(g->g.thucLinh().compareTo(new BigDecimal("8000000"))>=0).forEach(System.out::println);
    }
}
