package org.example;

public class SingletonPattern {
  private static SingletonPattern instance;
  private int instanceId = 0;

  private SingletonPattern() {
    this.instanceId++;
  }

  public static SingletonPattern getInstance() {
    if (instance == null) {
      instance = new SingletonPattern();
    }
    return instance;
  }

  public int getInstanceId() {
    return this.instanceId;
  }
}
