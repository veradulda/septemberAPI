package com.khamam;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class j_hamcRestExample {

    @BeforeAll
    public static void init(){
        baseURI ="http://54.91.166.114";
        port = 8000;
        basePath = "api";
    }

     @Test
    public void test1(){

         given().accept(ContentType.JSON)
                 .get("/spartans")
                 .then()
                 .statusCode(200)
                 .contentType("application/json")
                 .body("id[0]", is(2))
                 .header("Keep-Alive","timeout=60")
                 .body("name",hasItem("IkinciMehmet"))
                 .body("id",hasItems(2,5,132));




     }


}
