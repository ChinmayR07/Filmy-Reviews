package dev.craichur18.FIlms;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRepository extends MongoRepository<Film, ObjectId> {
    Optional<Film> findFilmByImdbId(String imdbId);
}
