package javaplay;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;

    public Person() {
        // do something
    }

    public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }

   

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person height(int height) {
        this.height = height;
        return this;
    }

    public Person weight(int weight) {
        this.weight = weight;
        return this;
    }

    public Person eyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public Person gender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age == person.age && height == person.height && weight == person.weight && Objects.equals(eyeColor, person.eyeColor) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, eyeColor, gender);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", height='" + getHeight() + "'" +
            ", weight='" + getWeight() + "'" +
            ", eyeColor='" + getEyeColor() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }
}