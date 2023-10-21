package model;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        //this - то, что мы сравниваем
        //object - то, с чем мы сравниваем

        if (this == object) return true;//1 проверить не одинаковы ли ссылки\
        if (object == null) return false; //нет смысла сравнивать с null
        if (this.getClass() != object.getClass()) return false; //нет смысла сравнивать объекты разных классов
        //если мы прошли через if то по ссылке object 100% хранится объект класса Person
        //значит мы можем выполнить нисходящее преоброзование типов
        //преобразовываем чтобы иметь доступ к полям
        Person person = (Person) object;
        //теперь this сравниваем с person
        if (this.age != person.age) return false;
        if(name != null) {
            if (!name.equals(person.name)) return false;
        }else {
            return name == null;
        }
        //return (salary == person.salary);
        return (Double.compare(salary, person.salary) == 0);


//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        if (Double.compare(person.salary, salary) != 0) return false;
//        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

}
