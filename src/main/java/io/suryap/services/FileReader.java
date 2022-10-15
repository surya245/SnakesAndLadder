package io.suryap.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader extends InputParser{
    Path path;
    List<String> fileLines;
    int numberOfSnakes;
    int numberOfLadders;

    public FileReader(Path file) {
        this.path = file;
        Stream<String> linesStream;
        try {
            linesStream = Files.lines(this.path);
            fileLines = linesStream.collect(Collectors.toList());
            this.numberOfSnakes = Integer.parseInt(fileLines.get(0));
            this.numberOfLadders = Integer.parseInt(fileLines.get(numberOfSnakes+1));

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getNames(){
        List<String> names = new ArrayList<>();

        for(String line : fileLines){
            if(Character.isAlphabetic(line.charAt(0))){
                names.add(line);
            }
        }
        return names;
    }

    @Override
    public List<String> getSnakes() {

        List<String> snakePositions = new ArrayList<>();
        for(int i = 1; i < numberOfSnakes; i++){
            snakePositions.add(fileLines.get(i));
        }
        return snakePositions;
    }

    @Override
    public List<String> getLadders() {
        List<String> ladderPositions = new ArrayList<>();
        for(int i = numberOfSnakes + 2; i < numberOfLadders; i++){
            ladderPositions.add(fileLines.get(i));
        }
        return ladderPositions;
    }
}
