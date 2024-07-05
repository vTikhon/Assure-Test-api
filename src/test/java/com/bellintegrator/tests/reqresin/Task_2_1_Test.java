package com.bellintegrator.tests.reqresin;

import java.util.*;
import com.bellintegrator.data.reqresin.DataStream;
import com.bellintegrator.dto.reqresin.UserResourceDTO;
import com.bellintegrator.tests.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.given;

/**
 * Класс Task_2_1_Test содержит тесты для проверки уникальности имён файлов аватаров пользователей.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public class Task_2_1_Test extends BaseTest {

    /**
     * Тест проверяет уникальность имён файлов аватаров пользователей.
     *
     * @param url URL, по которому отправляется GET-запрос для получения данных пользователей.
     */
    @Test(dataProvider = "firstTest", dataProviderClass = DataStream.class)
    public void firstTest(String url) {
        UserResourceDTO userResourceDTO = given()
                .when()
                .get(url)
                .then()
                .extract()
                .body()
                .as(UserResourceDTO.class);

        Set<String> avatarFileNames = new HashSet<>();
        userResourceDTO.getData().forEach(userDataDTO -> {
            String avatarUrl = userDataDTO.getAvatar();
            String avatarFileName = avatarUrl.substring(avatarUrl.lastIndexOf("/") + 1, avatarUrl.lastIndexOf("."));
            avatarFileNames.add(avatarFileName);
        });

        Assert.assertEquals(avatarFileNames.size(), userResourceDTO.getData().size(),
                "Имена файлов аватаров пользователей не уникальны");
    }

}
