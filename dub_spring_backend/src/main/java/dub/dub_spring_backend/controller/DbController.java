package dub.dub_spring_backend.controller;

import dub.dub_spring_backend.dto.VoiceActorDto;
import dub.dub_spring_backend.model.voiceactor.VoiceActor;
import dub.dub_spring_backend.model.voiceactor.VoiceActorPreview;
import dub.dub_spring_backend.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database")
public class DbController {

    private DbService dbService;

    @Autowired
    public DbController(DbService dbService) {
        this.dbService = dbService;
    }

    @GetMapping("/voiceactor/name/{name}")
    public List<VoiceActorPreview> getVoiceActorPreviewsByName(@PathVariable String name) {
        return dbService.getVoiceActorPreviewsByName(name);
    }

    @GetMapping("/voiceactor/all")
    public List<VoiceActor> getAllVoiceActorPreviews() {
        return dbService.getAllVoiceActors();
    }

    @GetMapping("/voiceactor/id/{id}")
    public VoiceActorDto getVoiceActorsById (@PathVariable String id) {
        return dbService.getVoiceActorById(id);
    }
}
