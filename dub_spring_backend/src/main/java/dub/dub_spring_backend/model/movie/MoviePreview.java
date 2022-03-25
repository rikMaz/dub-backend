package dub.dub_spring_backend.model.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoviePreview {

    private String id;
    private String name;
    private String image;
    private String type;

}
