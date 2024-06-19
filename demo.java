import java.util.*;
public class demo  
{  
public static void main(String[] args)   
{  
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int reverse = 0; 
while(a != 0)   
{  
int remainder = a% 10;  
reverse = reverse * 10 + remainder;  
a = a/10;  
}  
System.out.println(reverse);  
}  
}  