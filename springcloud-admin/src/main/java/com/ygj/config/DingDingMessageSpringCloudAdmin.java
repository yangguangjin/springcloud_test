package com.ygj.config;

import com.ygj.springcloud.admin.DingDingNotifier;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: ygj
 * @Date: 2022/5/12 - 05 - 12 - 18:05
 */
@Configuration
public class DingDingMessageSpringCloudAdmin {


    @Bean
    public DingDingNotifier dingDingNotifier(InstanceRepository repository) {
        return new DingDingNotifier(repository);
    }


}
