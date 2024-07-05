package com.bellintegrator.tests.gatewayautodnscom;

import com.bellintegrator.data.gatewayautodnscom.DataStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;

/**
 * Класс Task_2_4_Test содержит тест для проверки количества HTML-тегов в ответе.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public class Task_2_4_Test {

    /**
     * Тест проверяет, что в ответе содержится ожидаемое количество HTML-тегов.
     *
     * @param url URL, по которому отправляется GET-запрос для получения ответа.
     */
    @Test(dataProvider = "fourthTest", dataProviderClass = DataStream.class)
    public void fourthTest(String url) {
        String response = given()
                .when()
                .get(url)
                .then()
                .extract()
                .body()
                .asString();

        Pattern pattern = Pattern.compile("</[^>]*>");
        Matcher matcher = pattern.matcher(response);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        Assert.assertEquals(count, 14, "Количество тегов в ответе не соответствует ожидаемому.");
    }

}
