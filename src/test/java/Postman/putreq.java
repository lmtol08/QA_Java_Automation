package Postman;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class putreq {
    private String token = "5bc558651a7db375a244094fa12d8abf7b0823260b1925213c5b248ade9a1c7a";
    private String BaseURI = "https://gorest.co.in/public/v2";
    private int userID = 5786536;
    // ID COMES FROM POST. PUT EDITS THE USER.

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = BaseURI;
    }

    @Test
    public void testPutRequest(){

        RequestSpecification request = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");

        String requestBody = "{"
                + "\"name\": \"Lo\","
                + "\"email\": \"lo@example.com\","
                + "\"gender\": \"female\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).put("/users/"+ userID);

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);
    }

}
