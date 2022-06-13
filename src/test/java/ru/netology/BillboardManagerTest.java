package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BillboardManagerTest {
    MovieItems first = new MovieItems(1,"Bloodshot","action movie");
    MovieItems second = new MovieItems (2,"Onward","cartoon");
    MovieItems third = new MovieItems (3, "Hotel Belgrade","comedy");
    MovieItems fourth = new MovieItems (4, "The Gentlemen","action movie");
    MovieItems fifth = new MovieItems (5, "The Invisible Man","horror");
    MovieItems sixth = new MovieItems (6, "Trolls World Tour","cartoon");
    MovieItems seventh = new MovieItems (7, "Number one","comedy");
    MovieItems eighth = new MovieItems (8, "Spider-Man: No Way Home","action movie");
    MovieItems ninth = new MovieItems (9, "Last Seen Alive","action movie");
    MovieItems tenth = new MovieItems (10, "Knockin' on Heaven's Door ","drama");

    @Test
    public void findAll() {
        BillboardManager manager = new BillboardManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        MovieItems[] actual = manager.findLast();
        MovieItems[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void findAll1() {
        BillboardManager manager = new BillboardManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        MovieItems[] actual = manager.findLast();
        MovieItems[] expected = {tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findAll2() {
        BillboardManager manager = new BillboardManager(15);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        MovieItems[] actual = manager.findLast();
        MovieItems[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findLast() {
        BillboardManager manager = new BillboardManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();

        MovieItems[] actual = manager.findAll();
        MovieItems[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(actual,expected);

    }
}