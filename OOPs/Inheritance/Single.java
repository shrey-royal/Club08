class Train {
    private String trainNumber;
    private int numberofCoaches;

    public Train(String trainNumber, int numberofCoaches) {
        this.trainNumber = trainNumber;
        this.numberofCoaches = numberofCoaches;
    }

    public void displayTrainInfo() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Number of Carriages: " + numberofCoaches);
    }

    public void start() {
        System.out.println("Train " + trainNumber + " is starting...");
    }

    public void stop() {
        System.out.println("Train " + trainNumber + " has stopped...");
    }
}

class HighSpeedTrain extends Train {
    private int maxSpeed;

    public HighSpeedTrain(String trainNumber, int numberofCoaches, int maxSpeed) {
        super(trainNumber, numberofCoaches);
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        super.start();
        System.out.println("High-speed train is accelerating to its maximum speed of " + maxSpeed + " km/h.");
        super.stop();
    }
}

public class Single {
    public static void main(String[] args) {
        HighSpeedTrain vandeBharat = new HighSpeedTrain("20901", 15, 190);
        vandeBharat.displayTrainInfo();
        vandeBharat.accelerate();
    }
}

/*
super();    //parent class const call
super.method(); //parent class method call
super.data; //parent class attribute/class variable call
*/