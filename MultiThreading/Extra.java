class SerpentLabyrinth extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Adityraj is navigating the serpent labyrinth...");
            try {
                Thread.sleep(1000); // simulating time taken for calculations
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class SacredRiver extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Divy is chanting mantras to cross the sacred river...");
            try {
                Thread.sleep(1000); // simulating time taken for chanting
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class RockyClimb extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pratham is building the climbing harness...");
            try {
                Thread.sleep(500); // Simulate time taken for crafting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Extra {
    public static void main(String[] args) {
        SerpentLabyrinth serpentLabyrinth = new SerpentLabyrinth();
        SacredRiver sacredRiver = new SacredRiver();
        RockyClimb rockyClimb = new RockyClimb();

        serpentLabyrinth.setPriority(8);
        sacredRiver.setPriority(5);
        rockyClimb.setPriority(10);

        serpentLabyrinth.start();
        sacredRiver.start();
        rockyClimb.start();
    }
}
