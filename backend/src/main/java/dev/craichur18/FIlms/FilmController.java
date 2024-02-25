package dev.craichur18.FIlms;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/films")
public class FilmController {       //RestAPI Controller
    @Autowired
    private FilmService filmService;
    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        return new ResponseEntity<List<Film>>(filmService.allFilms(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Film>> getSingleFilm(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Film>>(filmService.singleFilm(imdbId), HttpStatus.OK);
    }
}
