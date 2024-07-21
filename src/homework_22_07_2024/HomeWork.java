package homework_22_07_2024;

import java.lang.reflect.Field;

public class HomeWork {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Alumn alumn = new Alumn();
        alumn.setName("David");
        alumn.setAge(26);
        //3) Вывести при помощи геттера значение возраста в консоль
        System.out.println("Имя: " + alumn.getName() + "\n" + "Возраст: " + alumn.getAge());

        //4) При помощи рефлексии задать невалидное значение
        Alumn alumnReflection = new Alumn();
        Field ageField = Alumn.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(alumnReflection, 150);
        //Invalid Age set by reflection
        System.out.println("Неверный возраст, установленный отражением: " + alumnReflection.getAge());

        //6) * Вывести значение поля в консоль без использования геттера
        //Age without getter
        System.out.println("Возраст без геттера: " + ageField.get(alumnReflection));
    }
}
