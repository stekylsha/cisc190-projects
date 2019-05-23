package edu.sdccd.mesa.cisc190.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.sdccd.mesa.cisc190.calculator.operators.AdditionOperator;
import edu.sdccd.mesa.cisc190.calculator.operators.DivisionOperator;
import edu.sdccd.mesa.cisc190.calculator.operators.MultiplicationOperator;
import edu.sdccd.mesa.cisc190.calculator.operators.SubtractionOperator;

/**
 * Main class which will drive the calculator.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    /*
     * Logger for variable logging.  From most to least: trace, debug, info,
     * warn, error.  Usually info or higher for production systems.  And
     * homework.
     */
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    /* Static constant with static initializer */
    private static final Map<String, Operator> OPERATORS = new HashMap<>();
    static {
        OPERATORS.put("+", new AdditionOperator());
        OPERATORS.put("-", new SubtractionOperator());
        OPERATORS.put("*", new MultiplicationOperator());
        OPERATORS.put("/", new DivisionOperator());
    }

    public static void main(String... args) {
        // create two calculators, one from the hw3 stack
        // and one that's a subclass of java.util.Stack.
        List<Calculator> calculators = List.of(
                new SuperStackCalculator(),
                new P3StackCalculator()
        );
        List<Number> answers;
        if (args.length > 0) {
            answers = initCalculators(calculators, args);
        } else {
            answers = initCalculators(calculators);
        }
        // lambda instead of a for loop.
        answers.forEach( num -> System.out.format("The answer is %4.8f%n", num));
    }

    private static List<Number> initCalculators(List<Calculator> calculators) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        do {
            if (scanner.hasNextBigDecimal()) {
                BigDecimal bd = scanner.nextBigDecimal();
                calculators.forEach(calculator ->
                        calculator.addOperand(bd));
            } else if (scanner.hasNext("[+\\-*/]")) {
                String op = scanner.next("[+\\-*/]");
                calculators.forEach(calculator ->
                        calculator.addOperator(OPERATORS.get(op)));
            } else {
                scanner.nextLine();
                done = true;
            }
        } while (!done);

        return calculate(calculators);
    }

    private static List<Number> initCalculators(List<Calculator> calculators, String[] args) {
        for (String arg : args) {
            Operator op = OPERATORS.get(arg);
            if (op != null) {
                LOG.debug("op is '{}'", op.toString());
                calculators.forEach(calculator ->
                        calculator.addOperator(op));
            } else if (arg.matches("-*\\d+(.\\d*)*")) {
                System.out.println("arg is " + arg);
                calculators.forEach(calculator ->
                        calculator.addOperand(new BigDecimal(arg)));
            } else {
                throw new IllegalArgumentException("\'" + arg + "\' is not a number or an operator.");
            }
        }
        return calculate(calculators);
    }

    private static List<Number> calculate(List<Calculator> calculators) {
        List<Number> answers = new ArrayList<>(calculators.size());
        calculators.forEach(calculator ->
                answers.add(calculator.calculate()));
        return answers;
    }
}
