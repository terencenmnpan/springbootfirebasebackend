package io.tpan.springbootfirebasebackend.repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import io.tpan.springbootfirebasebackend.domain.User;
import reactor.core.publisher.Flux;

public interface UserRepository extends FirestoreReactiveRepository<User> {
    Flux<User> getUserByEmail(String email);

}
