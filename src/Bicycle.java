public class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем " + getWheelsCount() + " колес(а) велосипеда");
    }

    @Override
    public void transportService() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
    }
}