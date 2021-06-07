package com.example.sqlite;

public class CustomerModel
{
    private String name;
    private int age;
    private boolean isActiveorNot;
    private int id;

    public CustomerModel(String name, int age, boolean isActiveorNot, int id) {
        this.name = name;
        this.age = age;
        this.isActiveorNot = isActiveorNot;
        this.id = id;
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

    public boolean isActiveorNot() {
        return isActiveorNot;
    }

    public void setActiveorNot(boolean activeorNot) {
        isActiveorNot = activeorNot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActiveorNot=" + isActiveorNot +
                ", id=" + id +
                '}';
    }
}
