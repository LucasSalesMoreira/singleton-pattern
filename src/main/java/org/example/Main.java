package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public List<SingletonPattern> createSingletons(int n) {
    var singletons = new ArrayList<SingletonPattern>();
    for (int i = 0; i < n; i++) {
      singletons.add(SingletonPattern.getInstance());
    }
    return singletons;
  }
}