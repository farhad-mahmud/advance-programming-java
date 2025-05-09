
interface FuelVehicle {
    void refuel();
}


interface ElectricVehicle {
    void charge();
}


class Car implements FuelVehicle {
    double fuel;

    Car(double fuel) {
        this.fuel = fuel;
    }

    public void refuel() {
        fuel += 10;
        System.out.println("Car refueled. Current fuel: " + fuel);
    }
}

class ElectricCar implements ElectricVehicle {
    double batteryLife;

    ElectricCar(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void charge() {
        batteryLife += 20;
        if (batteryLife > 100) batteryLife = 100;
        System.out.println("Electric car charged. Current battery: " + batteryLife);
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(30);
        ElectricCar eCar = new ElectricCar(50);

        car.refuel();
        eCar.charge();
    }
}
