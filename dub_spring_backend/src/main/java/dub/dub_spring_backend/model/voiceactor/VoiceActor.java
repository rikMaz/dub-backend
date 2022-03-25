package dub.dub_spring_backend.model.voiceactor;

import dub.dub_spring_backend.model.actor.ActorPreview;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "voiceactor")
public class VoiceActor {
    @Id
    private String id;
    private String name;
    private String image;
    private String birthday;
    private List<String> actorIds;
    private String type;
}
