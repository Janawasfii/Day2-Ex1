import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//EX1
// Develop a program that takes the weight (in kilograms) and height (in meters) as
// input and calculates the BMI, then prints it.
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the weight in kellograms:");
        double weight= sc.nextDouble();
        System.out.print("Please enter the height in meters:");
        double height= sc.nextDouble();
        double BMI = (weight / (height * height));
        System.out.printf("BMI=%.2f", BMI);

//EX2
// Write a program that takes the obtained marks and total marks as input and
//calculates the percentage, then prints it.
        Scanner scc= new Scanner(System.in);
        System.out.println("Please enter the marks:");
        int marks= scc.nextInt();
        System.out.println("Please enter the total marks:");
        int totalMarks= scc.nextInt();
        int s = (marks*totalMarks);
        double percantage = ((s)/(100));
        System.out.println("Percantage: "+percantage+"%");

//EX3
// Create a program that takes an amount in one currency and an exchange rate as
// input, then converts and prints the amount in another currency.

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double dollarAmount = s1.nextDouble();
        System.out.print("Enter the exchange rate(USD to EUR): ");
        double exchange = s1.nextDouble();
        double eurosAmount = dollarAmount * exchange;
        System.out.printf("Amount in EUR: %.1f", eurosAmount);

//EX4
// Create a program that takes a string as input, calculates its length, and then reverses
// the string using the StringBuilder class, finally printing both the length and reversed
// string.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int strLen = str.length();
        StringBuilder revStr = new StringBuilder(str).reverse();
        System.out.println("Length of the string: " + strLen);
        System.out.println("Reversed string: " + revStr);

//EX5
// Develop a program that takes a sentence as input and extracts a substring from it,
// then prints the extracted substring.
        Scanner sub = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sen = sub.nextLine();
        System.out.print("Start index: ");
        int stInd = sub.nextInt();
        System.out.print("End index: ");
        int endInd = sub.nextInt();
        String subStr = sen.substring(stInd, endInd);
        System.out.println(subStr);
//EX6
// Write a program that takes a sentence and a keyword as input, then check if the
// keyword is present in the sentence and prints the result.
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sen1 = sr.nextLine();
        System.out.print("Enter a keyword: ");
        String keyWord = sr.nextLine();
        System.out.println("Keyword \"" + keyWord + "\" " + (sen1.indexOf(keyWord.toLowerCase()) != -1 ? "is present" : "is not present") + " in the sentence.");


// Ex7
// Develop a program that takes a sentence and a word to replace as input, then
// replace all occurrences of the word with another word and prints the modified
// sentence.
        Scanner words = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = words.nextLine();
        System.out.print("Please enter the word to replace: ");
        String repWord = words.nextLine();
        System.out.print("Enter the replacement word: ");
        String replWord = words.nextLine();
        String repSen = sentence.replaceAll(repWord, replWord);
        System.out.println(repSen);

//EX8
//Write a program that takes two strings as input and check if they are equal, ignoring
//the case, then prints whether they are equal or not.
        Scanner compare = new Scanner(System.in);
        System.out.print("String 1: ");
        String S1 = compare.nextLine();
        System.out.print("String 2: ");
        String S2 = compare.nextLine();
        boolean stringsEqual = S1.equalsIgnoreCase(S2);
        String result = stringsEqual ? "Strings are equal (ignoring case)." : "Strings are not equal.";
        System.out.println(result);
}}
