public class Truck extends Transport {
    private String carRegistrationPlate;
    private int trailerMaxWeight;

    public Truck(String modelName, int wheelsCount, String carRegistrationPlate, int trailerMaxWeight) {
        super(modelName, wheelsCount);
        this.carRegistrationPlate = carRegistrationPlate;
        this.trailerMaxWeight = trailerMaxWeight;
    }

    @Override
    public void transportService() {
        System.out.println("Обслуживание грузового автомобиля: " + getModelName() + ", гос.номер: " + this.carRegistrationPlate + ", с прицепом грузоподьемностью до " + this.trailerMaxWeight + " кг.");
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки на грузовом авто и прицепе");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}