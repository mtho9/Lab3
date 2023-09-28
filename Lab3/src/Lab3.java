
 public class Lab3 {
    public static void main(String[] args) {
        myXMLValidator validator = new myXMLValidator();

        IStack stack = new myStack();

        XMLValidatorTester tester = new XMLValidatorTester();

        double precision = tester.precision(validator, stack);
        System.out.println("Precision: " + precision);
    }
}

