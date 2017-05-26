package com.example.passwordvalidator;

/**
 * Created by rainb on 2017/5/26.
 */

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Scanner;

public class mainFunc {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter the password: ");
        String pwd = keyboard.nextLine();

        if(isStrong(pwd)==true){
            System.out.println("strong");
        }
        else{
            System.out.println("not strong");
            System.exit(0);
        }
    }


    public static boolean isStrong(String pwd){
        if(pwd.equals("password"))   //pass 1
            return false;

        else{
            if(pwd.length()<8)	//pass 2
                return false;
        }
        return true;
    }
}