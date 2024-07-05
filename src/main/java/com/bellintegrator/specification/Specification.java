package com.bellintegrator.specification;

import com.bellintegrator.properties.Properties;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * Класс для настройки спецификаций запросов и ответов для RestAssured.
 */
public class Specification {

    /**
     * Создает и возвращает спецификацию запроса с базовым URI и типом содержимого JSON.
     *
     * @return Спецификация запроса.
     */
    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(Properties.urIsProperties.reqresInURI())
                .setContentType("application/json")
                .build();
    }

    /**
     * Создает и возвращает спецификацию ответа с ожидаемым статусом 200.
     *
     * @return Спецификация ответа.
     */
    public static ResponseSpecification responseSpec200() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    /**
     * Создает и возвращает спецификацию ответа с ожидаемым статусом 400.
     *
     * @return Спецификация ответа.
     */
    public static ResponseSpecification responseSpec400() {
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }

    /**
     * Устанавливает спецификацию запроса для RestAssured.
     *
     * @param requestSpec Спецификация запроса, которая будет установлена.
     */
    public static void installSpec(RequestSpecification requestSpec) {
        RestAssured.requestSpecification = requestSpec;
    }

    /**
     * Устанавливает спецификацию ответа для RestAssured.
     *
     * @param responseSpec Спецификация ответа, которая будет установлена.
     */
    public static void installSpec(ResponseSpecification responseSpec) {
        RestAssured.responseSpecification = responseSpec;
    }

    /**
     * Устанавливает спецификации запроса и ответа для RestAssured.
     *
     * @param requestSpec Спецификация запроса, которая будет установлена.
     * @param responseSpec Спецификация ответа, которая будет установлена.
     */
    public static void installSpec(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }

    /**
     * Удаляет установленные спецификации запросов и ответов для RestAssured.
     */
    public static void deleteSpec() {
        RestAssured.requestSpecification = null;
        RestAssured.responseSpecification = null;
    }
}
