import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Operations {
    public void getSolve() {
        Scanner scanner = new Scanner(System.in);

        try {
            String num1Str = scanner.next();
            String num2Str = scanner.next();
            String operation = scanner.next();

            BigDecimal num1 = new BigDecimal(num1Str);
            BigDecimal num2 = new BigDecimal(num2Str);

            BigDecimal result;
            switch (operation) {
                case "ADD":
                    result = num1.add(num2);
                    break;
                case "SUB":
                    result = num1.subtract(num2);
                    break;
                case "MULT":
                    result = num1.multiply(num2);
                    break;
                case "DIV":
                    result = num1.divide(num2);
                    break;
                case "REM":
                    result = num1.remainder(num2);
                    break;
                case "POW":
                    BigInteger exponent = num2.toBigInteger();
                    result = num1.pow(exponent.intValue());
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемая операция: " + operation);
            }

            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
