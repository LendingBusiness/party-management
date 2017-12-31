package org.kd.party.config;

import org.kd.config.AppConfig;
import org.kd.service.LendingRequestWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class PartyMgmtAppConfig extends AppConfig{

    @Bean(name = "testLendingRequestWrapper")
    public LendingRequestWrapper createTestLendingRequestWrapper() {
        return new LendingRequestWrapper("party-management", "/hello/world");
    }

}
