package com.demo.cloudImpl;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ValidateConnectorChannels {

    String VALIDATE_CONNECTOR_CONSUMER = "validateConnectorConsumer";

    @Input(VALIDATE_CONNECTOR_CONSUMER)
    SubscribableChannel validateConnectorConsumer();
}
