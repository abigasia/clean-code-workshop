package com.movierental;

public class Rental {

  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  Movie getMovie() {
    return movie;
  }

  double amount() {
    double rentalAmount = 0;

    switch (movie.getPriceCode()) {
      case Movie.REGULAR:
        rentalAmount += 2;
        if (daysRented > 2)
          rentalAmount += (daysRented - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        rentalAmount += daysRented * 3;
        break;
      case Movie.CHILDRENS:
        rentalAmount += 1.5;
        if (daysRented > 3)
          rentalAmount += (daysRented - 3) * 1.5;
        break;
    }

    return rentalAmount;
  }

  int frequentRenterPoints() {
    int frequentRenterPoints = 1;
    if (isBonusApplicable())
      return ++frequentRenterPoints;

    return frequentRenterPoints;
  }

  private boolean isBonusApplicable() {
    return (movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1;
  }
}