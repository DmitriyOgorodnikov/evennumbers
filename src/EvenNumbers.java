import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvenNumbers {

  public static void main(String[] args) {
    String numbers = "34;45;52352;323;32";
    int[] array = intToArray(numbers);
    System.out.println(Arrays.toString(array));
  }

  private static int[] intToArray(String string){
    Pattern pattern = Pattern.compile("(\\b\\d*[02468]\\b)");
    Matcher matcher = pattern.matcher(string);
    int[] result;
    int amount =0;
    int count = 0;

    while (matcher.find()){
      amount++;
    }
    matcher.reset();

    result = new int[amount];

    while (matcher.find()){
      result[count] = Integer.parseInt(matcher.group());
      count++;
    }
    Arrays.sort(result);

    return result;
  }
}
