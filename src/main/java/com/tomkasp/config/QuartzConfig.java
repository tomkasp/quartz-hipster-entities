package com.tomkasp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class QuartzConfig {

    static final Logger LOG = LoggerFactory.getLogger(QuartzConfig.class);

    private final DataSource dataSource;
    private final PlatformTransactionManager transactionManager;
    private final ApplicationContext applicationContext;

    public QuartzConfig(DataSource dataSource, PlatformTransactionManager transactionManager, ApplicationContext applicationContext) {
        this.dataSource = dataSource;
        this.transactionManager = transactionManager;
        this.applicationContext = applicationContext;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();

        schedulerFactoryBean.setQuartzProperties(quartzProperties());
        schedulerFactoryBean.setDataSource(dataSource);
        schedulerFactoryBean.setTransactionManager(transactionManager);
        schedulerFactoryBean.setOverwriteExistingJobs(true);

        // Custom job factory of spring with DI support for @Autowired
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        schedulerFactoryBean.setJobFactory(jobFactory);

        return schedulerFactoryBean;
    }

    @Bean
    public Properties quartzProperties() {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("quartz.properties"));
        Properties properties;
        try {
            propertiesFactoryBean.afterPropertiesSet();
            properties = propertiesFactoryBean.getObject();
            LOG.info("Value of the property org.quartz.jobStore.driverDelegateClass {}", properties.getProperty("org.quartz.jobStore.driverDelegateClass"));
        }
        catch (IOException e) {
            throw new RuntimeException("Unable to load quartz.properties", e);
        }
        return properties;
    }
}
