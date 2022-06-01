package com.exam.hello;

public class LogicCircuit {
  public static void main(String[] args) {
    StartSockets startSockets = new StartSockets();
    Or or = new Or();
    And and = new And();
    Not not = new Not();

    or.inputFrom(true, false);
    and.inputFrom(true, false);
    not.inputFrom(true, false);

    startSockets.install(or);
    startSockets.install(and);
    startSockets.inputFrom(true, false);
    

    System.out.println(or.output());
    System.out.println(and.output());
    System.out.println(not.output());
    startSockets.displaySockets();
    startSockets.displayStates();
  }
}
