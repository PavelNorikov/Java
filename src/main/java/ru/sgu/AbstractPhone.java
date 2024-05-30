import java.util.Objects;
import java.lang.*;


public abstract class AbstractPhone implements Phone {
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
        return number;
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
    public void  setNumber(String number2) {
        this.number = number2;
    }

    public String toString() {
        return type + ' ' + brand + ' ' + model + ' ' + number;
    }

    public AbstractPhone shallowCopy() {
        AbstractPhone newPhone = this;
        return newPhone;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractPhone that = (AbstractPhone) obj;
        return  type.equals(that.type) && brand.equals(that.brand) &&
                model.equals(that.model) && number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model, number);
    }


    public int compareTo(AbstractPhone other) {
        int res = this.type.compareTo(other.type);
        if (res != 0) {
            res = this.brand.compareTo(other.brand);
        }
        if (res != 0) {
            res = this.model.compareTo(other.model);
        }
        if (res != 0) {
            res = this.number.compareTo(other.number);
        }
        return res;
    }

    @Override
    public void makeCall(String number) {
        System.out.println("С телефона " + getDescription() + " совершен звонок на номер " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("С телефона " + getDescription() + " отправлено сообщение на номер " + number + " с текстом: " + message);
    }

}