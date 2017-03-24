package com.example.envers.config;

import com.example.envers.repository.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackageClasses = {
                UserRepository.class
        },
        repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class
)
public class ApplicationConfig {
}
