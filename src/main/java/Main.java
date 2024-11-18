import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int countCar=3;
        ArrayList<Car> cars = new ArrayList<>();

        for (int i=0; i<countCar; i++) {
            cars.add(addCar(i+1));
            CarRace.getLeader(cars.get(i));
        }
    }

    public static Car addCar(int numberCar) {
        short minSpeed=1;
        short maxSpeed=250;
        short carSpeed;
        String error="Неправильная скорость";

        System.out.println("- Введите название машины №"+numberCar);
        String nameOfCar=scanner.next();

        while(true) {
            System.out.println("- Введите скорость машины №"+numberCar);
            String str = scanner.next();

            try {
                carSpeed = Short.parseShort(str);
            } catch (Exception ex) {
                System.out.println(error);
                continue;
            }

            if (carSpeed >= minSpeed && carSpeed <= maxSpeed) {
                return new Car(nameOfCar, carSpeed);

            } else {
                System.out.println(error);
            }
        }
    }
}
