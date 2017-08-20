package com.luwojtaszek.sse.core.service.impl;

import com.luwojtaszek.sse.core.service.OfferService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lukasz on 15.08.2017.
 * With IntelliJ IDEA 15
 */
@Slf4j
@RunWith(SpringRunner.class)
public class OfferServiceImplTests {

    @Test
    public void testShuffleOffer() throws Exception {
        OfferService offerService = new OfferServiceImpl();
        offerService.shuffleOffer(1).subscribe(offer -> {
            log.info("Got offer: ", offer);
        });
    }
}