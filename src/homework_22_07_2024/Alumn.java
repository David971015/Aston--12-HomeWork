package homework_22_07_2024;

public class Alumn {
    private String name;
    //1)Создать класс с приватным полем int age
    private int age;

    public Alumn(){};

    public int getAge() {
        return age;
    }

    //2) Написать сеттер и геттер для этого поля (сеттер с валидацией (возраст от 0 до 120))
    public void setAge(int age) {
        if(age>0 && age<120){
            this.age = age;
        } else {
            System.err.println("Введите действительный возраст от 0 до 120 лет.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
