package com.demo.connectors;
import org.activiti.api.process.model.IntegrationContext;
import org.activiti.api.process.runtime.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service(value = "validate")
public class Validate implements Connector {
    private Logger logger = LoggerFactory.getLogger(Validate.class);

    public IntegrationContext apply(IntegrationContext integrationContext) {
        logger.info("Some service task logic... [processInstanceId=" + integrationContext.getProcessInstanceId() + "]");

        return integrationContext;
    }

}
