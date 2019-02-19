package test.test112.controller;


import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.test112.model.Book;
import test.test112.model.Library;
import test.test112.repository.BookRepository;
import test.test112.repository.LibraryRepository;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/addBook")
    public String getLibrary(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("libraries", libraryRepository.findAll());
        return "addBook";
    }

    @RequestMapping(value = "/saveBook")
    public String saveItem(Book book){
        val found_library = libraryRepository.findById(book.getLibrary().getId());
        Library library = found_library.get();
        book.setLibrary(library);
        bookRepository.save(book);
        return "done";
    }


}