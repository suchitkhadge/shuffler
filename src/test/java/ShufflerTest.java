import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] data = {1, 2, 3, 4, 5 , 6, 7, 8, 9};
    int[] preShuffle = Arrays.copyOf(data, data.length);
    Shuffler shuffler = new Shuffler(new SecureRandom());
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));
    assertFalse( Arrays.equals(preShuffle, data));

  }
}