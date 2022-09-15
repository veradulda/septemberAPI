package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class e_ORDS {

    @BeforeAll
    public static void init(){
        baseURI ="http://54.91.166.114";
        port = 1000;
        basePath = "ords";
    }

     @Test
    public void test1(){

         Response response = given().get("/hr/regions");

         response.prettyPrint();
         System.out.println("response.statusCode() = " + response.statusCode());


     }

}
