import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.trace("Application started...");

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Double firstParameter = scanner.nextDouble();
        Double secondParameter = scanner.nextDouble();
        Double thirdParameter = scanner.nextDouble();
        SquareEquation equation =
                new SquareEquation(firstParameter, secondParameter, thirdParameter);
        logger.info("Equation with parameters: [" + firstParameter+ ", " + secondParameter + ", " +thirdParameter+ "] were created");
        System.out.println(calculator.solveEquality(equation));
        logger.info("Solution is" + calculator.solveEquality(equation).toString());
    }
}
