package dub.dub_spring_backend.service;

import dub.dub_spring_backend.db.VoiceActorMongoDb;
import dub.dub_spring_backend.dto.VoiceActorDto;
import dub.dub_spring_backend.model.actor.ActorPreview;
import dub.dub_spring_backend.model.voiceactor.VoiceActor;
import dub.dub_spring_backend.model.voiceactor.VoiceActorPreview;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DbService {

    private final VoiceActorMongoDb voiceActorMongoDb;
    private final ActorService actorService;

    public DbService(VoiceActorMongoDb voiceActorMongoDb, ActorService actorService) {
        this.voiceActorMongoDb = voiceActorMongoDb;
        this.actorService = actorService;
    }

    public List<VoiceActorPreview> getVoiceActorPreviewsByName(String name) {

        return voiceActorMongoDb.findAllByName(name)
                .stream()
                .map(voiceActor -> VoiceActorPreview.builder()
                        .id(voiceActor.getId())
                        .name(voiceActor.getName())
                        .image(voiceActor.getImage())
                        .type(voiceActor.getType())
                        .build())
                .collect(Collectors.toList());
    }


    public VoiceActorDto getVoiceActorById(String id) {
        VoiceActor voiceActor = voiceActorMongoDb.findAllById(id);

        VoiceActorDto voiceActorDto = VoiceActorDto.builder()
                .id(voiceActor.getId())
                .name(voiceActor.getName())
                .image(voiceActor.getImage())
                .birthday(voiceActor.getBirthday())
                .type(voiceActor.getType())
                .build();

        voiceActorDto.setActors(voiceActor.getActorIds()
                .stream()
                .map(actorService::getActorPreviewById)
                .collect(Collectors.toList()));

        return voiceActorDto;
    }

    public List<VoiceActor> getAllVoiceActors() {
        return voiceActorMongoDb.findAll();
    }

}
