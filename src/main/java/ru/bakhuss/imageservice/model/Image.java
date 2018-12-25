package ru.bakhuss.imageservice.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Data
@Entity
public class Image {
    @Id
    @Setter(value = AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Integer version;

    @Column(length = 1000000)
    private byte[] img;

    @Column
    private String url;
}
