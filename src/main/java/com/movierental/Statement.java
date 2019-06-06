package com.movierental;

@SuppressWarnings("StringConcatenationInLoop")
class Statement {

    static String statement(String customerName, Rentals rentals) {
        String result = "Rental Record for " + customerName + "\n";

        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.amount() + "\n";
        }


        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.frequentRenterPoints() + " frequent renter points";

        return result;
    }

    static String htmlStatement(String customerName, Rentals rentals) {
        String result = "<h1>Rental Record for <b>" + customerName + "</b></h1><br/>";

        for (Rental rental : rentals) {
            result += rental.getMovie().getTitle() + " " + rental.amount() + "<br/>";
        }

        //add footer lines result
        result += "Amount owed is <b>" + rentals.totalAmount() + "</b><br/>";
        result += "You earned <b>" + rentals.frequentRenterPoints() + "</b>frequent renter points";

        return result;
    }


}
