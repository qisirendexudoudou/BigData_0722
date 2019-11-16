package com.atguigu.lgl;
class  test8  {
       public static void main (String []  args)  {
           boolean x=true;
           boolean y=false;
           short z=42;
			//if(y == true)
             if((z++==42)&&(y=true))z++; //42 == 42 ture && true Ϊ true; z= 44 
             if((x=false) || (++z==45))  z++; //false ||45 == 45  Ϊ true; z= 46

            System.out.println("z="+z);// 46
            }
   }

