package com.exam.hello;
import java.util.ArrayList;
import java.util.List;

public class StartSockets implements Socket {
  private List<Circuit> sockets = new ArrayList<>();
  private List<Boolean> states = new ArrayList<>();
  private static final int MAX_SOCKET_SIZE = 4;
  private static final String CIRCUIT_NAME = "START SOCKETS";

  public void inputFrom(boolean inA, boolean inB) {
    this.sockets.stream().forEach(s -> s.inputFrom(inA, inB));
    for (int i = 0; i < this.sockets.size(); i++)
      this.states.set(i, this.sockets.get(i).output());
  }

  public boolean outputFrom(int index) {
    return this.states.get(index);
  }

  // return false in case of maximum size error.
  // default state sets to false.
  public boolean install(Circuit circuit) {
    if (MAX_SOCKET_SIZE - 1 < this.sockets.size())
      return false;
    else {
      this.sockets.add(circuit);
      this.states.add(false);
      return true;
    }
  }

  public void displaySockets() {
    if (this.sockets.isEmpty())
      System.out.println("StartSockets is empty.");
    else
      this.sockets.stream().forEach(c -> System.out.println(c.circuitName()));
  }

  public void displayStates() {
    if (this.sockets.isEmpty())
      System.out.println("StartSockets is empty.");
    else
      this.states.stream().forEach(System.out::println);
  }

  public String circuitName() {
    return CIRCUIT_NAME;
  }
}
