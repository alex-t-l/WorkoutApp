import java.io.*;
import java.util.*;
public class ExerciseApplication{
  private Regime r;
  private File file;
  public Scanner scanner;
  ExerciseApplication(){
    Scanner scanner = new Scanner(System.in);
  }

  public static void main (String[] args){
}


 public void start() throws ExerciseException
  {
    System.out.println("Welcome to WorkoutRegime 1.0! " + "\n" +
    "[0] To start a workout" + "\n" +
    "[1] To modify your Regime" + "\n" +
    "[-1] exit Program");
    int input = scanner.nextInt();
    switch(input){
          case -1:
          System.out.println("Exitting the program");
          System.exit(0);
          break;
          case 0:
          break;
          case 1:
          //modifyRegime();
          break;
        }
}
}
/*
  
  public void start() throws ExerciseException
  {

    //readFile();
    System.out.println("Welcome to WorkoutRegime Ver 1.0!");
    System.out.println("Choose a day to interact with:" + "\n" + 
    "[0] Monday" + "\n" + 
    "[1] Tuesday" + "\n" + 
    "[2] Wednesday" + "\n" + 
    "[3] Thursday" + "\n" + 
    "[4] Friday" + "\n" + 
    "[5] Saturday" + "\n" + 
    "[6] Sunday" + "\n"); 
    int input = sc.nextInt(); 
    if(input < 0 || input > 6)
    {
       System.out.println("Please choose  a day index b/w 0-6:" + "\n" + 
    "[0] Monday" + "\n" + 
    "[1] Tuesday" + "\n" + 
    "[2] Wednesday" + "\n" + 
    "[3] Thursday" + "\n" + 
    "[4] Friday" + "\n" + 
    "[5] Saturday" + "\n" + 
    "[6] Sunday" + "\n"); 
    input = sc.nextInt(); 
    r.accessDay(input);
    }
    else
    {
      r.accessDay(input);
    }
  }

  public void readFile(String name)
  {
    String fileName = name;
    Scanner fileReader = null; 
   try{
     fileReader = new Scanner (new FileInputStream(fileName));
   }
   catch(FileNotFoundException e){
     System.out.println("File, doesn't exist, create a new file with the name" + name "? Enter:"+
     "0 - To not create a new profile and go back." +
     "1 - Create a new profile(text file) called " + name + ".txt" +
     "-1 - Quit the program (Stops the program completely)");
     int input = scanner.nextInt();
     while(input < -1 || input > 1){
       System.out.println("Invalid input, enter 0, 1, or -1: +
        "0 - To not create a new profile and go back." +
        "1 - Create a new profile(text file) called " + name + ".txt" +
        "-1 - Quit the program (Stops the program completely)");"
        );
        input = scanner.nextInt();
        switch(input){
          case -1:
          System.out.println("Exitting the program");
          System.exit(0);
          break;
          case 0:
          System.out.println("Going back");
          this.start();
          return;
          break;
          case 1:
          createNewFile(name);
          break;
        }
     }
   }
   } 
   fileReader.close();
}

public void createNewFile(String nameOfFile){
  File file = new File("directory/" + name);
}
public void writeFile(Regime r)
{
  
}
} 
*/ 