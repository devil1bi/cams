package com.clinic.web.rest;

import com.clinic.domain.Doctor;
import com.clinic.repository.SearchRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by japnica on 1/9/2017.
 */
@RestController
@CrossOrigin(origins = "http://localhost:9000")

@RequestMapping("/api")
public class SearchController {
    @Inject
    SearchRepository searchRepository;

    @RequestMapping(value="/search/{id}",
    method = RequestMethod.GET,
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> search(@PathVariable Integer id){
        System.out.println(id);
        List<Doctor> doctors=searchRepository.findDoctors(id);
        System.out.println(doctors.toString());
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
}
