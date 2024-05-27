public class SmartPhone extends AbstractPhone implements Phone {
    public SmartPhone(String type, String brand, String model, String number) {
        super(type, brand, model, number);
    }


    @Override
    public String getDescription() {
        return "SmartPhone: " + brand + " " + model + " " + number;
    }

    public SmartPhone deepCopy() {
        return new SmartPhone(this.getType(), this.getBrand(), this.getModel(), this.number);
    }

    public void makeVideoCall(String nickname) {
        System.out.println("С телефона " + getDescription() + " совершен видеовызов пользователя " + nickname);
    }
}