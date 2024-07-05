package com.bellintegrator.dto.reqresin;

import lombok.Data;

/**
 * Класс LoginDTO представляет собой объект данных для логина.
 * Этот класс используется для хранения информации о логине, такой как электронная почта и пароль.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class LoginDTO {

    /**
     * Электронная почта пользователя.
     */
    private String email;

    /**
     * Пароль пользователя.
     */
    private String password;

}
