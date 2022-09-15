package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class h_pathExample {

    @BeforeAll
    public static void init(){
        baseURI ="http://54.91.166.114";
        port = 8000;
        basePath = "api";
    }

     @Test
    public void test1(){

         Response response = given().accept(ContentType.JSON)
                 .get("/spartans");

        List<String> genders = response.path("gender");
        int  countOfMale = 0;
        int  countOfFemale = 0;
        int  countOfOther = 0;

         for (String gender : genders) {
             if(gender.equals("Male")){
                 countOfMale++;
             } else if (gender.equals("Female")) {
                 countOfFemale++;
             }else {
                 countOfOther++;
             }

         }

         System.out.println("countOfMale = " + countOfMale);
         System.out.println("countOfFemale = " + countOfFemale);
         System.out.println("countOfOther = " + countOfOther);

     }


}
