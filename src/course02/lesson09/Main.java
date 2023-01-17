package course02.lesson09;

import course02.lesson09.driver.Driver;
import course02.lesson09.driver.DriverB;
import course02.lesson09.driver.DriverC;
import course02.lesson09.driver.DriverD;
import course02.lesson09.mechanic.Mechanic;
import course02.lesson09.mechanic.ProfessionalSkills;
import course02.lesson09.transport.*;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Driver> drivers = new ArrayList<>();
        DriverB<Car> andrej = new DriverB<>("Andrej Alekseevich Mihailov", true, 11,
                "B");
        DriverB<Car> ekaterina = new DriverB<>("Ekaterina Alekseevna Kuzmich", true,
                17, "B");
        DriverB<Car> artjom = new DriverB<>("Artjom Nikolajevich Zhilin", true, 9,
                "B");
        DriverB<Car> aleksandra = new DriverB<>("Aleksandra Evgenjevna Klimova", true,
                8, "B");
        DriverC<Truck> sergej = new DriverC<>("Sergej Aleksandrovich Skvortcov", true,
                10, "C");
        DriverC<Truck> nina = new DriverC<>("Nina Sergeevna Poznjakova", true, 10,
                "C");
        DriverC<Truck> arkadij = new DriverC<>("Arkadij Sergeevich Tumanov", true, 20,
                "C");
        DriverC<Truck> tatjana = new DriverC<>("Tatjana Alekseevna Guseva", true, 17,
                "C");
        DriverD<Bus> ilja = new DriverD<>("Ilja Andreevich Semenov", true, 12,
                "D");
        DriverD<Bus> irina = new DriverD<>("Irina Mihailovna Malisheva", true, 14,
                "D");
        DriverD<Bus> innokentij = new DriverD<>("Innokentij Petrovich Muhin", true,
                10, "D");
        DriverD<Bus> elizaveta = new DriverD<>("Elizaveta Petrovna Guschina", true, 8,
                "D");
        drivers.add(andrej);
        drivers.add(ekaterina);
        drivers.add(artjom);
        drivers.add(aleksandra);
        drivers.add(sergej);
        drivers.add(nina);
        drivers.add(arkadij);
        drivers.add(tatjana);
        drivers.add(ilja);
        drivers.add(irina);
        drivers.add(innokentij);
        drivers.add(elizaveta);

        ArrayList<Mechanic> mechanics = new ArrayList<>();
        Mechanic leonid = new Mechanic("Leonid", "Kirillov", "MTM",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS);
        Mechanic aleksej = new Mechanic("Aleksej", "Sinitcin", "MehTeh",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES);
        Mechanic vladimir = new Mechanic("Vladimir", "Nikiforov", "Avto Profi",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS);
        Mechanic anton = new Mechanic("Anton", "Kovalev", "Spectrans",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT);
        Mechanic maria = new Mechanic("Maria", "Inina", "ABT",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS);
        Mechanic ksenia = new Mechanic("Ksenia", "Starostina", "GP",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES);
        Mechanic elena = new Mechanic("Elena", "German", "AutoDelo",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS);
        Mechanic anastasia = new Mechanic("Anastasia", "Eremina", "Remservis",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT);
        Mechanic gennadij = new Mechanic("Gennadij", "Semenchuk", "STM",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_CARS);
        Mechanic matvej = new Mechanic("Matvej", "Gubin", "Busfix",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_BUSES);
        Mechanic mark = new Mechanic("Mark", "Kent", "Schumtruck",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_TRUCKS);
        Mechanic arsenij = new Mechanic("Arsenij", "Kisilev", "Unicar",
                ProfessionalSkills.PROFESSIONAL_SKILLS_OF_WORKING_WITH_ALL_TRANSPORT);
        mechanics.add(leonid);
        mechanics.add(aleksej);
        mechanics.add(vladimir);
        mechanics.add(anton);
        mechanics.add(maria);
        mechanics.add(ksenia);
        mechanics.add(elena);
        mechanics.add(anastasia);
        mechanics.add(gennadij);
        mechanics.add(matvej);
        mechanics.add(mark);
        mechanics.add(arsenij);
        System.out.println(mechanics);
        mechanics.forEach(System.out::println);
        System.out.println();

        ArrayList<Transport> transports = new ArrayList<>();
        Car bmwZ4 = new Car("BMW", "Z4", 4.0, 1, ekaterina, mechanics, drivers,
                BodyType.BODY_TYPE_COUPE);
        Car audiR8 = new Car("Audi", "R8", 4.2, 2, andrej, mechanics,
                drivers, BodyType.BODY_TYPE_COUPE);
        Car porsche911 = new Car("Porsche", "911", 4.5, 3, artjom,
                mechanics, drivers, BodyType.BODY_TYPE_COUPE);
        Car mitsubishiLancerEvolution = new Car("Mitsubishi", "Lancer Evolution", 2.5,
                2, aleksandra, mechanics, drivers, BodyType.BODY_TYPE_SEDAN);

        Bus neoplanN5218 = new Bus("Neoplan", "N5218", 12.4, 3, ilja,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);
        Bus mercedesBenzTravego = new Bus("Mercedes-Benz", "Travego", 11.9, 2,
                irina, mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_MEDIUM);
        Bus scaniaTouring = new Bus("Scania", "Touring", 13.0, 2, innokentij,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);
        Bus ikarus386 = new Bus("Ikarus", "386", 10.3, 1, elizaveta,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);

        Truck kamaz4326 = new Truck("Kamaz", "4326", 18.5, 2, sergej,
                mechanics, drivers, LoadCapacity.LOAD_CAPACITY_N2);
        Truck ivecoStralis = new Truck("Iveco", "Stralis", 12.9, 3, nina,
                mechanics, drivers, LoadCapacity.LOAD_CAPACITY_N1);
        Truck hino500 = new Truck("Hino", "500", 12.5, 2, arkadij, mechanics,
                drivers, LoadCapacity.LOAD_CAPACITY_N2);
        Truck dafX2 = new Truck("DAF", "X2", 11.5, 1, tatjana, mechanics,
                drivers, LoadCapacity.LOAD_CAPACITY_N2);

        transports.add(bmwZ4);
        transports.add(audiR8);
        transports.add(porsche911);
        transports.add(mitsubishiLancerEvolution);

        transports.add(neoplanN5218);
        transports.add(mercedesBenzTravego);
        transports.add(scaniaTouring);
        transports.add(ikarus386);

        transports.add(kamaz4326);
        transports.add(ivecoStralis);
        transports.add(hino500);
        transports.add(dafX2);

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

        ilja.drive(neoplanN5218);
        andrej.drive(audiR8);
        sergej.drive(dafX2);
        Transport.performDiagnostics(bmwZ4, audiR8, porsche911, mitsubishiLancerEvolution, neoplanN5218,
                mercedesBenzTravego, scaniaTouring, ikarus386, kamaz4326, ivecoStralis, hino500, dafX2);
        System.out.println("------------------------------------------------------------------");

        bmwZ4.fixTheVehicle();
        audiR8.fixTheVehicle();
        porsche911.fixTheVehicle();
        mitsubishiLancerEvolution.fixTheVehicle();
        bmwZ4.carryOutTechnicalService();
        neoplanN5218.carryOutTechnicalService();
        dafX2.carryOutTechnicalService();
        audiR8.getInformationAboutDriverAndMechanic();
        neoplanN5218.getInformationAboutDriverAndMechanic();
        kamaz4326.getInformationAboutDriverAndMechanic();
        System.out.println();

        Map<Transport, ArrayList<Mechanic>> transportMechanicMap = new HashMap<>();
        for (Transport transport : transports) {
            transportMechanicMap.put(transport, transport.getMechanics());
        }

        for (Map.Entry<Transport, ArrayList<Mechanic>> map : transportMechanicMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        System.out.println();

        for (Transport transport : transports) {
            transportMechanicMap.put(transport, transport.getMechanics());
        }

        for (Map.Entry<Transport, ArrayList<Mechanic>> map : transportMechanicMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

//        Or we can manually insert pairs of keys and value in map.
//        Map<Transport, Mechanic> transportMechanicMap1 = new HashMap<>();
//        transportMechanicMap1.put(audiR8, leonid);
//        transportMechanicMap1.put(audiR8, maria);
//        transportMechanicMap1.put(bmwZ4, gennadij);
//        transportMechanicMap1.put(porsche911, anastasia);
//        transportMechanicMap1.put(mitsubishiLancerEvolution, arsenij);
//        transportMechanicMap1.putIfAbsent(audiR8, leonid); This method solves situation when there is no the same pair
//        of key and value in the map than this pair is adding in the map.
        //       System.out.println(transportMechanicMap);
        System.out.println();

// There are several variants of completing the task with HashSet.
        // First variant with Iterator
        Set<Mechanic> mechanicSet = new HashSet<>();
        mechanicSet.add(leonid);
        mechanicSet.add(aleksej);
        mechanicSet.add(vladimir);
        mechanicSet.add(anton);
        mechanicSet.add(maria);
        mechanicSet.add(ksenia);
        mechanicSet.add(elena);
        mechanicSet.add(maria); // adding duplicate
        mechanicSet.add(ksenia); // adding duplicate
        mechanicSet.add(elena); // adding duplicate
        mechanicSet.add(anastasia);
        mechanicSet.add(gennadij);
        mechanicSet.add(matvej);
        mechanicSet.add(mark);
        mechanicSet.add(arsenij);
        Iterator<Mechanic> iterator = mechanicSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Second variant
//        Set<Mechanic> mechanicSet = new HashSet<>(mechanics);
//        mechanicSet.forEach(System.out::println);

       // Third variant but this is not the best variant.
//       Set<Mechanic> mechanicSet = new HashSet<>();
//       mechanicSet.addAll(mechanics); // because of this string of the code
//       mechanicSet.addAll(mechanics);
//       mechanicSet.forEach(System.out::println);
//

        // Fourth variant with the stream
//        Set<Mechanic> mechanicSet = new HashSet<>();
//        mechanicSet.addAll(mechanics);
//        mechanicSet.addAll(mechanics); // adding duplicates
//        Stream<Mechanic> stream = mechanicSet.stream();
//        stream.forEach(System.out::println);

        // Fifth variant with Iterator
//        Set<Mechanic> mechanicSet = new HashSet<>();
//        mechanicSet.add(aleksej);
//        mechanicSet.add(anastasia);
//        mechanicSet.add(aleksej); // adding duplicate
//        mechanicSet.add(anastasia); // adding duplicate
//        mechanicSet.iterator().forEachRemaining(System.out::println);

        // Sixth variant
//        Set<Mechanic> mechanicSet = new HashSet<>();
//        mechanicSet.add(aleksej);
//        mechanicSet.add(anastasia);
//        mechanicSet.add(aleksej); // adding duplicate
//        mechanicSet.add(anastasia); // adding duplicate
//        for (Mechanic value : mechanicSet) {
//            System.out.println(value);
//        }

        // Seventh variant with Enumeration
//        Set<Mechanic> mechanicSet = new HashSet<>();
//        mechanicSet.add(aleksej);
//        mechanicSet.add(anastasia);
//        mechanicSet.add(aleksej); // adding duplicate
//        mechanicSet.add(anastasia); // adding duplicate
//        Enumeration<Mechanic> enumeration;
//        enumeration = Collections.enumeration(mechanicSet);
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }

// When we add the same values in the set the values are not duplicated.

    }
}
