package com.exam.hello;

public class Or implements Circuit {
  private boolean state;
  private static final String CIRCUIT_NAME = "OR";

  public Or() {
    this.state = false;
  }

  public void inputFrom(boolean inA, boolean inB) {
    this.state = inA || inB;
  }

  public boolean output() {
    return state;
  }

  public String circuitName() {
    return CIRCUIT_NAME;
  }
}
