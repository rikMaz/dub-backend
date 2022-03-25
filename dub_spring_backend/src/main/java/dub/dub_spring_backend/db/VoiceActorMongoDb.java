package dub.dub_spring_backend.db;

import dub.dub_spring_backend.model.voiceactor.VoiceActor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface VoiceActorMongoDb extends PagingAndSortingRepository<VoiceActor,String> {

    List<VoiceActor> findAllByName(String name);

    VoiceActor findAllById(String id);

    List<VoiceActor> findAll();

}
