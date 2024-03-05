import java.util.Scanner;
public class dataHora {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int hour;

        System.out.println("What time is it?");
        hour = sc.nextInt();

        if(hour<12){
            System.out.print("Good Morning!");
        } else if (hour > 12 && hour<17){
            System.out.print("Good Afternoon!");
        }else if(hour>24){
            System.out.print("Invalid hour!");
        } else{
            System.out.print("Good Evening!");
        }
    }

}
