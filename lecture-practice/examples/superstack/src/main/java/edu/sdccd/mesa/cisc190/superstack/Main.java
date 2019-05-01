package edu.sdccd.mesa.cisc190.superstack;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        SuperStack<String> stack = new SuperStack<>(6);
        System.out.println("stack size is " + stack.size());
        System.out.println("stack capacity is " + stack.capacity());
        stack.push("blue");
        stack.push("red");
        stack.push("green");
        stack.push("yellow");
        stack.push("cyan");
        stack.push("magenta");

        System.out.println(stack);
        String s = stack.pop();
        System.out.println("magenta is " + s);

        List<String> top = stack.pop(4);
        System.out.println(top);

    }
}
