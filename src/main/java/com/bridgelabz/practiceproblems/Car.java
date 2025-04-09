package com.bridgelabz.practiceproblems;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Car {
    public static void main(String[] args) {
        JsonObject car = new JsonObject();
        JsonObject mainObject = new JsonObject();
        JsonArray carArray = new JsonArray();

        car.addProperty("title", "Mazda MX-5" );
        car.addProperty("start_production", "1989");
        car.addProperty("class","Sports car Roadster");

        JsonObject car2 = new JsonObject();
        car2.addProperty("title", "Volkswagen Kübelwagen" );
        car2.addProperty("start_production", "1995");
        car2.addProperty("class","Military vehicle");

        carArray.add(car);
        carArray.add(car2);

        mainObject.add("Cars:", carArray);
        System.out.println(mainObject.toString());

    }
}
