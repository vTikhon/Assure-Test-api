package com.bellintegrator.dto.reqresin;

import lombok.Data;

/**
 * Класс UserDataDTO представляет собой объект данных пользователя.
 * Этот класс используется для хранения информации о пользователе, такой как идентификатор, электронная почта, имя, фамилия и аватар.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class UserDataDTO {

    /**
     * Идентификатор пользователя.
     */
    private Integer id;

    /**
     * Электронная почта пользователя.
     */
    private String email;

    /**
     * Имя пользователя.
     */
    private String first_name;

    /**
     * Фамилия пользователя.
     */
    private String last_name;

    /**
     * URL аватара пользователя.
     */
    private String avatar;

}
