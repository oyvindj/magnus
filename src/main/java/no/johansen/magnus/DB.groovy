package no.johansen.magnus

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;


@Component
interface DB extends MongoRepository<Person, String> {
}
