import java.util.Scanner;
public class MinDayYear{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter no.of minutes:");
   int minutes = input.nextInt();
   int year = minutes/525600;
   int remainingMinutes = minutes%525600;
   int day = remainingMinutes/1440;
   System.out.println("minutes+"Minutes is approximately"+year+"years and"+day+"days.");
   }
}
