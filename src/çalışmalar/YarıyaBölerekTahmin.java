package çalışmalar;

import java.util.concurrent.ThreadLocalRandom;

public class YarıyaBölerekTahmin {
    public static void main(String[] args) {

        int sayac = 0;
        int dogrucevap = ThreadLocalRandom.current().nextInt();
        int p=0;
        int sonuc1=0;
        int s=0;
        int m=0;

        if (dogrucevap < 0) {
            dogrucevap = dogrucevap * -1;
        }
        p=dogrucevap;
        while (p > 0) {
            p /= 10; // sayi = sayi / 10;
            sayac++;
        }
        if(sayac==10){
            sayac--;
            dogrucevap/=10;
        }

        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);

        if(sayac==9){
            sonuc1=550000000;
            s=1000000000;
            m=100000000;
        }

        if(sayac==8){
            sonuc1=55000000;
            s=100000000;
            m=10000000;
        }
        if(sayac==7){
            sonuc1=5500000;
            s=10000000;
            m=1000000;
        }
        if(sayac==6){
            sonuc1=550000;
            s=1000000;
            m=100000;
        }

        if(sayac==5){
             sonuc1=55000;
             s=100000;
             m=10000;
        }
        if(sayac==4){
             sonuc1=5500;
             s=10000;
             m=1000;
        }
        if(sayac==3){
             sonuc1=550;
             s=1000;
             m=100;
        }
        if(sayac==2){
             sonuc1=55;
             s=100;
             m=10;
        }
        if(sayac==1){
             sonuc1=5;
             s=10;
             m=1;
        }
        int t=0;
        int o=1;
        int r=1;
        int y=0;

        for (int i = 1; i < 31; i++) {

             if (sonuc1<dogrucevap) {
                 System.out.println(sonuc1);
                 t=sonuc1;
                 o=0;
                 if(r==0){
                     sonuc1=((y-t)/2)+t;
                 }
                 else{
                     sonuc1=sonuc1+((s-sonuc1)/2);
                 }

                 System.out.println("cevabınızı arttrın");
                System.out.println(31 - i + "hakkınız kaldı");
                 System.out.println("Bir sonraki tahmininiz:"+sonuc1+"");
                 System.out.println(" ");

            }
            else if (sonuc1>dogrucevap) {
                 System.out.println(sonuc1);
                 y=sonuc1;
                 r=0;
                 if(o==0){
                     sonuc1=sonuc1-((sonuc1-t)/2);
                 }
                 else{
                     sonuc1=sonuc1-((sonuc1-m)/2);
                 }


                 System.out.println("cevabınızı azaltın");
                System.out.println(31 - i + "hakkınız kaldı");
                 System.out.println("Bir sonraki tahmininiz:"+sonuc1+"");
                 System.out.println(" ");




            }
            else if (sonuc1 == dogrucevap) {

                System.out.println("aferin bildin yarrak kafası");
                System.out.println(sonuc1);


                break;
            }

        }

        System.out.println("dogru cevap= "+dogrucevap +" ");
    }


}


