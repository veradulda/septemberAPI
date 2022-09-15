package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class h_path {

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

         System.out.println("response.path(\"[0]\") = " + response.path("[0]"));
         System.out.println("response.path(\"id[0]\") = " + response.path("id[0]"));
         System.out.println("response.path(\"id\") = " + response.path("id"));

     }


}
