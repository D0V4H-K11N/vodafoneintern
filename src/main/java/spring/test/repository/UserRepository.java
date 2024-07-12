package spring.test.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import spring.test.model.User;

import java.util.List;

@Repository
public class UserRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

// CRUD

    public User save(User user) {
        mongoTemplate.save(user);
        return user;
    }

    public User findbyId(String userId) {
        return mongoTemplate.findById(userId, User.class);
    }

    public List<User> findAll() {
        return mongoTemplate.findAll(User.class);
    }

    public void deletebyId(String userId) {
        User user = findbyId(userId);
        if (user != null) {
            mongoTemplate.remove(user);
        }
    }
}