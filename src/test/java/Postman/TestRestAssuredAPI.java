package Postman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRestAssuredAPI {
    private String token ="5bc558651a7db375a244094fa12d8abf7b0823260b1925213c5b248ade9a1c7a";
    private String BaseURI ="https://gorest.co.in/public/v2";

//ivate int userID = 5782587;

@BeforeTest
public void setup(){RestAssured.baseURI = BaseURI;}

 @Test
    public void testGetRequest(){
        Response response = RestAssured.given()
                .when()
                .get("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: "+ statusCode);

      Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);

        JSONArray jsonArray = new JSONArray(responseBody);
        for (int i = 0; i < jsonArray.length();i++){
            JSONObject user = jsonArray.getJSONObject(i);
            Assert.assertTrue(user.has("id"));
            Assert.assertTrue(user.has("name"));
            Assert.assertTrue(user.has("email"));
            Assert.assertTrue(user.has("gender"));
            Assert.assertTrue(user.has("status"));
        }
    }
}