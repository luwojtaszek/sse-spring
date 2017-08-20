package com.luwojtaszek.sse.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

/**
 * Created by lukasz on 15.08.2017.
 * With IntelliJ IDEA 15
 */
@Data
@AllArgsConstructor
public class Offer {
    private final UUID id = UUID.randomUUID();
    private String header;
    private String shortDescription;
    private String fullDescription;
    private String thumbnail;
}