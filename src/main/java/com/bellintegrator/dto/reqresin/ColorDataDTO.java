package com.bellintegrator.dto.reqresin;

import lombok.Data;

/**
 * Класс ColorDataDTO представляет собой объект данных цвета.
 * Этот класс используется для хранения информации о цвете, такой как идентификатор, имя, год, цвет и значение по Pantone.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class ColorDataDTO {

    /**
     * Идентификатор цвета.
     */
    private Integer id;

    /**
     * Имя цвета.
     */
    private String name;

    /**
     * Год, связанный с цветом.
     */
    private Integer year;

    /**
     * Значение цвета в формате HEX.
     */
    private String color;

    /**
     * Значение цвета по Pantone.
     */
    private String pantone_value;

}
