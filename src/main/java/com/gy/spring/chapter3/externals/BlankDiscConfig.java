package com.gy.spring.chapter3.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:chapter3/externals/app.properties")
public class BlankDiscConfig {

    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc()
    {
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }

}
