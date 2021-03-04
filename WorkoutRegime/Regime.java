import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
public class Regime {
private Day[] days;
private Map<String, Integer> dayIndex;

public Regime(String fileName){
    try {
      Path path = FileSystems.getDefault().getPath("profiles", "exercisedata.txt");
        retrieveData(path);
      } catch (Exception e) {
      System.out.println("FILE NOT FOUND oR ERROR");
      System.exit(0);
    }
}

public void retrieveData(Path path){
  try{
    System.out.println("got here");
  List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
  System.out.println(lines);
  int index = 0;
      for (String line : lines) {
        if(this.startsWithDay(line)){
          String[] tokens = line.split("-");
          tokens[0].trim();
          index = dayIndex.get(tokens[0]);
          if(tokens.length == 2){
            tokens[1].trim();
            days[index].setTypeOfDay(tokens[1]);
          }
          continue;
        }
          else{
            days[index].addExercise(line);
            continue;
          }
        }
  }
  catch(IOException e){
    System.out.println("CAUGHT AN IO EXCEPTION.");
    System.exit(0);
  }
}

public static boolean startsWithDay(String s){
  return s.startsWith("Monday") || s.startsWith("Tuesday") || s.startsWith("Wednesday") || s.startsWith("Thursday") || s.startsWith("Friday") || s.startsWith("Saturday") || s.startsWith("Sunday");
}

public void fillMap(){
  dayIndex = new HashMap<>(7);
  dayIndex.put("Monday", 0);
  dayIndex.put("Tuesday", 1);
  dayIndex.put("Wednesday", 2);
  dayIndex.put("Thursday", 3);
  dayIndex.put("Friday", 4);
  dayIndex.put("Saturday", 5);
  dayIndex.put("Sunday", 6);
}
}