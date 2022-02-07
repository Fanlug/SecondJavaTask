package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int num=2;
    boolean is = true;
    while (is) {
        try {
            System.out.println();
            num = in.nextInt();
            is = false;
        }catch (InputMismatchException e){
            System.out.println("Wrong format");
            in.next();
        }
    };

    int prime = 2;
    System.out.print(1+" ");
    if(num!=1){
        while(num!=1){
           if(num%prime==0){
               while(num%prime==0){
                   num/=prime;
               }
               System.out.print(prime+" ");
           }else{
            prime++;
           }
        }

    }else{

    }}

}
