class Train {
    // public int trainNo;
    // private String trainName; not allowed to a static inner class what to static
    // only
    public static int trainNo;
    private static String trainName;

    public Train(int trainNo, String trainName) {
        Train.trainNo = trainNo;
        Train.trainName = trainName;
    }

    static class Engine {
        int engineNo;

        public Engine(int engineNo) {
            this.engineNo = engineNo;
        }

        void displayENo() {
            System.out.println("Engine No:" + engineNo);
            System.out.println("trainNo:" + trainNo);
            System.out.println("trainName:" + trainName);
        }
    }

}

public class TrainMain {
    public static void main(String[] args) {
        Train t = new Train(12345, "Rajdhani");
        Train.Engine e = new Train.Engine(54321);
        e.displayENo();

    }
}
