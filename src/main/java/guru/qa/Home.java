package guru.qa;

public class Home {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();

        wardrobe.addNewClothes("Шапка");
        wardrobe.addNewClothes("Пальто");
        wardrobe.addNewClothes("Перчатки");
        wardrobe.searchClothes("Пальто");
        wardrobe.removeClothes("Шапка");

        Fridge fridge = new Fridge();
        fridge.addProducts("Яблоко");
        fridge.addProducts("Молоко");
        fridge.addProducts("Колбаса");
        fridge.addProducts("Сыр");
        fridge.removeProducts("Колбаса");
        fridge.searchProducts("Колбаса");

        Garage garage = new Garage();
        garage.addCar("А 777 МР 799", "Mercedes");
        garage.addCar("А 777 МР 797", "BMW");
        garage.addCar("А 007 МР 777", "Rolls-Royce");
        garage.showAllCars();
        garage.removeCar("А 777 МР 799");
        garage.showAllCars();
    }
}
