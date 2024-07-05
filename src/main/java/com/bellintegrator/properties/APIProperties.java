package com.bellintegrator.properties;

import org.aeonbits.owner.Config;

/**
 * Интерфейс для загрузки URL-адресов API из различных источников.
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
public interface APIProperties extends Config {

    /**
     * Возвращает URL для получения пользователей через API.
     *
     * @return URL для API пользователей.
     */
    @Config.Key("api.users.url")
    String apiUsersURL();

    /**
     * Возвращает URL для логина через API.
     *
     * @return URL для API логина.
     */
    @Config.Key("api.login.url")
    String apiLoginURL();

    /**
     * Возвращает URL для неизвестного ресурса через API.
     *
     * @return URL для API неизвестного ресурса.
     */
    @Config.Key("api.unknown.url")
    String apiUnknownURL();
}
