import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public List<Double> solveEquality (SquareEquation equality) {
        List<Double> result = new ArrayList<Double>();
        Double firstRoot;
        Double secondRoot;
        Double determinant = Math.pow(equality.parameterB, 2)
                - 4*equality.parameterA*equality.parameterC;
        if (determinant < 0) {
            logger.error("No solution");
            throw new NoRealSolution("Equality has no solution in the real numbers field");
        }
        firstRoot = (-equality.parameterB + Math.sqrt(determinant))/2;
        secondRoot = (-equality.parameterB - Math.sqrt(determinant))/2;
        result.add(firstRoot);
        result.add(secondRoot);
        return result;
    }
}
