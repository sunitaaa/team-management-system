
package com.f1soft.team.management.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author sunita.joshi
 */
@Configuration
@ComponentScan(basePackages = "com.f1soft.team.management.system",
        excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        })
     public class RootConfig {

}