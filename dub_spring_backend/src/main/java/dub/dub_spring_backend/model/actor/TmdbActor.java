package dub.dub_spring_backend.model.actor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TmdbActor {

    private String id;
    private String name;
    private String profile_path;
    private String character;
    private String biography;
    private String birthday;
    private String place_of_birth;
    private String known_for_department;

}
