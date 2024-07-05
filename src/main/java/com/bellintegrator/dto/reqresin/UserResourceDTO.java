package com.bellintegrator.dto.reqresin;

import lombok.Data;
import java.util.List;

/**
 * Класс UserResourceDTO представляет собой объект ресурса, содержащий список данных пользователей.
 * Этот класс наследуется от ResourceDTO и используется для хранения информации о пользователях.
 *
 * @version 1.0
 * @since 2024-06-26
 * @author Vergentev Tikhon
 */
@Data
public class UserResourceDTO extends ResourceDTO {

    /**
     * Список объектов UserDataDTO, представляющих данные о пользователях.
     */
    private List<UserDataDTO> data;

}
