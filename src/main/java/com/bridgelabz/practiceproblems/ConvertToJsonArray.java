package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class ConvertToJsonArray {
    public static void main(String[] args) {

        try {
            List<User> users = new ArrayList<>();
            users.add(new User(1, "Ravi", "ravi@example.com"));
            users.add(new User(2, "Neha", "neha@example.com"));

            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(users);

            System.out.println(jsonArray);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
