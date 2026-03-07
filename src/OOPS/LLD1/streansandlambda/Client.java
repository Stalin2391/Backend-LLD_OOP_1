package OOPS.LLD1.streansandlambda;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        SampleInterface sampleInterface = new SampleInterface();
//        Runnable runnable = new HelloWorldPrinter();

//        Thread thread = new Thread(runnable);  or
        System.out.println("Main Thread : " + Thread.currentThread().getName());
        Thread thread = new Thread(new HelloWorldPrinter());
//        thread.start();
        // Anonymous Class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World Runnable in Main Thread Name:" +  Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
//        t1.start();

        //Lambda -> Works with Functional interfaces.
        // Syntax : () -> {}

        Thread t2 = new Thread(() -> {
            // Implementation of run method.
            System.out.println("Hello World Runnable in Main Thread Name:" +  Thread.currentThread().getName());
        });
//        t2.start();

        List<Integer> list = new ArrayList<>(List.of(3, 5, 4, 1, 6, 0, 7));

//        System.out.println(list);

        Collections.sort(list);
//        System.out.println(list);

        Car c1 = new Car("X", 280, 4, 3000000);
        Car c2 = new Car("A", 180, 2, 1500000);
        Car c3 = new Car("C", 210, 5, 2500000);
        Car c4 = new Car("M", 250, 7, 5000000);
        Car c5 = new Car("P", 159, 8, 500000);


        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        CarSeatsComparator carSeatsComparator = new CarSeatsComparator();

//        Collections.sort(cars,carSeatsComparator);

        // Anonymous Class
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.noOfSeats - o2.noOfSeats;
            }
        };

        CarNameComparator carNameComparator = new CarNameComparator();

//        Collections.sort(cars, carNameComparator);

        // Anonymous Class
        Comparator<Car> nameComaparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.name.compareTo(o1.name);
            }
        };


        Collections.sort(cars, (Car carName1, Car carName2) -> carName1.name.compareTo(carName2.name));



//        Collections.sort(cars, nameComaparator);



//        Collections.sort(cars, (Car car1, Car car2) -> car2.noOfSeats - car1.noOfSeats);

       for(Car car: cars){
           System.out.println("[ Name: " + car.name  + " speed:" + car.speed + " seats:" + car.noOfSeats + " price: " + car.price + "]");
       }

    }
}
