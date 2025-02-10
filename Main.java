import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Q 1 :Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.*/
        System.out.println("*************************");
        System.out.println("Welcome to BMI Calculator ");
        System.out.print("Please enter your weight in kg:");
        double weight = input.nextDouble();
        System.out.print("Please enter your height in m:");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("your BMI: "+String.format("%.2f", bmi)  );
        /* Q 2: Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.*/
        System.out.println("*************************");
        System.out.println("Welcome to the Percentage Calculator");
        System.out.print("Please enter obtained :");
        int obtained = input.nextInt();
        System.out.print("Please enter total marks :");
        int totalMarks = input.nextInt();
        double percentage = ((double) obtained / totalMarks) * 100;
        System.out.println("Percentage : " + String.format("%.1f", percentage)  + "%");
        /*  Q 3: Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.*/
        System.out.println("*************************");
        System.out.println("Welcome to Currency Converter");
        System.out.print("Please enter amount in USD:");
        int amountInUSD = input.nextInt();
        System.out.print("Please enter Exchange Rate (USD to EUR):");
        double exchangeRate = input.nextDouble();
        double amount = amountInUSD * exchangeRate;
        System.out.println("Amount in EUR : "+  String.format("%.1f", amount) + "%");
        /* Q 4:Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and reversed string.*/
        System.out.println("*************************");
        System.out.println("Welcome to string methods program ");
        System.out.print("Please enter a string: ");
        input.next();
        String str =input.nextLine();
        StringBuilder sb =new StringBuilder(str);
        System.out.println("Length of the string: "+ str.length() +" And Reversed string: " + sb.reverse());
        // Q 5:Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring
        System.out.println("*************************");
        System.out.println("Welcome to sentence substring program ");
        System.out.print("Please enter  sentence: ");
        String firstSentence = input.nextLine();
        System.out.print("Please enter start index: ");
        int startIndex = input.nextInt();
        System.out.println("Please enter end index: ");
        int endIndex = input.nextInt();
        System.out.print(firstSentence.substring(startIndex,endIndex));
        /* Q6 :Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result. */
        System.out.println("*************************");
        System.out.println("Welcome to sentence Checker program ");
        System.out.print("Please enter  sentence : ");
        String secondSentence = input.nextLine();
        System.out.print("Please enter  keyword : ");
        String keyword = input.nextLine();
        if(secondSentence.contains(keyword)){
            System.out.println("Keyword ( " + keyword + " )is present in the sentence.");
        }else {
            System.out.println("Keyword ( " + keyword + " )is Not present in the sentence.");}
        /* Q 7 Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified sentence. */
        System.out.println("*************************");
        System.out.println("Welcome to sentence Replacer ");
        System.out.print("Please enter a sentence: ");
        String thirdSentence = input.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();
        System.out.println(thirdSentence.replaceAll(wordToReplace, replacementWord));
        /* Q 8 DWrite a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.  */
        System.out.println("*************************");
        System.out.println("Welcome to String Equality Checker ");
        System.out.print("Please enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Please enter second string: ");
        String str2 = input.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are Not equal");
        }

}}