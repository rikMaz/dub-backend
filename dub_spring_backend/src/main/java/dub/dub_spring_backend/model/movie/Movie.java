package dub.dub_spring_backend.model.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private String id;
    private String name;
    private String image;
    private String overview;
    private String releaseDate;
    private String runtime;
    private String originalLanguage;
    private String budget;
    private String revenue;
    private String type;
}
