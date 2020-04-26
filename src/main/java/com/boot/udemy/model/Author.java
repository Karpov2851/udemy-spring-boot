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
@Table(name="AUTHOR")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Author {

   public Author(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="AUTHOR_ID")
    private Integer authorId;

    @Column(name="TITLE")
    @EqualsAndHashCode.Exclude  private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    @EqualsAndHashCode.Exclude  private Set<Book> books = new HashSet<>();


}
