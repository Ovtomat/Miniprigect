package com.example.student5.miniproject1;

import java.util.Arrays;

public class Characterchoices {
    String[] inventory;
    int[] choices=new int[3];
    Characterchoices(){
        this.choices[0]=0;
        this.choices[1]=0;
        this.choices[2]=0;
        this.inventory  = Arrays.copyOf(this.inventory, this.inventory.length + 1);
        this.inventory[this.inventory.length - 1] = "Зажигалка";
        }
    public void addtoinvent(String c){
        if (Arrays.asList(this.inventory).contains(c)){
            this.inventory=this.inventory;
        }else{
            this.inventory  = Arrays.copyOf(this.inventory, this.inventory.length + 1);
            this.inventory[this.inventory.length - 1] = c;
        }
        return;


    }
    public void changechoices(int a,int b){
        this.choices[a]=b;
        return ;
    }



    }










}
