package ru.bakhuss.imageservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bakhuss.imageservice.dao.ImageDao;
import ru.bakhuss.imageservice.error.ResponseErrorException;
import ru.bakhuss.imageservice.model.Image;
import ru.bakhuss.imageservice.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {
    private final Logger log = LoggerFactory.getLogger(ImageServiceImpl.class);

    private final ImageDao imageDao;

    @Autowired
    public ImageServiceImpl(ImageDao imageDao) {
        this.imageDao = imageDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Long addImage(Image image) {
        return imageDao.save(image).getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(readOnly = true)
    public Image getImage(Long id) {
        return imageDao.findById(id)
                .orElseThrow(
                        () -> new ResponseErrorException("Image by id = " + id + " not found")
                );
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateImage(Image image) {
        imageDao.save(image);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void deleteImage(Long id) {
        imageDao.deleteById(id);
    }
}
