import java.util.Scanner;
public class WeekUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7: ");
        int number = sc.nextInt();
        sc.close();
        if(number==1){
            System.out.println("Monday");
        }
        else if(number==2){
            System.out.println("Tuesday");
        }
        else if(number==3){
            System.out.println("Wednesday");
        }
        else if(number==4){
            System.out.println("Thursday");
        }
        else if(number==5){
            System.out.println("Friday");
        }
        else if(number==6){
            System.out.println("Saturday");
        }
        else if(number==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid number.");
        }
    }
}