package ru.bakhuss.imageservice.controller;

import ru.bakhuss.imageservice.model.Image;
import ru.bakhuss.imageservice.view.ResponseView;

/**
 * Контроллер для работы с Image
 */
public interface ImageController {
    /**
     * Добавить Image
     *
     * @param image
     * @return result success
     */
     ResponseView addImage(Image image);

    /**
     * Получить Image по id
     *
     * @param id
     * @return Image by id
     */
    ResponseView getImage(Long id);

    /**
     * Обновить Image
     *
     * @param image
     * @return result success
     */
    ResponseView updateImage(Image image);

    /**
     * Удалить Image
     *
     * @param id
     * @return result success
     */
    ResponseView deleteImage(Long id);
}
