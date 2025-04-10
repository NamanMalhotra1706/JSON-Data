package com.bridgelabz.handsonpractice;

import org.json.JSONObject;
import org.json.XML;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXML {
    public static void main(String[] args) {

        try {
            String jsonContext = new String(Files.readAllBytes(Paths.get("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\User.json")));

            JSONObject jsonObject = new JSONObject(jsonContext);

            String xml = XML.toString(jsonObject,"user");
            System.out.println(xml);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
