package com.movierental;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement()
  {
    return Statement.statement(name, rentals);
  }

  public String htmlStatement() { return Statement.htmlStatement(name, rentals); }
}

