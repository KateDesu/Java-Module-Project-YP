public class CarRace {
    public static String leader="";
    private static int distance=0;

    public static void getLeader(Car car) {
        if ((car.speed*24)>distance) {
            distance =(car.speed*24);
            leader=car.carName;
        }

        System.out.println("Самая быстрая машина: " + leader+"\n");
    }
}
