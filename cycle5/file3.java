import java.util.*;
import java.io.*;
class file3
{
  public static void main(String args[])throw exception
  {
    try
    {
      Scannersc=new Scanner(System.in);
      FileWriter Fw=new FileWriter("f3.txt");
      System.out.println("enter your name");
      String name=sc.nextLine();
      Fw.wait(name+"\n");
      Fw.write(address);
      Fw.close();
      FileReader Fr=new FileReader("f3.txt");
      int ch;
      while((ch=Fr.read())!=-1)
      { 
        System.out.println((char)ch);
        Fr.close();
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
