import java.util.Scanner;

public class IT25103041Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks: ");
        double examMarks = input.nextDouble();

        System.out.print("Enter lab submission marks: ");
        double labMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks!");

        } else {

            System.out.print("Enter exam percentage: ");
            double examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            double labPercentage = input.nextDouble();

            if (examPercentage + labPercentage != 100) {

                System.out.println("Invalid percentages! Total must be 100.");

            } else {

                double finalMark =
                        (examMarks * examPercentage / 100) +
                        (labMarks * labPercentage / 100);

                System.out.println("Final Mark = " + finalMark);
            }
        }

    
    }
}