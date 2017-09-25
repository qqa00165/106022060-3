import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,number3,number4,number5,sum;
        System.out.print("a:");
        number1=input.nextInt();
        System.out.print("x:");
        number2=input.nextInt();
        System.out.print("b:");
        number3=input.nextInt();
        System.out.print("x:");
        number4=input.nextInt();
        System.out.print("c:");
        number5=input.nextInt();
        sum=number1*(number2*number2)+number3*number4+number5;
        System.out.printf("計算結果=%d",sum);
        input.close();

        // write your code here
    }
}
