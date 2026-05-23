package com.example.QuoraApp.repositories;

import com.example.QuoraApp.models.Question;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface QuestionRepository extends ReactiveMongoRepository<Question, String> {
    Flux<Question> findByAuthorId(String authorId);

    Mono<Long> countByAuthorId(String authorId);
}
