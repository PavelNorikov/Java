import java.util.Objects;
import java.lang.*;


abstract class AbstractPhone implements Phone, Cloneable {
    String type;
    String brand;
    String model;
    String number;

    public AbstractPhone(String type, String brand, String model, String number) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getNumber() {
        return model;
    }


    public void setType(String type2) {
        this.type = type2;
    }
    public void setBrand(String brand2) {
        this.brand = brand2;
    }
    public void  setModel(String model2) {
        this.model = model2;
    }
    public void  setNumber(String model2) {
        this.model = model2;
    }

    public String toString() {
        return type + ' ' + brand + ' ' + model + ' ' + number;
    }

    public AbstractPhone shallowCopy() {
        return this;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractPhone that = (AbstractPhone) obj;
        return brand.equals(that.brand) && model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }


    public int compareTo(BasicPhone other) {
        int brandComparison = this.brand.compareTo(other.brand);
        if (brandComparison != 0) {
            return brandComparison;
        } else {
            return this.model.compareTo(other.model);
        }
    }

    @Override
    public void makeCall(String number) {
        System.out.println("С телефона " + getDescription() + " совершен звонок на номер " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("С телефона " + getDescription() + " отправлено сообщение на номер " + number + " с текстом: " + message);
    }

    //public abstract String getDescription();
}