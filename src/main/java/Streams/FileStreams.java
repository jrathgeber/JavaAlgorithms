package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileStreams {

    public static void main(String[] args) throws IOException {


        List<String> stringList = Files.lines(Paths.get("F:/GitHub/JavaAlgorithms/pom.xml"))
                .filter(line -> line.contains("groupId"))
                .map(line -> line.replaceAll("groupId", "")
                            .replaceAll("<", "")
                            .replaceAll(">", "")
                            .replaceAll("/", ""))
                            .collect(Collectors.toList());
                System.out.println(stringList);

                }


    }




