package com.bellintegrator.properties;

import org.aeonbits.owner.ConfigFactory;

/**
 * Класс Properties загружает конфигурационные свойства для тестов.
 *
 * @version 1.0
 * @since 2024-07-04
 * @author Vergentev Tikhon
 */
public class Properties {

    /**
     * Объект testsProperties загружает свойства тестов из конфигурационного файла.
     */
    public static URIsProperties urIsProperties = ConfigFactory.create(URIsProperties.class);
    public static APIProperties apiProperties = ConfigFactory.create(APIProperties.class);
}
