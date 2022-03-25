package dub.dub_spring_backend.controller;


import dub.dub_spring_backend.model.actor.Actor;
import dub.dub_spring_backend.model.actor.ActorPreview;
import dub.dub_spring_backend.model.movie.Movie;
import dub.dub_spring_backend.model.movie.MoviePreview;
import dub.dub_spring_backend.service.ActorService;
import dub.dub_spring_backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class TmdbController {

    private final MovieService movieService;
    private final ActorService actorService;

    @Autowired
    public TmdbController(MovieService movieService, ActorService actorService) {
        this.movieService = movieService;
        this.actorService = actorService;
    }

    @GetMapping("/search/movie/{name}")
    public List<MoviePreview> getMoviePreviewsByName(@PathVariable String name) {
        return movieService.getMoviePreviewsByName(name);
    }

    @GetMapping("/search/actor/{name}")
    public List<ActorPreview> getActorsPreviewsName(@PathVariable String name) {
        return actorService.getActorPreviewsByName(name);
    }

    @GetMapping("/actor/{id}")
    public Actor getActorById(@PathVariable String id) {
        return actorService.getActorById(id);
    }

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/movie/{id}/crew")
    public List<ActorPreview> getMovieCrewById(@PathVariable String id) {
        return movieService.getMovieCrewById(id);
    }

}
