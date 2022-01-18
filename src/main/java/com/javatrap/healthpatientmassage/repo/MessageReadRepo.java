package com.javatrap.healthpatientmassage.repo;

import com.javatrap.healthpatientmassage.repo.entity.MessageRead;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MessageReadRepo extends MongoRepository<MessageRead, String> {
    Optional<MessageRead> findById(String messageReadId);
}
