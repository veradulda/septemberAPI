package com.khamam;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class d_firstControl {

    @BeforeAll
    public static void init() {
        baseURI = "http://54.91.166.114";
        port = 8000;
        basePath = "api/spartans";
    }

    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .when()
                .get();

        Assertions.assertEquals(response.statusCode(), 200);
        Assertions.assertEquals(response.header("Content-Type"), "application/json");

    }

    @Test
    public void test2() {

        Response response = given().accept(ContentType.JSON)
                .get("/131");

        response.prettyPrint();
        Assertions.assertEquals(response.statusCode(), 200);
        Assertions.assertEquals(response.header("Content-Type"), "application/json");


    }


}
