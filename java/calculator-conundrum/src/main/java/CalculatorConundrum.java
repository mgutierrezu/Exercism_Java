class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        int result = 0;

        try {
            if (operation.equals("+")) {
                result = operand1 + operand2;
            } else if (operation.equals("*")) {
                result = operand1 * operand2;
            } else if (operation.equals("/") && operand2 == 0) {
                throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
            } else if (operation.equals("/")) {
                result = operand1 / operand2;
            } else if (operation.equals("")) {
                throw new IllegalArgumentException();
            } else {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (NullPointerException e) {
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            }
        } catch (IllegalArgumentException e) {
            if (operation.equals("")) {
                throw new IllegalArgumentException("Operation cannot be empty");
            }
        }

        return String.valueOf(operand1).concat(" ").concat(String.valueOf(operation)).concat(" ")
                .concat(String.valueOf(operand2)).concat(" = ").concat(String.valueOf(result));

    }

}
