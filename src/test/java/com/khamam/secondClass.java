package com.khamam;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class secondClass {

    public static void main(String[] args) {

        String baseURL = "http://54.91.166.114:8000/";

        Response response = RestAssured.get(baseURL + "api/hello");

        System.out.println("response.statusCode() = " + response.statusCode());
        response.prettyPrint();

    }
}
