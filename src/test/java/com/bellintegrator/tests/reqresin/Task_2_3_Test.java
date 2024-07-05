package com.bellintegrator.tests.reqresin;

import com.bellintegrator.data.reqresin.DataStream;
import com.bellintegrator.dto.reqresin.ColorDataDTO;
import com.bellintegrator.dto.reqresin.ColorResourceDTO;
import com.bellintegrator.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import static io.restassured.RestAssured.given;

/**
 * Класс Task_2_3_Test содержит тест для проверки сортировки данных по годам.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public class Task_2_3_Test extends BaseTest {

    /**
     * Тест проверяет, что данные о цветах отсортированы по годам в порядке возрастания.
     *
     * @param url URL, по которому отправляется GET-запрос для получения данных о цветах.
     */
    @Test(dataProvider = "thirdTest", dataProviderClass = DataStream.class)
    public void thirdTest(String url) {
        ColorResourceDTO colorResourceDTO = given()
                .when()
                .get(url)
                .then()
                .extract()
                .body()
                .as(ColorResourceDTO.class);

        List<ColorDataDTO> colorDataDTOList = colorResourceDTO.getData();
        boolean isLess = true;
        for (int i = 0; i < colorDataDTOList.size() - 1; i++) {
            if (colorDataDTOList.get(i + 1).getYear() < colorDataDTOList.get(i).getYear()) {
                isLess = false;
                break;
            }
        }
        Assert.assertTrue(isLess, "Объекты, характеризующие цвет, не сортированы по годам");
    }

}
