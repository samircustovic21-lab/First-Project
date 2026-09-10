
import java.util.Scanner;


public class Main {


public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Ange övningens namn: ");
    String name = input.nextLine();

    System.out.print("Ange vikt (kg): ");
    int weight = input.nextInt();

    System.out.println("Ange antal reps: ");
    int reps = input.nextInt();

    // 2. Skapa objektet baserat på inmatningen
    Exercise myExercise = new Exercise(name, weight, reps);

    // 3. Hämta beräkningen och skriv ut din output
    double estimated1RM = myExercise.calculator1RM();;
        
    System.out.println("\n--- 1RM ---");
    System.out.println("Övning: " + myExercise.getName());
    System.out.printf("Ditt uppskattade 1RM är: %.1f kg\n", estimated1RM);
        
    input.close();

}

}

