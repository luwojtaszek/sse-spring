package com.luwojtaszek.sse.core.service;

import com.luwojtaszek.sse.core.domain.model.Offer;
import reactor.core.publisher.Flux;

/**
 * Created by lukasz on 15.08.2017.
 * With IntelliJ IDEA 15
 */
public interface OfferService {
    Flux<Offer> shuffleOffer(int periodInSeconds);
}
