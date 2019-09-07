package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal;

public class OctalToDecimal {
    public static int convertToDecimal(String s) 
      {
         int conver=1;
         int result=0;
        for(int i=1;i<=s.length();i++)
        {
        if(s.charAt(s.lenghth()-i)<8)
      result+=s.charAt(s.length()-i*conver;
                 conver*=8;
                       }              
     return result;
    }
                  
    public static void main(String args[])
                       {   
                           int res;
                            Scanner sc= new Scanner(System.in);
                            String oct= sc.nextLine();
                           res = OctalToDecimal.convertToDecimal(oct);
                        System.out.println(res);
                       }
}
