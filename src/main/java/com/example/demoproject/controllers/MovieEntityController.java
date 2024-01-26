package com.example.demoproject.controllers;
import com.example.demoproject.dto.MovieEntity;
import com.example.demoproject.services.MovieEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/movie-entity")
public class MovieEntityController {

    private final MovieEntityService yourEntityService;

    @Autowired
    public MovieEntityController(MovieEntityService yourEntityService) {
        this.yourEntityService = yourEntityService;
    }

//    @PostMapping
//    public void createEntity(@RequestBody MovieEntity yourEntity) {
//        yourEntityService.saveOrUpdate(yourEntity);
//    }

    @PostMapping
    public ResponseEntity<MovieEntity> createEntity(@RequestBody MovieEntity yourEntity) {
        MovieEntity savedEntity = yourEntityService.saveEntity(yourEntity);
        return ResponseEntity.ok(savedEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieEntity> getEntityById(@PathVariable Long id) {
        MovieEntity entity = yourEntityService.findById(id);

        if (entity != null) {
            return ResponseEntity.ok(entity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping(ApiConstant.MOVIE + "/v1")
//    @ResponseBody
//    public MovieEntity findById(Long id) {
//        return entityManager.find(MovieEntity.class, id);
//    }

    // Add other endpoints as needed
}