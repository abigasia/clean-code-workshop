package com.movierental;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void ValidateStatementOutputForRegularMovie()
    {
        Customer customer = new Customer("Akanksha");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.REGULAR), 9));

        assertEquals("Rental Record for Akanksha\n" +
                "\tHarry Potter\t2.0\n" +
                "\tThe Avengers\t6.5\n" +
                "\tThe Proposal\t12.5\n" +
                "Amount owed is 21.0\n" +
                "You earned 3 frequent renter points", customer.statement());
    }

    @Test
    public void ValidateStatementOutputForChilderMovie()
    {
        Customer customer = new Customer("Ashita");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.CHILDRENS), 9));

        assertEquals("Rental Record for Ashita\n" +
                "\tHarry Potter\t1.5\n" +
                "\tThe Avengers\t4.5\n" +
                "\tThe Proposal\t10.5\n" +
                "Amount owed is 16.5\n" +
                "You earned 3 frequent renter points", customer.statement());
    }

    @Test
    public void ValidateStatementOutputForNewReleaseMovie()
    {
        Customer customer = new Customer("Asha");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.NEW_RELEASE), 9));

        assertEquals("Rental Record for Asha\n" +
                "\tHarry Potter\t6.0\n" +
                "\tThe Avengers\t15.0\n" +
                "\tThe Proposal\t27.0\n" +
                "Amount owed is 48.0\n" +
                "You earned 6 frequent renter points", customer.statement());
    }

    @Test
    public void ValidateStatementOutputForDifferentMovie()
    {
        Customer customer = new Customer("Richa");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.NEW_RELEASE), 9));

        assertEquals("Rental Record for Richa\n" +
                "\tHarry Potter\t1.5\n" +
                "\tThe Avengers\t6.5\n" +
                "\tThe Proposal\t27.0\n" +
                "Amount owed is 35.0\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

    @Test
    public void ValidateStatementOutputForNoMovie()
    {
        Customer customer = new Customer("Shiva");

        assertEquals("Rental Record for Shiva\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", customer.statement());
    }

    @Test
    public void ValidateHtmlStatementOutputForRegularMovie()
    {
        Customer customer = new Customer("Akanksha");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.REGULAR), 9));

        assertEquals("<h1>Rental Record for <b>Akanksha</b></h1><br/>" +
                "Harry Potter 2.0<br/>" +
                "The Avengers 6.5<br/>" +
                "The Proposal 12.5<br/>" +
                "Amount owed is <b>21.0</b><br/>" +
                "You earned <b>3</b>frequent renter points", customer.htmlStatement());
    }

    @Test
    public void ValidateHtmlStatementOutputForChilderMovie()
    {
        Customer customer = new Customer("Ashita");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.CHILDRENS), 9));

        assertEquals("<h1>Rental Record for <b>Ashita</b></h1><br/>" +
                "Harry Potter 1.5<br/>" +
                "The Avengers 4.5<br/>" +
                "The Proposal 10.5<br/>" +
                "Amount owed is <b>16.5</b><br/>" +
                "You earned <b>3</b>frequent renter points", customer.htmlStatement());
    }

    @Test
    public void ValidateHtmlStatementOutputForNewReleaseMovie()
    {
        Customer customer = new Customer("Asha");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.NEW_RELEASE), 9));

        assertEquals("<h1>Rental Record for <b>Asha</b></h1><br/>" +
                "Harry Potter 6.0<br/>" +
                "The Avengers 15.0<br/>" +
                "The Proposal 27.0<br/>" +
                "Amount owed is <b>48.0</b><br/>" +
                "You earned <b>6</b>frequent renter points", customer.htmlStatement());
    }

    @Test
    public void ValidateHtmlStatementOutputForDifferentMovie()
    {
        Customer customer = new Customer("Richa");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("The Avengers", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("The Proposal", Movie.NEW_RELEASE), 9));

        assertEquals("<h1>Rental Record for <b>Richa</b></h1><br/>" +
                "Harry Potter 1.5<br/>" +
                "The Avengers 6.5<br/>" +
                "The Proposal 27.0<br/>" +
                "Amount owed is <b>35.0</b><br/>" +
                "You earned <b>4</b>frequent renter points", customer.htmlStatement());
    }

    @Test
    public void ValidateHtmlStatementOutputForNoMovie()
    {
        Customer customer = new Customer("Shiva");

        assertEquals("<h1>Rental Record for <b>Shiva</b></h1><br/>" +
                "Amount owed is <b>0.0</b><br/>" +
                "You earned <b>0</b>frequent renter points", customer.htmlStatement());
    }

}