package com.mycompany.baitapontapjava;

public class Bai01_PhanSo {
    // --- models (lồng bên trong) ---
    static class Fraction {
        int num, den;
        Fraction(int n,int d){ if(d==0) throw new IllegalArgumentException("Mau so 0"); num=n; den=d; simplify(); }
        Fraction(){ this(0,1); }
        static int gcd(int a,int b){ a=Math.abs(a); b=Math.abs(b); while(b!=0){int t=a%b; a=b; b=t;} return a==0?1:a; }
        final void simplify(){ int g=gcd(num,den); num/=g; den/=g; if(den<0){den=-den; num=-num;} }
        Fraction add(Fraction o){ return new Fraction(num*o.den+o.num*den, den*o.den); }
        Fraction sub(Fraction o){ return new Fraction(num*o.den-o.num*den, den*o.den); }
        Fraction mul(Fraction o){ return new Fraction(num*o.num, den*o.den); }
        Fraction div(Fraction o){ return new Fraction(num*o.den, den*o.num); }
        @Override public String toString(){ return num+"/"+den; }
    }
    // --- demo ---
    public static void run(){
        Fraction a=new Fraction(1,2), b=new Fraction(3,4);
        System.out.println("a="+a); System.out.println("b="+b);
        System.out.println("a+b="+a.add(b));
        System.out.println("a-b="+a.sub(b));
        System.out.println("a*b="+a.mul(b));
        System.out.println("a/b="+a.div(b));
    }
}
