package ru.bakhuss.imageservice.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bakhuss.imageservice.controller.ImageController;
import ru.bakhuss.imageservice.model.Image;
import ru.bakhuss.imageservice.service.ImageService;
import ru.bakhuss.imageservice.view.ResponseView;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/image/", produces = APPLICATION_JSON_VALUE)
public class ImageControllerImpl implements ImageController {
    private final Logger log = LoggerFactory.getLogger(ImageControllerImpl.class);

    private final ImageService imageService;

    @Autowired
    public ImageControllerImpl(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    @PostMapping(value = "/save")
    public ResponseView addImage(@RequestBody Image image) {
        return new ResponseView();
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseView getImage(@PathVariable Long id) {
        return new ResponseView(imageService.getImage(id));
    }

    @Override
    @PostMapping("/update")
    public ResponseView updateImage(@RequestBody Image image) {
        return new ResponseView();
    }

    @Override
    @PostMapping("/delete/{id}")
    public ResponseView deleteImage(@PathVariable Long id) {
        return new ResponseView();
    }
}
