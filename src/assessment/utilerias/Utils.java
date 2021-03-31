package assessment.utilerias;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase con metodos utiles al proyecto
 */
public class Utils {

    public static List<String> readFileStream(String filepath) {
        try (Stream<String> stream = Files.lines(Paths.get(filepath))) {
            final List<String> collect = stream.collect(Collectors.toList());
            return collect;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
