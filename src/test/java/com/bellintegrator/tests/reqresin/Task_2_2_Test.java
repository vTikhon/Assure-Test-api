package com.bellintegrator.tests.reqresin;

import com.bellintegrator.data.reqresin.DataStream;
import com.bellintegrator.dto.reqresin.LoginDTO;
import com.bellintegrator.tests.BaseTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static com.bellintegrator.specification.Specification.*;

/**
 * Класс Task_2_2_Test содержит тесты для проверки процесса логина.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public class Task_2_2_Test extends BaseTest {

    /**
     * Тест проверяет успешный вход в систему с правильными данными.
     *
     * @param email    Электронная почта пользователя.
     * @param password Пароль пользователя.
     * @param url      URL, по которому отправляется POST-запрос для логина.
     */
    @Test(dataProvider = "secondTest", dataProviderClass = DataStream.class)
    public void secondTest(String email, String password, String url) {
        LoginDTO loginDTO = new LoginDTO();  // создаём объект, который будем проверять
        loginDTO.setEmail(email);
        loginDTO.setPassword(password);

        Response response = given()
                .body(loginDTO)
                .when()
                .post(url)
                .then()
                .log().body()
                .statusCode(200)
                .extract().response();

        JsonPath jsonResponse = response.jsonPath();
        String token = jsonResponse.getString("token");
        String error = jsonResponse.getString("error");
        Assert.assertNotNull(token, "Токен, при успешной авторизации, не может быть пустым.");
        Assert.assertNull(error, "Ошибка, при успешной авторизации, должна быть пустой.");
    }

    /**
     * Тест проверяет неуспешный вход в систему без пароля.
     *
     * @param email    Электронная почта пользователя.
     * @param password Пустой пароль пользователя.
     * @param url      URL, по которому отправляется POST-запрос для логина.
     */
    @Test(dataProvider = "secondTestWithoutPassword", dataProviderClass = DataStream.class)
    public void secondTestWithoutPassword(String email, String password, String url) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(email);
        loginDTO.setPassword(password);
        installSpec(requestSpec(), responseSpec400());

        Response response = given()
                .body(loginDTO)
                .when()
                .post(url)
                .then()
                .log().body()
                .statusCode(400)
                .extract().response();

        JsonPath jsonResponse = response.jsonPath();
        String token = jsonResponse.getString("token");
        String error = jsonResponse.getString("error");
        Assert.assertNull(token, "Токен, при неудачной авторизации, должен быть пустым.");
        Assert.assertNotNull(error, "Ошибка, при неудачной авторизации, не может быть пустой.");
    }

}
