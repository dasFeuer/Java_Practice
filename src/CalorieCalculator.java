import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calorie Calculator");
        System.out.print("Enter your gender(M/F): ");
        String gender =sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double height = sc.nextDouble();
        System.out.print("Enter your activity level (sedentary/moderate/active): ");
        String activityLevel = sc.next();

        double bmr = 0;
        if(gender.equalsIgnoreCase("M")){
            bmr = Math.round(88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
        } else if (gender.equalsIgnoreCase("F")){
            bmr = Math.round(447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age));
        } else {
            System.out.println("Invalid gender input.");
        }

        double calorieNeeds;
        switch (activityLevel.toLowerCase()) {
            case "sedentary":
                calorieNeeds = Math.round(bmr * 1.2);
                break;
            case "moderate":
                calorieNeeds = Math.round(bmr * 1.55);
                break;
            case "active":
                calorieNeeds = Math.round(bmr * 1.725);
                break;
            default:
                System.out.println("Invalid activity level input.");
                return;
        }

        System.out.println("Your Basal Metabolic Rate (BMR) is: " + (int) bmr + " calories per day.");
        System.out.println("Your estimated daily calorie needs are: " + (int) calorieNeeds + " calories per day.");

        sc.close();
    }
}
