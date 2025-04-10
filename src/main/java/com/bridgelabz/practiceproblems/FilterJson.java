package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJson {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\User.json"));

            for(JsonNode user : root.get("users")){
                int userAge = user.get("age").asInt();
                if(userAge>25){
                    System.out.println(user);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
