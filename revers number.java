import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in)
int a =sc.nextInt();
int r,s=0;
while(a!=0)
{
  r=a%10;
  s=s*10+r;
a=a/10;
}
System.out.println(s);
}
}
