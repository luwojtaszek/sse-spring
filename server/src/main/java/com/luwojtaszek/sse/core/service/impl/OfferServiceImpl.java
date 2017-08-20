package com.luwojtaszek.sse.core.service.impl;

import com.luwojtaszek.sse.core.domain.model.Offer;
import com.luwojtaszek.sse.core.service.OfferService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 15.08.2017.
 * With IntelliJ IDEA 15
 */
@Service
public class OfferServiceImpl implements OfferService {

    private final List<Offer> offers = new ArrayList<>();

    {
        offers.add(new Offer("Offer 1", "Description of offer1", "Full Description of offer1", "offer 1 thumbnail"));
        offers.add(new Offer("Offer 2", "Description of offer2", "Full Description of offer2", "offer 2 thumbnail"));
        offers.add(new Offer("Offer 3", "Description of offer3", "Full Description of offer3", "offer 3 thumbnail"));
        offers.add(new Offer("Offer 4", "Description of offer4", "Full Description of offer4", "offer 4 thumbnail"));
        offers.add(new Offer("Offer 5", "Description of offer5", "Full Description of offer5", "offer 5 thumbnail"));
    }

    @Override
    public Flux<Offer> shuffleOffer(final int periodInSeconds) {
        Flux<Offer> offersFlux = Flux.fromIterable(offers).repeat();
        Flux<Long> durationFlux = Flux.interval(Duration.ofSeconds(periodInSeconds));
        return Flux.zip(offersFlux, durationFlux).map(Tuple2::getT1);
    }
}
