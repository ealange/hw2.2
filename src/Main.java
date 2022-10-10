public class Main {
    public static void main(String[] args) {
        Car car = new Car("Хёндэ", 4, "г001ну777");
        Car car2 = new Car("Мерс", 4, "ж002му77");
        Truck truck = new Truck("Scania", 8, "o666oo123", 20);
        Truck truck2 = new Truck("Man", 12, "a555mr", 10);

        Bicycle bicycle = new Bicycle("Школьник", 2);
        Bicycle bicycle2 = new Bicycle("Малыш", 3);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(truck2);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
    }
}