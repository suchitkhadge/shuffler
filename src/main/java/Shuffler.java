import java.util.Random;

public class Shuffler {

  private final Random rng ;

  //Constructor
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  // Method
  public void shuffle (int[] data){
    for(int i = data.length - 1; i > 0; i--) {
      int t = rng.nextInt(i + 1);
      if (t != i){

  // Swap 2 arrays
        int temp = data[t];
        data[t] = data [i];
        data[i] = temp;
      }
    }
  }



}
