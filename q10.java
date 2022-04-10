package com.company;
import java.util.*;
public class q10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=0;
        for(int i=1;i<=n;i++){
            p=m*i;
            System.out.println(p);
        }
    }
}
