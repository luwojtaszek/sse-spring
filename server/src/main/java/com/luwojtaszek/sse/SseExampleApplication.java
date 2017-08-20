package com.luwojtaszek.sse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.channel.MessageChannels;
import org.springframework.messaging.SubscribableChannel;

@SpringBootApplication
public class SseExampleApplication {

	@Bean(name = "highlightedOfferChannel")
	public SubscribableChannel highlightedOfferChannel(){
		return MessageChannels.publishSubscribe().get();
	}

	public static void main(String[] args) {
		SpringApplication.run(SseExampleApplication.class, args);
	}
}
