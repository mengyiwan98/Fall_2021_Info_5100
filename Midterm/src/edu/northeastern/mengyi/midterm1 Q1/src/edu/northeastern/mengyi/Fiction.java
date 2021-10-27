package edu.northeastern.mengyi;

//This class should extends book class and implement the interface.
//Fiction (String title, double price, String publishYear); //Constructor
//Also implement the abstract method in parent class.
//Sample description : “Anne Frank(title) all events are true and based on real facts.”
public class Fiction extends ClassBook implements iBorrowable {
    private int borrowDate;
    private int returnDate;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

@Override
    public String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts ";
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean Available(int day) {
        return day >= borrowDate && day <= returnDate;
    }
}
