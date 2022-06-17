package com.bridgelabz;

public class DataTypes {
    public static void main(String[] args) {
        //boolean true/false(0/1) 1bit
        boolean status =true;
        System.out.println("Boolean data is :"+status);//true
        status=false;
        System.out.println("Updated value is :"+status);//false


        //character 2byte used to store single character
        char c1='A';
        System.out.println("Charactor is :"+c1);

        char c2='$';
        System.out.println("char data is :"+c2);

        char c3=97;//accepting ASCII code and storing its character
        System.out.println("char data is:"+c3);//a


        //byte 1 byte  -128 to127
        byte b1=127;
        System.out.println("byte data is :"+b1);


        //short 2byte 32768
        short s1=32000;
        System.out.println("short data is:"+s1);


        //int 4byte
        int i1=50000;
        System.out.println("int data is :"+i1);


        //long 8 byte
        long l1 =99999999999L;//int data not consider as default then use sufix
        System.out.println("long byte is:"+l1);


        //floating point 1.float2.double (by defult)
        //duble 8 byte (16 decimal digit)
        double d1=89.70d;
        System.out.println("double is :"+d1);


        //float 4 byte (8 decimal digit)
        float f1=12345612345612345656.70F;
        System.out.println("float is :"+f1);
        System.out.println("**********************************************");

    }

}



