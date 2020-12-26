package com.punguin.drugmanagementsystem.config;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoDBConfig {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Bean
    public GridFSBucket getGridFSBucket() {
        return GridFSBuckets.create(mongoTemplate.getDb());
    }
}
