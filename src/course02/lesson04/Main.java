package course02.lesson04;

import course02.lesson04.driver.DriverB;
import course02.lesson04.driver.DriverC;
import course02.lesson04.driver.DriverD;
import course02.lesson04.transport.Bus;
import course02.lesson04.transport.Car;
import course02.lesson04.transport.Transport;
import course02.lesson04.transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car bmwZ4 = new Car("BMW", "Z4", 4.0);
        Car audiR8 = new Car("Audi", "R8", 4.2);
        Car porsche911 = new Car("Porsche", "911", 4.5);
        Car mitsubishiLancerEvolution = new Car("Mitsubishi", "Lancer Evolution", 2.5);

        System.out.println(bmwZ4);
        bmwZ4.startMoving();
        bmwZ4.stopMoving();
        bmwZ4.pitStop();
        bmwZ4.getBestLapTime();
        bmwZ4.getMaximumSpeed();
        System.out.println(audiR8);
        System.out.println(porsche911);
        System.out.println(mitsubishiLancerEvolution);

        System.out.println("------------------------------------------------------------------");

        Bus neoplanN5218 = new Bus("Neoplan", "N5218", 12.4);
        Bus mercedesBenzTravego = new Bus("Mercedes-Benz", "Travego", 11.9);
        Bus scaniaTouring = new Bus("Scania", "Touring", 13.0);
        Bus ikarus386 = new Bus("Ikarus", "386", 10.3);

        System.out.println(neoplanN5218);
        neoplanN5218.startMoving();
        neoplanN5218.stopMoving();
        neoplanN5218.pitStop();
        neoplanN5218.getBestLapTime();
        neoplanN5218.getMaximumSpeed();
        System.out.println(mercedesBenzTravego);
        System.out.println(scaniaTouring);
        System.out.println(ikarus386);

        System.out.println("------------------------------------------------------------------");

        Truck kamaz4326 = new Truck("Kamaz", "4326", 18.5);
        Truck ivecoStralis = new Truck("Iveco", "Stralis", 12.9);
        Truck hino500 = new Truck("Hino", "500", 12.5);
        Truck dafX2 = new Truck("DAF", "X2", 11.5);

        System.out.println(kamaz4326);
        kamaz4326.startMoving();
        kamaz4326.stopMoving();
        kamaz4326.pitStop();
        kamaz4326.getBestLapTime();
        kamaz4326.getMaximumSpeed();
        System.out.println(ivecoStralis);
        System.out.println(hino500);
        System.out.println(dafX2);

        System.out.println("------------------------------------------------------------------");

        DriverD<Bus> ilja = new DriverD<>("Ilja Andreevich Semenov", true, 12);
        ilja.drive(neoplanN5218);
        DriverB<Car> andrej = new DriverB<>("Andrej Alekseevich Mihailov", true, 11);
        andrej.drive(audiR8);
        DriverC<Truck> sergej = new DriverC<>("Sergej Aleksandrovich Skvortcov", true,
                10);
        sergej.drive(dafX2);
    }
}
