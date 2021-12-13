package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;
import org.letscode.lista2.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

    public static void main(String[] args) {

        final int QUANTITY_OF_PERSONS = 2;
        Person[] persons = new Person[QUANTITY_OF_PERSONS];
        String name;
        float weight;
        float height;

        for (int i = 0; i < persons.length; i++) {
            Printer.enterPersonName(i);
            name = Reader.readString();

            Printer.enterPersonHeight(i);
            height = Reader.readFloat();

            Printer.enterPersonWeight(i);
            weight = Reader.readFloat();

            persons[i] = new Person(name, height, weight);
        }

        List<Person> personsOutOfWeight = new ArrayList<>();

        for (Person person : persons) {
            float imc = person.calculateIMC();
            if (imc < 18.5 || imc > 25) {
                personsOutOfWeight.add(person);
            }
        }

        for (Person personOutWeight : personsOutOfWeight) {
            System.out.println(personOutWeight);
        }
    }
}
