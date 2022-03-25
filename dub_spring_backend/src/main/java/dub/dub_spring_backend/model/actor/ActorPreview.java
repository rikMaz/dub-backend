package dub.dub_spring_backend.model.actor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActorPreview {

    private String id;
    private String name;
    private String character;
    private String image;
    private String type;
}
