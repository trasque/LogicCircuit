package com.exam.hello;

public class Not implements Circuit {
  private boolean state;
  private static final String CIRCUIT_NAME = "NOT";

  public Not() {
    this.state = true;
  }

  public void inputFrom(boolean inA, boolean inB) { // Do not use inB.
    this.state = !inA;
  }

  public boolean output() {
    return this.state;
  }

  public String circuitName() {
    return CIRCUIT_NAME;
  }
}
