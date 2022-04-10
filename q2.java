package com.company;
import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input an integer");
        int n=sc.nextInt();
        if(n%7==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}
