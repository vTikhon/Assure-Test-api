package com.bellintegrator.dto.reqresin;

import lombok.Data;

/**
 * Класс ResourceDTO представляет собой объект общего ресурса.
 * Этот класс используется для хранения информации о страницах, количестве элементов на странице, общем количестве элементов и страниц,
 * а также информации о поддержке.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class ResourceDTO {

    /**
     * Номер текущей страницы.
     */
    private Integer page;

    /**
     * Количество элементов на странице.
     */
    private Integer per_page;

    /**
     * Общее количество элементов.
     */
    private Integer total;

    /**
     * Общее количество страниц.
     */
    private Integer total_pages;

    /**
     * Объект SupportDTO, содержащий информацию о поддержке.
     */
    private SupportDTO support;

}
