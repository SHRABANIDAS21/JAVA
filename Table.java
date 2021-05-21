import java.util.Scanner;
public class Table{
public static void main(String[]args){
 int a,b,c;
  Scanner myobj = new Scanner (System.in);
  System.out.print("Enter number:");
 
 a= myobj.nextInt();
 for(b= 1;b<=10;b++){
 System.out.printf( "%d* +%d= %d\n",a,b,(a*b));
 }
 }
 }
 