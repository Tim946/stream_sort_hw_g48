package ua.mainacademy;

import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppRunner
{
    public static final Logger LOGGER=Logger.getLogger(AppRunner.class.getName());
    public static void main( String[] args )
    {
        String text = "Charlie Jennifer Charlie Bob Charlie Charlie Bob Jennifer Alice Alice";

        LOGGER.info(sortedString(text));

    }

    static String sortedString(String text){
        return Stream.of(text.split(" ")).sorted().collect(Collectors.groupingBy((word)-> word))
                .entrySet().stream()
                .collect(Collectors.toMap((p) -> p.getKey(), (p) -> p.getValue().toString().split(", ").length))
                .entrySet().stream()
                .sorted((w1,w2)-> w1.getValue()!=w2.getValue() ? - w1.getValue().compareTo(w2.getValue()) :
                        w1.getKey().compareTo(w2.getKey()))
                .collect(Collectors.toList()).toString();
    }
}
