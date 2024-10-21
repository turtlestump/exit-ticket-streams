import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Create filepath
        Path filePath = Path.of("data/world-cities.csv");

        // Create output string
        String output;

        // Create stream
        try {

            Stream<String> cities = Files.lines(filePath);

            // Output string initialization
            output = String.valueOf(

            // Filter out 'B' cities.
            cities.filter(line -> line.startsWith("B"))

                    // Convert to uppercase
                    .map(String::toUpperCase)

                    // Sort the stream
                    .sorted()

                    // Covert into string
                    .collect(Collectors.joining(", ")));

        }
        catch (IOException e) {

            throw new RuntimeException(e);

        }

        // Print output.
        System.out.println(output);

    }

}
