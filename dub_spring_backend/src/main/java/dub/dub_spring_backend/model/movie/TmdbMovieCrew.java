package dub.dub_spring_backend.model.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import dub.dub_spring_backend.model.actor.TmdbActor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TmdbMovieCrew {

    @JsonProperty("cast")
    private List<TmdbActor> movieCrew;
}
