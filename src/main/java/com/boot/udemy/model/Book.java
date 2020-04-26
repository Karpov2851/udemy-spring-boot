package com.boot.udemy.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vikas on 26-04-2020.
 */
@Entity
@Table(name="BOOK")
@Getter
@Setter
@NoArgsConstructor
public class Book {

    public Book(String title,String isBn){
        this.title = title;
        this.isBn = isBn;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BOOK_ID")
    private Integer bookId;

    @Column(name="TITLE")
    @EqualsAndHashCode.Exclude private String title;
    @Column(name="IS_BN")
    @EqualsAndHashCode.Exclude private String isBn;

    @ManyToMany
    @JoinTable(name = "AUTHOR_BOOK",joinColumns = @JoinColumn(name="BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHOR_ID"))
    @EqualsAndHashCode.Exclude private Set<Author> authors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="PUBLISHER_ID")
    @EqualsAndHashCode.Exclude private Publisher publisher;
}
