package com.demo.cloudImpl;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SlackConnectorChannels {

    String SLACK_CONNECTOR_CONSUMER = "slackConnectorConsumer";

    @Input(SLACK_CONNECTOR_CONSUMER)
    SubscribableChannel slackConnectorConsumer();
}
