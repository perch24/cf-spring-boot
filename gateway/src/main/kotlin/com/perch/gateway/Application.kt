package com.perch.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator
import org.springframework.context.annotation.Bean


@SpringBootApplication
@EnableDiscoveryClient
@Configuration
class Application {
    @Bean
    fun discoveryClientRouteLocator(discoveryClient: DiscoveryClient): DiscoveryClientRouteDefinitionLocator {
        return DiscoveryClientRouteDefinitionLocator(discoveryClient)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}