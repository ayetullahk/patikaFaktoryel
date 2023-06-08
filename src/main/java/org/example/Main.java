package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,total=1,total2=1,total3=1,totalk;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kombinasyon Sayısı :");
        n= inp.nextInt();

        System.out.print("Kombinasyon boyutu :");
        r= inp.nextInt();

        int h=(n-r);

        for (int i=1;i<n;i++) {
             total*=i;
        }
        for (int k=1;k<r;k++){
            total*=k;
        }
        for (int b=1;b<h;b++){
            total3*=b;
        }
        totalk=total/(total2*total3);
        System.out.println("Toplam kombinasyon adedi :"+totalk);
    }
}