
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Calculate the student grade! \n\n\n");
        System.out.print(" Enter student Name: ");
        String name = sc.nextLine();
        System.out.print(" Enter student Marks.. \n English : ");
        int English = sc.nextInt();
        System.out.print(" Mathematics : ");
        int Mathematics = sc.nextInt();
        System.out.print(" Science  : ");
        int Science = sc.nextInt();
        System.out.print(" Computer Science : ");
        int ComputerScience = sc.nextInt();
        int TotalMark = English + Mathematics + Science + ComputerScience;
        double AverageMark = TotalMark / 4;

        System.out.println("\nYour Total Mark is: " + TotalMark);
        System.out.println("Your Average Mark is: " + AverageMark);

        if(AverageMark >= 90)
            System.out.println("Your Grade is : A+ grade");
        else if(AverageMark >= 80)
            System.out.println("Your Grade is : A grade");
        else if(AverageMark >= 70)
            System.out.println("Your Grade is : B+ grade");
        else if(AverageMark >= 60)
            System.out.println("Your Grade is : B grade");
        else if(AverageMark >= 50)
            System.out.println("Your Grade is : C grade");
        else
            System.out.println("Fail. Better luck next time");

        System.out.println("\nThank you for Calculate the student grade! \n\n\n");
        sc.close();

    }
}
