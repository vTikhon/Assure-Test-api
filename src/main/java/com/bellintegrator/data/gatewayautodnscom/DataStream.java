package com.bellintegrator.data.gatewayautodnscom;

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
     * Дата провайдер для теста fourthTest.
     *
     * @return двумерный массив объектов, содержащий URL для теста.
     */
    @DataProvider(name = "fourthTest")
    public static Object[][] dataForFourthTest() {
        return new Object[][]{
                {
                        Properties.urIsProperties.gatewayAutodnsComURI()
                }
        };
    }

}
