package com.gradbook.hazelcaststoragenode;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class HazelcastStorageNodeApplication {

    @Bean(destroyMethod = "shutdown")
    public HazelcastInstance createStorageNode(){
        return Hazelcast.newHazelcastInstance();
    }

	public static void main(String[] args) {
		SpringApplication.run(HazelcastStorageNodeApplication.class, args);
	}
}
