package com.luwojtaszek.sse.web.controller;

import com.luwojtaszek.sse.core.domain.model.Offer;
import com.luwojtaszek.sse.core.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by lukasz on 15.08.2017.
 * With IntelliJ IDEA 15
 */
@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/highlighted", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Offer> highlightedOffer() {
        return offerService.shuffleOffer(3);
    }

}
