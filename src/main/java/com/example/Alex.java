package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {
    List<String> friends = Arrays.asList("Марти", "Глория", "Мелман");
    String placeOfLiving = "Нью-Йоркский зоопарк";

    public Alex (Feline feline, String sex) throws Exception {
        super(feline, "Самец");
    }

    @Override
    public int getKittens() {
        return 0;
    }
    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

}
