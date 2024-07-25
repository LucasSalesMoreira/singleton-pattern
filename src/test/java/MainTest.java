import org.example.Main;
import org.example.SingletonPattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  private final Main main = new Main();

  /**
   * Teste para verificar se a instância de SingletonPattern é única.
   */
  @Test
  public void testSingletonPattern() {
    for (SingletonPattern singleton : main.createSingletons(100)) {
      assertEquals(1, singleton.getInstanceId());
    }
  }
}
