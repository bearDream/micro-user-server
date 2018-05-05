package cn.ching.user.struct.autoconfig;

import cn.ching.mandal.config.ApplicationConfig;
import cn.ching.mandal.config.ProtocolConfig;
import cn.ching.mandal.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description: mandal SOA config
 **/
@Configuration
public class MandalConfig {

    @Value("${appId}")
    private String appId;

    @Value("${protocol.id}")
    private String protocolId;

    @Value("${protocol.name}")
    private String protocolName;

    @Value("${protocol.port}")
    private Integer protocolPort;

    @Value("${registry.address}")
    private String registryAddress;

    @Value("${registry.protocol}")
    private String registryProtocol;

    @Value("${registry.client}")
    private String client;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(appId);
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setId(protocolId);
        protocolConfig.setName(protocolName);
        protocolConfig.setPort(protocolPort);
        return protocolConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registryProtocol + registryAddress);
        registryConfig.setClient(client);
        return registryConfig;
    }
}
