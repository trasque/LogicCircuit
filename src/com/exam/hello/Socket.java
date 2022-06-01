package com.exam.hello;

public interface Socket {
  public void inputFrom(boolean inA, boolean inB);
  public boolean outputFrom(int index);
  public boolean install(Circuit circuit);
  public String circuitName();
}
