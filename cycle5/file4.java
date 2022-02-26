import java.io.*;
import java.util.*;
class file4
{
  public static void main(String arg[])throws Exception
  {
         try
         {
       FileInputStream fin=new FileInputStream("f4.txt");
       int ch;
              String a;int sum=0;
              System.out.println("yhe number in the file are : ");
              while((ch=fin.read())!=-1)
              {
                        String s=Character.toString((char)ch);
                        StringTokenizer st=new StringTokenizer(s);
                        while( st.hasMoreTokens())
                        {
                                  a=st.nextToken();
                                  int b=Integer.pareInt(a);
                                  System.out.Println(b);
                                      sum=sum+b;
                          }
                        }
                        System.out.println("the sum is"+sum);
                        }
                      catch(Exception e)
                      {
                           System.out.print(e);
                       }
                   }
       
       }
