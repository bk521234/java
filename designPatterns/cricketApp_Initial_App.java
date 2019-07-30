// Java implementation of observer pattern for Cricket App.
// 
// A class gets information from stadium and notifies display 
// elements, CurrentScoreDisplay & AverageScoreDisplay
class CricketData
{
    int runs, wickets;
    float overs;
    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    // Constructor
    public CricketData(CurrentScoreDisplay currentScoreDisplay,
                        AverageScoreDisplay averageScoreDisplay)
    {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    // Get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 90;
    }

    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }

    // Get latest overs from stadium
    private float getLatestOvers()
    {
        // return 10.2 for simplicity
        return (float)10.2;
    }

    // This method is used to update displays when data changes
    public void dataChanged()
    {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        // This statement “currentScoreDisplay.update(runs,wickets,overs);” violates 
        // one of the most important design principle “Program to interfaces, not 
        // implementations.” as we are using concrete objects to share data rather 
        // than abstract interfaces.
        currentScoreDisplay.update(runs, wickets, overs);
        averageScoreDisplay.update(runs, wickets, overs);
    }
}

// A class to display average score. Data of this class is
// updated by CricketData
class AverageScoreDisplay
{
    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs)
    {
        this.runRate = (float)runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display()
    {
        System.out.println("\nAverage Score Display:\n"+
                            "Run Rate: " + runRate +
                            "\nPredicted Score: " + predictedScore);
    }
}

// A class to display score. Data of this class is
// updated by CricketData
class CurrentScoreDisplay
{
    private int runs, wickets;
    private float overs;

    public void update(int runs, int wickets, float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    publick void display()
    {
        System.out.println("\nCurrent Score Display: \n" +
                            "Runs: " + runs + "\nWickets:"
                            + wickets + "\nOvers: " + overs);
    }
}

// Driver class
class Main
{
    class public static void main(String[] args) {
        // Create objects for testing
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScoreDisplay, averageScoreDisplay);

        // In real app you would have some logic to call this function when data changes
        cricketData.dataChanged();
    }
}


