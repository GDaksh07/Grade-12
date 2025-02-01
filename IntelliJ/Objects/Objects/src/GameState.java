// Author - Daksh Gulati
// Assignment - UML to Class
// Date - 28/10/24

public class GameState {
    // initialize attributes
    private int numLevels;
    private int currentLevel;
    private int difficulty;

    // constructor
    public GameState (int numLevels, int currentLevel, int difficulty){
        this.numLevels = numLevels;
        this.currentLevel = currentLevel;
        this.difficulty = difficulty;
    }

    // Getters
    public int getNumLevels (){
        return this.numLevels;
    }

    public int getCurrentLevel(){
        return this.currentLevel;
    }

    public int getDifficulty(){
        return this.difficulty;
    }

    // Setters

    public void setNumLevels(int newNumLevels){
        this.numLevels = newNumLevels;
    }

    public void setCurrentLevel (int newCurrentLevel){
        this.currentLevel = newCurrentLevel;
    }

    public void setDifficulty (int newDifficulty){
        this.difficulty = newDifficulty;
    }

    public String toString (){
        return ("The current level you are on is " + currentLevel + "\n The total number of levels are " + numLevels);
    }

    public boolean equals(GameState other){
        return this.numLevels == other.numLevels && this.currentLevel == other.currentLevel && this.difficulty == other.difficulty;
    }

    public int compareTo (GameState other){
        if (this.numLevels != other.numLevels) {
            return 1;
        } else if (this.difficulty != other.difficulty){
            return -1;
        } else {
            return 0;
        }
    }

    public void increaseDifficulty (boolean increase){
        if (increase){
            this.difficulty += 1;
        }
    }

    public void decreaseDifficulty (boolean decrease){
        if (decrease){
            this.difficulty -= 1;
        }
    }

    public void restartGame (){
        this.currentLevel = 1;
        this.difficulty = 1;
    }

    public void nextLevel (){
        this.currentLevel += 1;
    }

    public double percentComplete (){
        double percentage = ((double)this.currentLevel / this.numLevels) * 100.0;
        return percentage;
    }
}
