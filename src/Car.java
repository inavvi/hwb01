public class Car {
    String brand;
    String model;
    String engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car() {
        this.brand="Default";
        this.model="Default";
        this.engineVolume="Default";
        this.color="белый";
        this.productionYear=2000;
        this.productionCountry="Default";
    }

    public Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        if (productionYear<=0) {
            this.productionYear=2000;
        }
        this.productionCountry=productionCountry;
    }

    public void carInfo () {
        System.out.println(brand+" "+model+", цвет кузова "+color+", объём двигателя "+engineVolume+", год выпуска "+productionYear+", сборка "+productionCountry+".");
    }

}
