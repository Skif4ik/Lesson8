import model.Person;

public class Main {
    public static void main(String[] args) {
        //hashCode - метод, который возвращает целочисленное
        //представление объекта (формирование из полей объекта целого числа)
        System.out.println("AB".hashCode());
        Person person1 = new Person("Vasya", 35,1000);
        System.out.println(person1.hashCode());
        Person person2 = new Person("Vasay", 35, 1000);

        System.out.println(person1 == person2); //сравнение ссылок
        System.out.println(person1.equals(person2));
    }
}
