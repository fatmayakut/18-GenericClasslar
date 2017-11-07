package com.fyakut;

public class Main {
/** içerisinde tüm referans tiplerini tutan ve hangi referans tipini tutacağınıa oluştururken karar veren classlardr

 */
    public static void main(String[] args) {
        String[] dizistring={"berfin","rojda","avşin"};
        int[] diziint1={21,25,28};
       double[] dizidouble2={10.0,11.0,12.0};
       char[] dizichar={'a','b','c'};

       StringDiziYaz s1=new StringDiziYaz();
       s1.yazdir(dizistring);

        IntegerDiziYaz s2=new IntegerDiziYaz();
        s2.yazdir(diziint1);

        DoubleDiziYaz s3=new DoubleDiziYaz();
        s3.yazdir(dizidouble2);

        CharDiziYaz c1=new CharDiziYaz();
        c1.yazdir(dizichar);
    }
}
