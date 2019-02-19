package test.test112.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "books")
@ToString
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String author_name;

    @Getter
    @Setter
    private String author_surname;

    @Getter
    @Setter
    private String year_released;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;


}

