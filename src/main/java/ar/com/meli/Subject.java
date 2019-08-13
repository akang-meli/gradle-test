package ar.com.meli;

public class Subject {
    Integer age;
    Integer height;
    Integer weight;

    public Subject(Integer age, Integer height, Integer weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }
}
