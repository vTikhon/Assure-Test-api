package com.bellintegrator.dto.reqresin;

import lombok.Data;
import java.util.List;

/**
 * Класс ColorResourceDTO представляет собой объект ресурса, содержащий список данных о цветах.
 * Этот класс наследуется от ResourceDTO и используется для хранения информации о цветах.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class ColorResourceDTO extends ResourceDTO {

    /**
     * Список объектов ColorDataDTO, представляющих данные о цветах.
     */
    private List<ColorDataDTO> data;

}
