package test.test112.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.test112.model.Library;
import test.test112.repository.LibraryRepository;

@Controller
public class LibraryController {

    @Autowired
   LibraryRepository libraryRepository;

    @GetMapping("/addLibrary")
    public String getLibrary(Model model) {
        model.addAttribute("library", new Library());
        return "addLibrary";
    }


    @RequestMapping(value = "/saveLibrary")
    public String saveItem(Library library){
        libraryRepository.save(library);
        return "done";
    }


}