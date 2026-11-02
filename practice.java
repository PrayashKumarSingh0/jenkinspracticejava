public class practice {

    public static void main(String[] args) {
        String name = args.length > 0 ? String.join(" ", args) : "Jenkins";

        int firstNumber = 10;
        int secondNumber = 20;
        int total = add(firstNumber, secondNumber);

        System.out.println("Hello, " + name + "!");
        System.out.println(firstNumber + " + " + secondNumber + " = " + total);
        System.out.println("Java program completed successfully.");
    }

    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
