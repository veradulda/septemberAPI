package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class f_pathParam {

    @BeforeAll
    public static void init(){
        baseURI ="http://54.91.166.114";
        port = 8000;
        basePath = "api";
    }

     @Test
    public void test1(){

        Response response =  given().accept(ContentType.JSON)
                             .pathParam("id",131)
                            .when()
                            .get("spartans/{id}");

        Assertions.assertEquals(response.statusCode(),200);
        Assertions.assertEquals(response.header("Content-Type"),"application/json");
        response.prettyPrint();

    }


}
