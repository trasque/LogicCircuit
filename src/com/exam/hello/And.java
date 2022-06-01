package com.exam.hello;

public class And implements Circuit {
  private boolean state;
  private static final String CIRCUIT_NAME = "AND";

  public And() {
    this.state = false;
  }

  public void inputFrom(boolean inA, boolean inB) {
    this.state = inA && inB;
  }

  public boolean output() {
    return this.state;
  }

  public String circuitName() {
    return CIRCUIT_NAME;
  }
}
