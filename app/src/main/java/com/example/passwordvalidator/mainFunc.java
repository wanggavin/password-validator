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
        if(pwd.equals("password"))   //pass rule 1
            return false;

        else{
            if(pwd.length()<8)	//pass    rule 2
                return false;

            else{
                if(pwd.equals("12345678")|| pwd.equals("87654321"))		//pass   rule 3
                    return false;

                else{
                    if(pwd.length()>16) //pass		rule 4
                        return false;

                    else{						// pass 	rule 5
                        int i = pwd.length();
                        int j = 0;
                        int k = 0;

                        for(j=0;j<i;j++){
                            if(Character.isAlphabetic(pwd.charAt(k)))
                                k++;
                        }
                        if(k==i)
                            return false;
                    }
                }
            }
        }
        return true;
    }


}