package com.olegyashcherov.generics.CountMap;

import java.util.HashMap;
import java.util.Map;

public class Zoo implements CountMap<AnimalType> {

    private final Map<AnimalType, Integer> animalMap;

    public Zoo() {
        animalMap = new HashMap<>();
    }

    @Override
    public void add(AnimalType animalType) {
        Integer n = animalMap.get(animalType);
        n = (n == null) ? 1 : ++n;
        animalMap.put(animalType, n);
    }

    @Override
    public int getCount(AnimalType animalType) {
        return animalMap.get(animalType) == null ? 0 : animalMap.get(animalType);
    }

    @Override
    public int remove(AnimalType animalType) {
        Integer n = animalMap.get(animalType);
        if (n == null) {
            System.out.println("Животные вида " + animalType + "отсутствуют в зоопарке");
            return 0;
        } else {
            animalMap.remove(animalType);
            return n;
        }
    }

    @Override
    public int size() {
        return animalMap.size();
    }

    @Override
    public void addAll(CountMap<AnimalType> source) {
        Map<AnimalType, Integer> sourceMap = source.toMap();
        for (Map.Entry<AnimalType, Integer> entry : sourceMap.entrySet()) {
            Integer n = animalMap.get(entry.getKey());
            if (n == null) {
                animalMap.put(entry.getKey(), entry.getValue());
            } else {
                n += entry.getValue();
                animalMap.put(entry.getKey(), n);
            }
        }
    }

    @Override
    public Map<AnimalType, Integer> toMap() {
        return animalMap;
    }

    @Override
    public void toMap(Map<AnimalType, Integer> destination) {
        animalMap.clear();
        animalMap.putAll(destination);
    }
}
