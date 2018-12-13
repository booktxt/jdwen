package com.air.garden.house;

import io.searchbox.client.JestClient;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseApplicationTest {

    @Autowired
    private JestClient jestClient;

//    @Test
//    public void testEs01() {
//
//        Book book = new Book();
//        book.setId(3);
//        book.setName("西游記");
//        book.setAuthor("吴承恩");
//
//
//    }
//
//    @Test
//    public void testEs02() {
//
//        Book book = new Book();
//        book.setId(1);
//        book.setName("西游記");
//        book.setAuthor("吴承恩");
//        Index index = new Index.Builder(book).index("shuku").type("book1").id("2").build();
//        try {
//            jestClient.execute(index);
//        } catch (Exception e) {
//
//        }
//    }



    }
