package test.test112.controller;


import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.test112.model.Library;
import test.test112.repository.LibraryRepository;

@RestController
@RequestMapping("/api")
public class LibraryRestController {
    @Autowired
    LibraryRepository libraryRepository;

    @RequestMapping(value ="/library/{library_id}", method= RequestMethod.GET)
    public Library getLibrary(@PathVariable("library_id") long libraryId){
        val student = libraryRepository.findById(libraryId);
        return student.get();
    }

}