package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;

import java.io.File;
import java.io.IOException;

public class ExtractFields {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\User.json"));

            JsonNode users = root.get("users");

            for(JsonNode user : users){
                String name = user.get("name").asText();
                String email = user.get("email").asText();

                System.out.println("  Name: " + name);
                System.out.println("  Email: " + email);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
