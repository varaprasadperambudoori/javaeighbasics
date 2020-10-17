package com.java.varajavabasics;

import java.util.function.*;

public class FunctionalInterfaces {

    //lambda express to replace anonymous inner classes
    /*
    java.util.function
    java.util.stream

    its using functional interfaces even though java is object oriented

    predicate interface is the most common used - it take one argument -validate and return boolean
    consumer interface it take one arugument and returns no value
    Function interface it takes one arugment and produces a results
    suplier it dont take arugment but suplies a result
    UnaryOperator takes a single arugument and returns singlevalue
    BinaryOperator takes a two arguments  and returns single values
     */

    public static void main(String[] args) {

        Predicate<String> usingPredicateInterface = (oneArgument) -> oneArgument.length() > 10;
        System.out.println(usingPredicateInterface.test("TestPredicateStringLength") + " _ TestPredicateStringLength is greater then  than 10");


        Consumer<String> usingConsumer = (oneArg) -> System.out.print(oneArg.toLowerCase());
        usingConsumer.accept("USINGCOSUMNERINTERFace");


        Function<Integer, String> usingFunctionInterface = (number) -> number.toString();
        System.out.print("FunctionInterfaceHasTakeIntegerandReturntheLenthInString :" + usingFunctionInterface.apply(100).length());


        Supplier<String> usingSuplier = () -> "Java FunctionalINterfaces";
        System.out.print(usingSuplier.get());

        BinaryOperator<Integer> usingBinaryOperator = (a, b) -> a * b;
        System.out.print("Using Binary " + usingBinaryOperator.apply(5, 7));


        UnaryOperator<String> usingUnaryOperator = (message) -> message.toUpperCase();
        System.out.print("Using Unary Operator to convertUpper case:  " + usingUnaryOperator.apply("using unary operator"));

    }


}
