package com.boot.udemy.bootstrap;

import com.boot.udemy.model.Author;
import com.boot.udemy.model.Book;
import com.boot.udemy.model.Publisher;
import com.boot.udemy.repository.AuthorRepository;
import com.boot.udemy.repository.BookRepository;
import com.boot.udemy.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by vikas on 26-04-2020.
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... strings) throws Exception {
        Publisher publisher = new Publisher("Publisher 1","CITY",
                "STATE","Address line one","23523532");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ericBook1 = new Book("Domain Driven Design", "21124325");
        eric.getBooks().add(ericBook1);
        ericBook1.getAuthors().add(eric);
        ericBook1.setPublisher(publisher);
        publisher.getBooks().add(ericBook1);

        authorRepository.save(eric);
        bookRepository.save(ericBook1);


        Author steve = new Author("Steve", "Gibbons");
        Book steveBook1 = new Book("Head first in java", "12141212");
        steve.getBooks().add(steveBook1);
        steveBook1.getAuthors().add(steve);
        steveBook1.setPublisher(publisher);
        publisher.getBooks().add(steveBook1);

        authorRepository.save(steve);
        bookRepository.save(steveBook1);



        publisherRepository.save(publisher);


        System.out.println("BootstrapData coompleted data setup");

        System.out.println("Data count in database");
        System.out.println("Books : "+bookRepository.count());
        System.out.println("Authors : "+authorRepository.count());
        System.out.println("Publisher : "+publisherRepository.count());

    }
}
