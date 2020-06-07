import java.util.*;
public class MinYearDay{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no.of minutes:");//Enter no.of minutes:3456789
      int minutes = sc.nextInt();
      int year = minutes/525600;
      int remMin = minutes%525600;
      int day = remMin/1440;
      System.out.println(minutes+"minutes is approximately"+year+"years and"+day+"days.");
      //3456789 minutes is approximately 6years and 210days.
   }
}
