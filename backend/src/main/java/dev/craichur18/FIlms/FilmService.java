package dev.craichur18.FIlms;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;
    public List<Film> allFilms(){
        return filmRepository.findAll();
    }

    public Optional<Film> singleFilm(String imdbId) {
        return filmRepository.findFilmByImdbId(imdbId);
    }
}
