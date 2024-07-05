package com.bellintegrator.dto.reqresin;

import lombok.Data;

/**
 * Класс SupportDTO представляет собой объект данных поддержки.
 * Этот класс используется для хранения информации о поддержке, такой как URL и текст поддержки.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class SupportDTO {

    /**
     * URL поддержки.
     */
    private String url;

    /**
     * Текст поддержки.
     */
    private String text;

}
