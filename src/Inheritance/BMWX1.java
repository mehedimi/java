package Inheritance;

public class BMWX1 extends BMW{
    public String modelName() {
        return "BMW X1";
    }

    public String price() {
        return "50 lakh";
    }

    public void spacification(){
        System.out.println("Car Name: "+ this.name());

        System.out.println("Model: " + this.modelName());

        System.out.println("Price: "+ this.price());

        System.out.println("Wheel Count: "+ this.wheelCount());
    }
}
