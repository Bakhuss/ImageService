package ru.bakhuss.imageservice.service;

import ru.bakhuss.imageservice.model.Image;

/**
 * Сервис для работы с Image
 */
public interface ImageService {

    /**
     * Добавить Image
     *
     * @param image
     * @return id of the new Image
     */
    Long addImage(Image image);

    /**
     * Получить Image по id
     *
     * @param id
     * @return Image
     */
    Image getImage(Long id);

    /**
     * Изменить Image
     *
     * @param image
     */
    void updateImage(Image image);

    /**
     * Удалить Image
     *
     * @param id
     */
    void deleteImage(Long id);
}
