
import java.util.*;

class cal{
    static String w="Welcome_to_miniCalculator";
    public static int add(int no1,int no2){
        return(no1+no2);
    }
    public static int subtract(int no1,int no2){
        return(no1-no2);
    }
    public static int multiply(int no1,int no2){
        return(no1*no2);
    }
    public static float divide(int no1,int no2){
        if(no2==0){
            System.out.println("invalid");
        }
        return(no1/no2);
    }
    public static int remainder(int no1,int no2){
        if(no2==0){
            System.out.println("invalid");
        }
        return(no1%no2);
    }
    public static int answer(int no1,int no2){
        while(true) {
            System.out.println("options are:" + '\n' + "(+) add" + '\n' + "(-) subtract" + '\n' + "(*) multiply" + '\n' + "(/) division" + '\n' + "(%) remainder" + '\n' + " exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter option:");
            String option = sc.next();
            float output=0;
        switch (option) {
            case "+":
                output=add(no1, no2);
                break;
            case "-":
                output=subtract(no1, no2);
                break;
            case "*":
                output=multiply(no1, no2);
                break;
            case "/":
               output=divide(no1, no2);
                break;
            case "%":
                output=remainder(no1, no2);
                break;
            default:
                System.out.println("invalid option");
                break;
        }
            System.out.println(no1+option+no2 +"=" +output);
            System.out.println("---------------X--------------------");
            cal.w="miniCalculator";
            System.out.println(cal.w);
    }
        }
    }
public class calculator {
    public static void main(String[] args) {
        System.out.println(cal.w);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        cal c1 = new cal();
        c1.answer(no1,no2);
    }
}













 