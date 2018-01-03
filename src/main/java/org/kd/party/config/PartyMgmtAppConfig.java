package org.kd.party.config;

import org.kd.config.AppConfig;
import org.kd.service.LendingRequestWrapper;
import org.kd.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PartyMgmtAppConfig extends AppConfig{

    @Bean(name = "testLendingRequestWrapper")
    public LendingRequestWrapper createTestLendingRequestWrapper() {
        return new LendingRequestWrapper(ServiceRegistry.AppName.PARTY_MANAGEMENT, "/hello/world");
    }

}
