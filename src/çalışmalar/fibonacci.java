package çalışmalar;

public class fibonacci {
    public static void main(String[] args) {
        int i,m,n,p;
        // 0 1 1 2 3 5 8 13 21 34
            i=1;
            p=1;

        i=i+p; //2
        p=i+p;  //3
        System.out.println("i = " + i);
        System.out.println("p = " + p);

        i=i+p;   //5
        p=i+p;   //8
        System.out.println("i = " + i);
        System.out.println("p = " + p);

        i=p+i; //13
        p=p+i; //21
        System.out.println("i = " + i);
        System.out.println("p = " + p);

        i=p+i; //34
        p=p+i; //55
        System.out.println("i = " + i);
        System.out.println("p = " + p);

        i=p+i; //89
        p=p+i; //144
        System.out.println("i = " + i);
        System.out.println("p = " + p);



        for( i=1;i<1000;i++){
            System.out.println(" döngüye girmeden i = " + i);
            for(p=1;p<1000;p++){
                System.out.println("döngü içindeki ilk i = " + i);
                System.out.println("döngü içindeki ilk p = " + p);
                 i=i+p;
                 p=i+p;
                System.out.println("döngü içindeki i = " + i);
                System.out.println("döngü içindeki p = " + p);
                       p--;
                System.out.println("p = " + p);
            }
            System.out.println("döngüden sonraki i = " + i);
        }
    }
}
