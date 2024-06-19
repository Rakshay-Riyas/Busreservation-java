import java.io.*;
import java.util.*;

import javax.sound.midi.Soundbank;

public class demo{

    public static void main(String[] args) {
    /*  Scanner scan = new Scanner(System.in); 
   int n = scan.nextInt();
   System.out.print(fun(n));
    }
    static boolean fun(int n){
    int orginal = n;
    int sum = 0;
    while(n>0){
        int rem=n%10;
        n=n/10;
        sum=sum+rem*rem*rem;
    }
    return sum == orginal;
}
}/* */


 /*    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt(); //5
    for(int i =0;i<n;i++){
        int s =0;
        int noofspaces=n-i-1;//4
        int noofstars1=n - noofspaces; //1
        int noofstars2 = noofstars1 - 1; //0
        for(int j=0;j<noofspaces;j++){
            System.out.print(" _");
        }

        for(int j=0;j<noofstars1;j++){
            if(s == 0){
                System.out.print(" 7");
                s=1;
            }
            else{
                System.out.print("  ");
                s=0;
            }
        }
        for(int j=0;j<noofstars2;j++){
            if(s == 0){
                System.out.print(" 7");
                s=1;
            }
            else{
                System.out.print("  ");
                s=0;
            }
        }
        System.out.println();
    }*/
    /*pattern(5);
}
static void pattern(int n){
     for(int row=1;row<=n;row++){
        for(int col=1;col<=n;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
}

}
}   
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int sum = 0;
    for(int i:arr)
        sum +=i;
        System.out.println(sum);
    }
}*/ 
int a =5;
for(int i =0;i<=a;i++){
    System.out.println(i);
}
    }
}