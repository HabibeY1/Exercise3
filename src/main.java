import java.util.Scanner;
public class main {
    public static void main(String[] args)

    {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter your height  : ");
            float height = scanner.nextFloat();


            System.out.print("Enter your weight : ");
            float weight = scanner.nextFloat();

            float bmi = weight / (float)Math.pow(height,2);

            String message;
            if (bmi < 16.0) {
                message = "Starvation";
            } else if (bmi >= 16.0 && bmi <= 16.99) {
                message = "Emaciation";
            } else if (bmi >= 17.0 && bmi <= 18.49) {
                message = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 22.99) {
                message = "Normal, low range";
            } else if (bmi >= 23.0 && bmi <= 24.99) {
                message = "Normal, high range";
            } else if (bmi >= 25.0 && bmi <= 27.49) {
                message = "Overweight, low range";
            } else if (bmi >= 27.5 && bmi <= 29.99) {
                message = "Overweight, high range";
            } else if (bmi >= 30.0 && bmi <= 34.9) {
                message = "1st degree obesity";
            } else if (bmi >= 35.0 && bmi <= 39.9) {
                message = "2nd degree obesity";
            } else {

                message = "3rd degree obesity";
            }

            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("BMI Category: " + message);

            scanner.close();
        }
    }


