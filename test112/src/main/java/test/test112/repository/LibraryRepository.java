package test.test112.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.test112.model.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {
    List<Library> findAll();
    Library findByBooks(String book_name);
}
