import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter weight in pounds: ");
            double weightPounds = scanner.nextDouble();

            System.out.print("Enter feet: ");
            int feet = scanner.nextInt();

            System.out.print("Enter inches: ");
            int inches = scanner.nextInt();

            // Convert height to inches
            double totalInches = (feet * 12) + inches;

            // Convert weight to kilograms
            double weightKilograms = weightPounds * 0.453592;

            // Convert height to meters
            double heightMeters = totalInches * 0.0254;

            // Calculate BMI
            double bmi = weightKilograms / (heightMeters * heightMeters);

            System.out.println("BMI is: " + bmi);

            // Determine weight category
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Normal");
            } else {
                System.out.println("Overweight");
            }
        }
    }
}