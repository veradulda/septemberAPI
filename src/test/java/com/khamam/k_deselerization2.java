package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class k_deselerization2 {

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

        k_spartanCustomClass spartan131 = response.as(k_spartanCustomClass.class);

        System.out.println("spartan131 = " + spartan131);


    }

    @Test
    public void test11() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans/131")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        JsonPath jsonPath = response.jsonPath();

        k_spartanCustomClass3 spartan11 = jsonPath.getObject("", k_spartanCustomClass3.class);

        System.out.println("spartan11 = " + spartan11);

    }

    @Test
    public void test2() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans/131")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        k_spartanCustomClass2 spartan131 = response.as(k_spartanCustomClass2.class);

        System.out.println("spartan131 = " + spartan131);


    }

    @Test
    public void test3() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans/131")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        k_spartanCustomClass3 spartan131 = response.as(k_spartanCustomClass3.class);

        System.out.println("spartan131 = " + spartan131);


    }

    @Test
    public void test4() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();


        JsonPath jsonPath = response.jsonPath();

        k_spartanCustomClass3 spartan12 = jsonPath.getObject("[1]", k_spartanCustomClass3.class);

        System.out.println("spartan12 = " + spartan12);


    }

    @Test
    public void test5() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();


        JsonPath jsonPath = response.jsonPath();

        List<k_spartanCustomClass3> ListOfspartan = jsonPath.getList("", k_spartanCustomClass3.class);

        System.out.println("spartan12 = " + ListOfspartan);


    }

    @Test
    public void test6() {

        Response response = given().accept(ContentType.JSON)
                .get("/spartans/search")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();


        JsonPath jsonPath = response.jsonPath();

        k_listOfspartansCustomClass ListOfspartan = jsonPath.getObject("",k_listOfspartansCustomClass.class);

        System.out.println("spartan12 = " + ListOfspartan);


    }



}
