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
@Table(name="PUBLISHER")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Publisher {

    public Publisher(String publisherName,String city, String state, String addressLine, String zip) {
        this.publisherName = publisherName;
        this.city = city;
        this.state = state;
        this.addressLine = addressLine;
        this.zip = zip;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PUBLISHER_ID")
    private Integer publisherId;

    @Column(name="PUBLISHER_NAME")
    @EqualsAndHashCode.Exclude private String publisherName;

    @Column(name="CITY")
    @EqualsAndHashCode.Exclude private String city;

    @Column(name="STATE")
    @EqualsAndHashCode.Exclude private String state;

    @Column(name="ADDRESS_LINE")
    @EqualsAndHashCode.Exclude private String addressLine;

    @Column(name="ZIP_CODE")
    @EqualsAndHashCode.Exclude private String zip;

    @OneToMany
    @EqualsAndHashCode.Exclude private Set<Book> books = new HashSet<>();
}
