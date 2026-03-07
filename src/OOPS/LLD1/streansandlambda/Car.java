package OOPS.LLD1.streansandlambda;

public class Car implements Comparable<Car>{
    String name;
    int speed;
    int noOfSeats;
    int price;

    Car(String name, int speed, int noOfSeats, int price){
        this.name = name;
        this.speed = speed;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
        if(this.price < car.price){
            return -1;
        }else if(this.price > car.price){
            return 1;
        }
        return 0;
    }
}
