package com.air.garden.house;

import com.air.garden.house.model.Book;
import com.air.garden.house.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseApplicationTest {

    @Autowired
    private JestClient jestClient;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testEs01() {

        Book book = new Book();
        book.setId(3);
        book.setName("西游記");
        book.setAuthor("吴承恩");
        bookRepository.index(book);

    }

    @Test
    public void testEs02() {

        Book book = new Book();
        book.setId(1);
        book.setName("西游記");
        book.setAuthor("吴承恩");
        Index index = new Index.Builder(book).index("sidamingzhu").type("book").build();
        try {
            jestClient.execute(index);
        } catch (Exception e) {

        }
    }


    @Test
    public void testEs03() {
        for (Book book : bookRepository.findByNameLike("游")) {
            System.out.println(book.getAuthor());
        }
    }


    }
