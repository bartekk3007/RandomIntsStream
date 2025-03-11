import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        /*
        var results = Stream.of(stream).collect(Collectors.toList());
        for (IntStream result : results)
        {
            System.out.println(result);
        }
        */
    }
}