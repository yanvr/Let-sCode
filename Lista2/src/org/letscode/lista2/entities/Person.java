package org.letscode.lista2.entities;

public class Person {

    private String name;
    private int idade;
    private float weight;
    private float height;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {return height;}

    public float calculateIMC() {
        return Math.round(this.weight / Math.pow(this.height, 2));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
