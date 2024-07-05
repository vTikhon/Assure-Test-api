package com.bellintegrator.tests;

import static com.bellintegrator.specification.Specification.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/**
 * Абстрактный класс BaseTest предоставляет базовую настройку для тестов.
 * Он включает методы для установки и очистки спецификаций запросов и ответов.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
public abstract class BaseTest {

    /**
     * Метод, выполняемый перед каждым тестовым методом.
     * Устанавливает спецификацию запроса и ожидаемого ответа со статусом 200.
     */
    @BeforeMethod
    public void setup() {
        installSpec(requestSpec(), responseSpec200());
    }

    /**
     * Метод, выполняемый после каждого тестового метода.
     * Очищает установленную спецификацию.
     */
    @AfterMethod
    public void quit() {
        deleteSpec();
    }
}
