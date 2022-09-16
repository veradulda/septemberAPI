package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class k_deselerization {

    @BeforeAll
    public static void init() {
        baseURI = "http://54.91.166.114";
        port = 8000;
        basePath = "api";
    }

    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans/131")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        Map<String,Object> as = response.as(Map.class);

        System.out.println("as = " + as);

    }

    @Test
    public void test2() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

       List<Map<String,Object>> as = response.as(List.class);

        System.out.println("as = " + as.get(0).get("id"));

    }




}
