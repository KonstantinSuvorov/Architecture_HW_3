import java.awt.Color;

// Перечисление типов автомобилей
enum TypeCar {
    SEDAN,
    PICKUP
}

// Перечисление типов топлива
enum TypeFuel {
    GASOLINE,
    DIESEL,
    ELECTRIC // Добавлен новый тип топлива для электрокаров
}

// Перечисление типов коробок передач
enum TypeGearBox {
    MT,
    AT
}

// Абстрактный класс Car, представляющий базовый автомобиль
abstract class Car {
    private String make; // Марка автомобиля
    private String model; // Модель автомобиля
    private Color color; // Цвет автомобиля
    private TypeCar bodyType; // Тип кузова
    private int numberWheels; // Количество колес
    private TypeFuel fuelType; // Тип топлива
    private TypeGearBox gearboxType; // Тип коробки передач
    private double engineCapacity; // Объем двигателя

    // Метод движения
    public void movement() {
        System.out.println("Car is moving");
    }

    // Метод обслуживания
    public void maintenance() {
        System.out.println("Car maintenance performed");
    }

    // Метод переключения передач
    public boolean gearShifting() {
        System.out.println("Gear shifted");
        return true;
    }

    // Метод включения фар
    public boolean switchHeadlights() {
        System.out.println("Headlights switched on");
        return true;
    }

    // Метод включения дворников
    public boolean switchWipers() {
        System.out.println("Wipers switched on");
        return true;
    }

    // Геттеры и сеттеры для всех полей

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}

// Класс Pickup, наследующий от Car
class Pickup extends Car {

    private double loadCapacity; // Грузоподъемность в килограммах

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}

// Класс FutureCar, наследующий от Car
class FutureCar extends Car {
    // Дополнительные свойства могут быть добавлены здесь
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Pickup
        Pickup pickup = new Pickup();
        pickup.setMake("Toyota");
        pickup.setModel("Tundra");
        pickup.setColor(Color.BLUE);
        pickup.setBodyType(TypeCar.PICKUP);
        pickup.setNumberWheels(4);
        pickup.setFuelType(TypeFuel.GASOLINE);
        pickup.setGearboxType(TypeGearBox.AT);
        pickup.setEngineCapacity(5.7);
        pickup.setLoadCapacity(1500); // в килограммах

        // Вызовы методов для тестирования
        pickup.movement();
        pickup.maintenance();
        pickup.gearShifting();
        pickup.switchHeadlights();
        pickup.switchWipers();

        // Создание экземпляра класса FutureCar
        FutureCar futureCar = new FutureCar();
        futureCar.setMake("Tesla");
        futureCar.setModel("Roadster");
        futureCar.setColor(Color.RED);
        futureCar.setBodyType(TypeCar.SEDAN);
        futureCar.setFuelType(TypeFuel.ELECTRIC); // Тип топлива для электрокара
        futureCar.setGearboxType(TypeGearBox.AT);
        futureCar.setEngineCapacity(0); // У электрокара нет двигателя внутреннего сгорания

        // Вызовы методов для тестирования
        futureCar.movement();
        futureCar.maintenance();
    }
}
