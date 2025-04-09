package com.bridgelabz.practiceproblems;

import org.json.JSONObject;
import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        JSONObject student  = new JSONObject();
        student.put("name","naman");
        student.put("age",21);
        student.put("subjects", Arrays.asList("Java","React","SQl", "Express", "Node"));

        System.out.println(student.toString());
    }
}
