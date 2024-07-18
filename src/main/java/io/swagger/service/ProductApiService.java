package io.swagger.service;

import io.swagger.model.Product;
import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductApiService {
    private final MongoTemplate mongoTemplate;

    public ProductApiService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Document> findName(String name) {
        Query query = new Query();
        Criteria condition = new Criteria().where("name").is(name);
        query.addCriteria(condition);
        if(mongoTemplate.find(query, Document.class, "products") == null) {
            throw new RuntimeException("Product does not exist");
        }
        else {
            return mongoTemplate.find(query, Document.class, "products");
        }
    }
}
