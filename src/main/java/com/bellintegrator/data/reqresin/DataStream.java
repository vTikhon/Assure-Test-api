package com.bellintegrator.data.reqresin;

import com.bellintegrator.properties.Properties;
import org.testng.annotations.DataProvider;

/**
 * Класс DataStream предоставляет данные для различных тестов.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public class DataStream {

    /**
     * Дата провайдер для теста firstTest.
     *
     * @return двумерный массив объектов, содержащий URL для теста.
     */
    @DataProvider(name = "firstTest")
    public static Object[][] dataForFirstTest() {
        return new Object[][]{
                {
                        Properties.apiProperties.apiUsersURL()
                }
        };
    }

    /**
     * Дата провайдер для теста secondTest.
     *
     * @return двумерный массив объектов, содержащий email, пароль, формат и URL для теста.
     */
    @DataProvider(name = "secondTest")
    public static Object[][] secondTestData() {
        return new Object[][]{
                {
                        "eve.holt@reqres.in",
                        "cityslicka",
                        Properties.apiProperties.apiLoginURL()
                }
        };
    }

    /**
     * Дата провайдер для теста secondTestWithoutPassword.
     *
     * @return двумерный массив объектов, содержащий email, пустой пароль, формат и URL для теста.
     */
    @DataProvider(name = "secondTestWithoutPassword")
    public Object[][] dataForSecondTestWithoutPassword() {
        return new Object[][]{
                {
                        "peter@klaven",
                        "",
                        Properties.apiProperties.apiLoginURL()
                }
        };
    }

    /**
     * Дата провайдер для теста thirdTest.
     *
     * @return двумерный массив объектов, содержащий URL для теста.
     */
    @DataProvider(name = "thirdTest")
    public static Object[][] dataForThirdTest() {
        return new Object[][]{
                {
                        Properties.apiProperties.apiUnknownURL()
                }
        };
    }

}
