import org.example.SingletonPattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  /**
   * Teste para verificar se a instância de SingletonPattern é única.
   */
  @Test
  public void testSingletonPattern() {
    var singleton = SingletonPattern.getInstance();
    for (int i = 0; i < 100; i++) {
      var otherSingleton = SingletonPattern.getInstance();
      assertEquals(singleton.getInstanceId(), otherSingleton.getInstanceId());
      assertEquals(singleton, otherSingleton);
    }
  }
}
