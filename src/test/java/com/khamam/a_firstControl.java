package com.khamam;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class a_firstControl {

    @Test
    public void test1(){

        String baseURL = "http://54.91.166.114:8000/";

        Response response = RestAssured.get(baseURL + "api/hello");

        System.out.println("response.statusCode() = " + response.statusCode());
        response.prettyPrint();

    }


}
