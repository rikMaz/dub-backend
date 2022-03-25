package dub.dub_spring_backend.dto;

import dub.dub_spring_backend.model.actor.ActorPreview;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoiceActorDto {
    @Id
    private String id;
    private String name;
    private String image;
    private String birthday;
    private List<ActorPreview> actors;
    private String type;
}
