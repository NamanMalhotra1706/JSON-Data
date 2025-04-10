package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonSchema;
import java.io.File;

public class ValidateJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode schema = mapper.readTree(new File("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\UserSchema.json"));

            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema jsonSchema = factory.getJsonSchema(schema);

            JsonNode json = mapper.readTree(new File("C:\\Users\\naman\\Desktop\\bridgelabz-workspace\\json-data\\src\\main\\java\\com\\bridgelabz\\practiceproblems\\User.json"));


            if(jsonSchema.validate(json).isSuccess()){
                System.out.println("JSON is valid against the schema.");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
