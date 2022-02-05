import java.awt.*;
import java.util.Scanner;

public class Main {
    static long sum=0;
    static long num=0;
    static boolean result=false;
    static String lastChain="";
    static int maxCount=0;
    static int maxNumber=0;
    public static void main(String[] args) {
        //System.out.println("Bir sayı giriniz");
        //Scanner scan= new Scanner(System.in);
        //num = scan.nextInt();


        for (int i = 89; i <= 100; i++) {
            System.out.println("i: "+i);
            int count=0;
            num=i;
            String chain="";
            do {
                count++;
                sum=reverseNumber(num)+num;
                chain += "?"+ Long.toString(num)  +" "+ Long.toString(reverseNumber(num)) +" = " + Long.toString(sum)+" \n";
                System.out.println("sum: "+sum);
                num=isPalindrome(sum);
            }while(!result);
            if (count>maxCount) {
                maxCount=count;
                maxNumber=i;
                lastChain=chain;
            }
        }
        System.out.println("en uzun zincire sahip numara "+ maxNumber + "'dur ve "+maxCount+ " zincir işlem sonucunda oluşmuştur.");
        System.out.println("Zincir : " + lastChain);
    }

    public static long reverseNumber(long num){
        String reverse_number="";
        while(num > 0) {

        //System.out.print(num % 10);
            reverse_number +=num % 10;
            num /= 10;
        }
        System.out.println("reverse_number: "+reverse_number);

   // return Integer.parseInt(reverse_number);
        return Long.parseLong(reverse_number);
    }

    public static long isPalindrome(long num){

        long tempNum =reverseNumber(num);
        if (num == tempNum) {
            result=true;
            System.out.println(tempNum+" palindrome sayıdır");
        }
        else{
            result=false;
            System.out.println(num+" palindrome sayı değildir");
        }
        return num;
    }

}
