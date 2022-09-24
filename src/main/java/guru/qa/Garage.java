package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<String, String> parking = new HashMap<>();

    public void addCar(String autoNumber,String Brand){
        parking.put(autoNumber,Brand);
    }

    public void removeCar(String autoNumber){
        parking.remove(autoNumber);
    }

    public void showAllCars(){
        for(Map.Entry<String,String> entry : parking.entrySet()){
            System.out.println("Номер автомобиля: " + entry.getKey() + ", Марка: " + entry.getValue());
        }
    }
}
