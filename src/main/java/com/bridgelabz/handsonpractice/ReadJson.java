package com.bridgelabz.handsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

public class ReadJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\User.json"));

            printJson("",root);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        private static void printJson(String parentKey, JsonNode node) {
            if (node.isObject()) {
                Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
                while (fields.hasNext()) {
                    Map.Entry<String, JsonNode> entry = fields.next();
                    printJson(parentKey + entry.getKey() + ".", entry.getValue());
                }
            } else if (node.isArray()) {
                int index = 0;
                for (JsonNode item : node) {
                    printJson(parentKey + "[" + index + "].", item);
                    index++;
                }
            } else {
                // Leaf node (actual value)
                System.out.println(parentKey.substring(0, parentKey.length() - 1) + " : " + node.asText());
            }
        }
}
