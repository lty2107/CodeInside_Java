package ru.codeinside.lessons.javacore.exceptionlab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;

public class OperationFactory {

    private final Logger log = LogManager.getLogger(OperationFactory.class);

    public static void main(String[] args) {
        var operationFactory = new OperationFactory();
        operationFactory.parseAndDivide();
        operationFactory.checkLength();
    }

    private void parseAndDivide() {
        log.info("метод parseAndDivide() успешно стартовал.");
        List<String> source = List.of("2", "5", "0", "10", "10000000000", "-100", "qwerty");
        for (String element : source) {
            int value;
            double result;
            try {
                value = Integer.parseInt(element);
                result = 1000 / value;
                System.out.println(result);
            } catch (ArithmeticException e) {
                log.info("Error: Divide by zero");
                System.out.println(e);;
            } catch (IllegalArgumentException e) {
                log.info("Error: invalid data type");
                System.out.println(e);
            }

        }
    }

    private void checkLength() {
        List<String> source = Arrays.asList("car", "table", "", "01", "alphabet", null, "zero");
        System.out.println(" ");
        for (String element : source) {
            try {
                int length = element.length();
                System.out.println(length);
            } catch (NullPointerException e) {
                log.info("Error: element in null");
                System.out.println(e);
            }
        }
    }
}
