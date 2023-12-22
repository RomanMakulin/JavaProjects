import org.example.UnitTests.h2.Car;
import org.example.UnitTests.h2.Motorcycle;
import org.example.UnitTests.h2.Vehicle;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;


public class VehicleTest {

    private Car car = new Car("bmw", "k5", 2025);
    private Motorcycle motorcycle = new Motorcycle("bmw", "k5", 2025);

//    @BeforeEach
//    public void setup() {
//        Car car = new Car("bmw", "k5", 2025);
//        Motorcycle motorcycle = new Motorcycle("bmw", "k5", 2025);
//    }


    //    - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).(ок)
    @Test
    public void checkClass() {
        assertThat(this.car).isInstanceOf(Vehicle.class);
    }

    //    - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void checkCarWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //    - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void checkMotoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //    - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void checkCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //    - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void checkMotoSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    //    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void checkCarParkSpeed() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //    - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void checkMotoParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}