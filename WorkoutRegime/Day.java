import java.util.*;
import java.io.*;
public class Day implements Cloneable {
  private String name = "";
  private String typeOfDay = "";
  private ArrayList<Exercise> exercises = new ArrayList<Exercise>();

  public Day(String name, String typeOfDay) {
    this.name = name; // example: Monday
    this.typeOfDay = typeOfDay; // example: Arm Day
  }

  public Day(Day other){
    this.name = other.name;
    this.typeOfDay = other.typeOfDay;
    this.exercises = new ArrayList<Exercise>(other.exercises);
  }

  public Day clone() {
    return new Day(this);
  }

  public void addExercise(String s){
    String[] words= s.split(":");
    String[] rhs = words[1].split("*");
    String[] rhsOfrhs = rhs[1].split(" ");
    if(words.length > 1){
      if(rhsOfrhs.length == 3){
      exercises.add(new Exercise(words[0], Integer.parseInt(rhs[0]), Integer.parseInt(rhsOfrhs[0]), rhsOfrhs[1]));
      }
      }
      else if(rhsOfrhs.length == 2 && !isNumeric(rhsOfrhs[rhsOfrhs.length - 1])){
        exercises.add(new Exercise(words[0], 1, Integer.parseInt(rhs[0]), rhsOfrhs[1]));
      }
      else{
        exercises.add(new Exercise(words[0]));
      }
    }

    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}


  public void removeExercise(String s){
    for(int i = 0; i < exercises.size(); i++){
      if(exercises.get(i).getName().startsWith(s) || exercises.get(i).getName().equals(s)){
        System.out.println("Removed exercise:" + exercises.get(i));
        exercises.remove(i);
      }
    }
  }

  public void setTypeOfDay(String s){
    this.typeOfDay = s;
  }

    @Override
  public String toString() {
    String retVal = "";
    retVal += name + " is " + typeOfDay;
    retVal += "\n";
    retVal += "Number of Exercises: " + exercises.size();
    for(Exercise e: exercises){
      retVal += e.toString();
    }
  return retVal;
  }
}