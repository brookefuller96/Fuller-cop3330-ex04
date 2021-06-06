import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args)
    {
        System.out.println("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();
        System.out.println("Enter a past tense verb: ");
        Scanner input2 = new Scanner(System.in);
        String verb = input2.nextLine();
        System.out.println("Enter an adjective: ");
        Scanner input3 = new Scanner(System.in);
        String adjective = input3.nextLine();
        System.out.println("Enter an adverb: ");
        Scanner input4 = new Scanner(System.in);
        String adverb = input4.nextLine();
        System.out.println("My best friend Taylor Swift and I "
                + adverb + " " + verb + " across the " + adjective + " "
                + noun + " last summer." );


    }
}
