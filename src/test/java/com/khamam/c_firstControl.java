package com.khamam;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class c_firstControl {

    @Test
    public void test1(){

        String baseURL = "http://54.91.166.114:8000/";

        Response response = RestAssured.given().accept(ContentType.JSON)
                            .when()
                            .get(baseURL + "api/spartans");

        //System.out.println("response.statusCode() = " + response.statusCode());
        //System.out.println("response.header(\"Content-Type\") = " + response.header("Content-Type"));
        //response.prettyPrint();

        Assertions.assertEquals(response.statusCode(),200);
        Assertions.assertEquals(response.header("Content-Type"),"application/json");

    }


}
