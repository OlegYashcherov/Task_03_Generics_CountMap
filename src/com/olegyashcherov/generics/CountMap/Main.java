package com.olegyashcherov.generics.CountMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        AnimalType giraffe = new AnimalType("Жираф");
        AnimalType elephant = new AnimalType("Слон");
        AnimalType lion = new AnimalType("Лев");
        AnimalType hippo = new AnimalType("Бегемот");
        AnimalType crocodile = new AnimalType("Крокодил");

        Zoo zooA = new Zoo();
//        zooA.add(giraffe);
//        zooA.add(giraffe);
        zooA.add(elephant);
        zooA.add(lion);
        zooA.add(lion);
        zooA.add(lion);
        zooA.add(hippo);
        zooA.add(crocodile);
        zooA.add(crocodile);
        zooA.add(crocodile);
        zooA.add(crocodile);
        zooA.add(crocodile);

        System.out.println("\nНаполняем зоопарки животными (метод add(T t))\n");
//        System.out.println("В зоопарке А количество животных вида " + giraffe + " - " + zooA.getCount(giraffe));
        System.out.println("В зоопарке А количество животных вида " + elephant + " - " + zooA.getCount(elephant));
        System.out.println("В зоопарке А количество животных вида " + lion + " - " + zooA.getCount(lion));
        System.out.println("В зоопарке А количество животных вида " + hippo + " - " + zooA.getCount(hippo));
        System.out.println("В зоопарке А количество животных вида " + crocodile + " - " + zooA.getCount(crocodile));

        System.out.println("\nКоличество видов в зоопарке A: " + zooA.size() + " (int size())");
        System.out.println("*********************************************************");

        Zoo zooB = new Zoo();
//        zooB.add(giraffe);
        zooB.add(elephant);
        zooB.add(hippo);
        zooB.add(hippo);
        zooB.add(hippo);
        zooB.add(crocodile);
//        System.out.println("В зоопарке Б количество животных вида " + giraffe + " - " + zooB.getCount(giraffe));
        System.out.println("В зоопарке Б количество животных вида " + elephant + " - " + zooB.getCount(elephant));
        System.out.println("В зоопарке Б количество животных вида " + lion + " - " + zooB.getCount(lion));
        System.out.println("В зоопарке Б количество животных вида " + hippo + " - " + zooB.getCount(hippo));
        System.out.println("В зоопарке Б количество животных вида " + crocodile + " - " + zooB.getCount(crocodile));
        System.out.println("\nКоличество видов в зоопарке Б: " + zooB.size() + " (int size())");
        System.out.println("*********************************************************");

        System.out.println("Зоопарк A забрал животных из зоопарка Б");
        System.out.println("(метод addAll(CountMap<T> source))\n");
        zooA.addAll(zooB);
//        System.out.println("В зоопарке А количество животных вида " + giraffe + " - " + zooA.getCount(giraffe));
        System.out.println("В зоопарке А количество животных вида " + elephant + " - " + zooA.getCount(elephant));
        System.out.println("В зоопарке А количество животных вида " + lion + " - " + zooA.getCount(lion));
        System.out.println("В зоопарке А количество животных вида " + hippo + " - " + zooA.getCount(hippo));
        System.out.println("В зоопарке А количество животных вида " + crocodile + " - " + zooA.getCount(crocodile));
        System.out.println("*********************************************************");


        System.out.println("Убираем всех бегемотов из зоопарка Б (метод remove(T t))\n");
        zooB.remove(hippo);
//        System.out.println("В зоопарке Б количество животных вида " + giraffe + " - " + zooB.getCount(giraffe));
        System.out.println("В зоопарке Б количество животных вида " + elephant + " - " + zooB.getCount(elephant));
        System.out.println("В зоопарке Б количество животных вида " + lion + " - " + zooB.getCount(lion));
        System.out.println("В зоопарке Б количество животных вида " + hippo + " - " + zooB.getCount(hippo));
        System.out.println("В зоопарке Б количество животных вида " + crocodile + " - " + zooB.getCount(crocodile));
        System.out.println("*********************************************************");

        System.out.println("Убираем всех животных из зоопарка Б");
        System.out.println("(передаем пустую Map (toMap(Map<T, Integer> destination)))\n");

        Map<AnimalType, Integer> map = new HashMap<>();
        zooB.toMap(map);

//        System.out.println("В зоопарке Б количество животных вида " + giraffe + " - " + zooB.getCount(giraffe));
        System.out.println("В зоопарке Б количество животных вида " + elephant + " - " + zooB.getCount(elephant));
        System.out.println("В зоопарке Б количество животных вида " + lion + " - " + zooB.getCount(lion));
        System.out.println("В зоопарке Б количество животных вида " + hippo + " - " + zooB.getCount(hippo));
        System.out.println("В зоопарке Б количество животных вида " + crocodile + " - " + zooB.getCount(crocodile));
        System.out.println("*********************************************************");
    }
}
