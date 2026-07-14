public class TestCalculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        if (calc.add(5,3) != 8) {
            System.out.println("Addition Test Failed");
            System.exit(1);
        }

        if (calc.subtract(8,5) != 3) {
            System.out.println("Subtraction Test Failed");
            System.exit(1);
        }

        System.out.println("All Tests Passed");

    }

}
