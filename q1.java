package com.company;
import java.util.*;
public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input an integer");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
