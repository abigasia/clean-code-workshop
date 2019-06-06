package com.movierental;

import java.util.ArrayList;

class Rentals extends ArrayList<Rental> {

    int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }
}
