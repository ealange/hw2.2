public class Car extends Transport {

    private String carRegistrationPlate;

    public Car(String modelName, int wheelsCount, String carRegistrationPlate) {
        super(modelName, wheelsCount);
        this.carRegistrationPlate = carRegistrationPlate;
    }

    @Override
    public void transportService() {
        System.out.println("Обслуживание автомобиля: " + getModelName() + ", гос.номер: " + this.carRegistrationPlate);
        updateTyre();
        checkEngine();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки легкового автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель легкового автомобиля");
    }
}