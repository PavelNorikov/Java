import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new BasicPhone("Basic","Nokia", "3310", "1234567890"));
        phones.add(new SmartPhone("Smart","Apple", "iPhone 12", "0987654321"));
        phones.add(new SmartPhone("Smart","Samsung", "Galaxy S5", "7777777777"));

        for (Phone phone : phones) {
            System.out.println(phone.getDescription());
            phone.makeCall("3333333333");
            phone.sendMessage("3333333333", "test message");
            System.out.println();

        }

        SmartPhone phone1 = new SmartPhone("Smart","Samsung", "Galaxy S5", "1234567890");
        SmartPhone phone2 = (SmartPhone) phone1.deepCopy();
        SmartPhone phone3 = (SmartPhone) phone1.shallowCopy();

        System.out.println("Телефон: " + phone1);
        System.out.println("Глубокое копирование: " + phone2);
        System.out.println("Поверхностное копирование: " + phone3);

        phone1.setNumber("AAAAAAAAAAAA");

        System.out.println("Телефон: " + phone1);
        System.out.println("Глубокое копирование: " + phone2);
        System.out.println("Поверхностное копирование: " + phone3);

        System.out.println("Проверка равенства с глубокой копией: " + phone1.equals(phone2));
        System.out.println("Проверка равенства с поверхностной копией: " + phone1.equals(phone3));
        System.out.println("Hashcode оригинала: " + phone1.hashCode());
        System.out.println("Hashcode глубокой копии: " + phone2.hashCode());
        System.out.println("Hashcode поверхностной копии: " + phone3.hashCode());


    }
}
