package org.calssinterfaceexercises.zad_3;

public class Car {

    private String name;
    private String carType;
    private Engine engine;

    public Car(String name, String carType) {
        this.name = name;
        this.carType = carType;
        this.engine = new Car.Engine();
        engine.setEngine(carType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String CarType) {
        this.carType = CarType;
    }

    public Engine getEngine() {
        return engine;
    }

    class Engine {
        private String engineType;

        String setEngine(String carType) {
            if(carType.equals("economy")) {
                engineType = "diesle";
            } else if(carType.equals("luxury")) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
            return engineType;
        }

        @Override
        public String toString() {
            return engineType;
        }
    }

}
