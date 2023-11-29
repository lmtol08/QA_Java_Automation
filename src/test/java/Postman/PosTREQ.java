package Postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PosTREQ {
    private String token = "5bc558651a7db375a244094fa12d8abf7b0823260b1925213c5b248ade9a1c7a";
    private String BaseURI = "https://gorest.co.in/public/v2";

//ivate int userID = 5782587;

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = BaseURI;
    }

    @Test
    public void testPostRequest() {

        RequestSpecification request = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");

        String requestBody = "{"
                + "\"name\": \"Bob Smith\","
                + "\"email\": \"Bobsmith@example.com\","
                + "\"gender\": \"female\","
                + "\"status\": \"inactive\""
                + "}";

        Response response = request.body(requestBody).post("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode, 201);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

      //  int newUserId = response.jsonPath().getInt("data.id");
      //  System.out.println("New User with Id: " + newUserId);

    }
}