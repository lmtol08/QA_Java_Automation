package Postman;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

import io.restassured.response.Response;

import org.testng.annotations.Test;


public class Delete {
    private String token = "5bc558651a7db375a244094fa12d8abf7b0823260b1925213c5b248ade9a1c7a";
    private String BaseURI = "https://gorest.co.in/public/v2";
    private int userID = 5786536;
    // ID COMES FROM POST. PUT EDITS THE USER.

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = BaseURI;
    }
    @Test
    public void testDeleteRequest(){

        Response response = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .when()
                .delete("/users/" + userID);

        int statusCode = response.getStatusCode();
        System.out.println("Response Status: " + statusCode);

    }
}
