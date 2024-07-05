package com.bellintegrator.properties;

import org.aeonbits.owner.Config;

/**
 * Интерфейс для загрузки базовых URI из различных источников.
 * <p>
 * Настройки загружаются из следующих источников:
 * <ul>
 *     <li>Системные свойства (system:properties)</li>
 *     <li>Переменные окружения (system:env)</li>
 *     <li>Файл src/main/resources/tests.properties</li>
 * </ul>
 * </p>
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface URIsProperties extends Config {

    /**
     * Возвращает базовый URI для API сервиса reqres.in.
     *
     * @return Базовый URI для API сервиса reqres.in.
     */
    @Config.Key("reqres.in.uri")
    String reqresInURI();

    /**
     * Возвращает URI для доступа к сервису gateway.autodns.com.
     *
     * @return URI для сервиса gateway.autodns.com.
     */
    @Config.Key("gateway.autodns.com.uri")
    String gatewayAutodnsComURI();
}
