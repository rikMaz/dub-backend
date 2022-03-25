package dub.dub_spring_backend.model.voiceactor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoiceActorPreview {

    private String id;
    private String name;
    private String image;
    private String type;

}
