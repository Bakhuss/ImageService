package ru.bakhuss.imageservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bakhuss.imageservice.model.Image;

@Repository
public interface ImageDao extends CrudRepository<Image, Long> {
}
