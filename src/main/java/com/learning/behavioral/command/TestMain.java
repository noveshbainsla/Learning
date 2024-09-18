package com.learning.behavioral.command;

import com.learning.behavioral.command.commands.Addition;
import com.learning.behavioral.command.commands.Division;
import com.learning.behavioral.command.commands.Multiplication;
import com.learning.behavioral.command.commands.Subtraction;

/*
   Command design pattern:
    Command pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.
    most important classes in this pattern are the Command, the Receiver, and the Invoker.

    Command: declares an interface for executing an operation. it has an execute method.
    Receiver: knows how to perform the operations associated with carrying out a request.
    ConcreteCommand: implements the execute method by invoking the corresponding operation(s) on the Receiver.
    in this example receiver is merged with command classes.

    this pattern makes it feasible to transform a functionality into a class or argument. So invoker can pass the command object in excuteCommand method.
    and the specific command can be used in multiple requirements without duplicating these functionalities.

    For example if we create some other feature that also adds then we can use the same Addition command class there too.

    This pattern also makes it simple to store the history of commands and undo the commands.
    in the context object i.e. Calculator class we can store the past commands and undo the commands.
 */
public class TestMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.executeCommand(new Addition(calculator, 10));
        calculator.executeCommand(new Subtraction(calculator, 5));
        calculator.executeCommand(new Multiplication(calculator, 4));
        calculator.executeCommand(new Division(calculator, 2));

        System.out.println("Result: " + calculator.getResult());
    }
}
