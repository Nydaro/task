import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        double num1,num2;
        int howmany;
        String check1;
    /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        System.out.print("사용 하실 계산기의 횟수를 입력해주세요! : ");
        howmany=input.nextInt();
        System.out.print("표기할 소수점 자리수를 입력해주세요 : ");
        int cutdouble = input.nextInt();
        input.nextLine();
        for (int i= 1;i<=howmany;i++){
            System.out.println("계산기에 입력할 첫번째 숫자와 두번째 숫자를 입력해주세요!");
            System.out.print("첫번째 숫자 : ");
            num1=input.nextDouble();
            input.nextLine();
            System.out.print("연산자 종류를 고르십시오. (+ , -, *, /) : " );
            check1= input.nextLine();
            System.out.print("두번째 숫자 : ");
            num2=input.nextDouble();
            System.out.println(CalculatorSys(num1,num2,check1,cutdouble));
        }
        System.out.println("이용해주셔서 감사합니다.");
    }
    public static String CalculatorSys(double first,double second,String check,int cutting){

        switch (check){
            case "+" : {
                return String.format("%."+cutting+"f + %."+cutting+"f = %."+cutting+"f",first,second,first+second);}
            case "-" : {
                return String.format("%."+cutting+"f - %."+cutting+"f = %."+cutting+"f",first,second,first-second);}
            case "*" : {
                return String.format("%."+cutting+"f * %."+cutting+"f = %."+cutting+"f",first,second,first*second);}
            case "/" : {
                return String.format("%."+cutting+"f / %."+cutting+"f = %."+cutting+"f",first,second,first/second);}
            default: return "잘못된 입력";
        }

    }
}