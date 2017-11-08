package com.fyakut;

import java.util.ArrayList;

public class Main {
/** içerisinde tüm referans tiplerini tutan ve hangi referans tipini tutacağınıa oluştururken karar veren classlardr
 */
    public static void main(String[] args) {
        String[] dizistring = {"berfin", "rojda", "avşin"};
        Integer[] diziint1 = {21, 25, 28};
        Double[] dizidouble2 = {10.0, 11.0, 12.0};
        Character[] dizichar = {'a', 'b', 'c'};

        /**    StringDiziYaz s1=new StringDiziYaz();
         s1.yazdir(dizistring);

         IntegerDiziYaz s2=new IntegerDiziYaz();
         s2.yazdir(diziint1);

         DoubleDiziYaz s3=new DoubleDiziYaz();
         s3.yazdir(dizidouble2);

         CharDiziYaz c1=new CharDiziYaz();
         c1.yazdir(dizichar);
         */
        DiziYazdir<String> s1 = new DiziYazdir<>();
        s1.yazdir(dizistring);

        DiziYazdir<Integer> s2 = new DiziYazdir<>();
        s2.yazdir(diziint1);

        DiziYazdir<Double> s3 = new DiziYazdir<>();
        s3.yazdir(dizidouble2);

        DiziYazdir<Character> s4 = new DiziYazdir<>();
        s4.yazdir(dizichar);
/**
generic olmadan yapıldığında hangi tip ve türden ekleme yapma kısıtlaması olmamakta ve işlem yapılmak istendiğinde casting gerekmektedir
        ArrayList sayılar = new ArrayList();
        sayılar.add(2);
        sayılar.add(7);
        sayılar.add(6);
 sayılar.add("a");
        sayılar.add(5);
        ikiyekatla(sayılar);
    }

    private static void ikiyekatla(ArrayList sayılar) {
      for (Object i:sayılar)
          System.out.println((Integer)i*2);
    }*/

//Generic
        ArrayList<Integer> sayılar = new ArrayList();
        sayılar.add(2);
        sayılar.add(7);
        sayılar.add(6);
        //sayılar.add("a");hata verir eklemesne izin vermez
        sayılar.add(5);
        ikiyekatla(sayılar);
    }

    private static void ikiyekatla(ArrayList<Integer> sayılar) {
        for (Integer i:sayılar)
            System.out.println(i*2);
    }

}





