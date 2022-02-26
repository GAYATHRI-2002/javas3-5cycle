import java.util.*;
import java.io.*;
class file2
{
  public static void main(String args[])
  { 
    FileInputStream file=new FileInputStream("f1.txt");
    int c, l,w;
    c=w=l=0;
    int ch;
    while((ch=file.read())!=-1)
    {
      c++;
      if(ch=='\n')
      {
        l++;
      }
      if(ch==''||ch=='\n')
      {
        w++;
      }
    }
    System.out.println("no of characters="+c);
    System.out.println("no of lines="+l);
    System.out.println("no of words="+w);
    file.close();
  }
}
