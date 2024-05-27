import java.util.*;

public class BasicPhone extends AbstractPhone implements Phone {
    public BasicPhone(String type, String brand, String model, String number) {
        super(type, brand, model, number);
    }


    @Override
    public String getDescription() {
        return "Basic Phone: " + brand + " " + model + " " + number;
    }

    public BasicPhone deepCopy() {
        return new BasicPhone(this.type, this.getBrand(), this.getModel(), this.number);
    }

    public void hit(){
        System.out.println("Вы ударили телефоном " + getDescription());
    }

}