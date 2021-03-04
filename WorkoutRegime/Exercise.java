public class Exercise implements Cloneable {
  private int sets;
  private double amount;
  private String type;

  private String name;

  public Exercise() {

  }

  public Exercise(Exercise other) {
    this.sets = other.sets;
    this.amount = other.amount;
    this.type = other.type;
    this.name = other.name;
  }

  // Constructor with all 4 arguments
  public Exercise(String name_, int sets_, int amount_,  String type_) {
    name = name_;
    type = type_;
    amount = amount_;
    sets = sets_;
  }



  // Constructor: Name only constructor
  public Exercise(String name_) {
    name = name_;
    type = "";
    amount = 1;
    sets = -1;
  }

  public void setSets(int n) {
    sets = n;
  }

  public int getSets() {
    return sets;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public double getAmount(int amount) {
    return amount;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if(other == null || !(other instanceof Exercise)){
      return false;
    }
    Exercise that = (Exercise) other;
    return this.sets == that.sets && this.amount == that.amount && this.type == that.type && this.name.equals(that.name);
  }

  @Override
  public String toString() {
    String retVal = "";
    if(sets == -1){
      retVal += name;
    }
    else{
    retVal += amount + " " + type + " of " + name;
    }
    retVal += "\n";
  return retVal;
  }
}

// Type = M minutes(like treadmill)
// Type = R reps
// Treadmill 1 10

// Squats R 3 10 | 3 sets of 10 reps of squats
// Jumping Jacks R 1 50 | 50 reps of jumping jacks, 1 set
// Bench Press default set 1 reps 10
// Bench Press 3 10 - 3 sets 10 reps
// Ab Roller 2 reps or r || minutes/ mins / m