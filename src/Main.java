import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(new File("C:\\Users\\lizap\\Desktop\\учьоба\\PAZURA\\kr\\src\\input.txt"));
        PrintWriter out =
                new
                        PrintWriter(
                        "output.txt"
                );
       int one= sc.nextInt();
       int count=one;
       if(one!=0){
       int tmp=0;
       int res1=1;
       int tmp1=1;
       do{
          tmp=one;
          one=sc.nextInt();
          count--;
          if(one>tmp && count!=0) {
              res1++;
          }
       }
       while(count!=0);
       String str=""+tmp1;
       out.print(str);
    }
}}