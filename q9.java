package com.company;
import java.util.*;
public class q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input number");
        int n=sc.nextInt();
        int m=0;
        for(int i=n;i>=2;i--){
            if (i%2==0){
                m=i;
                i--;
            }
            else {
                m=i-1;
                i--;
            }
            System.out.println(m);
        }
    }
}
