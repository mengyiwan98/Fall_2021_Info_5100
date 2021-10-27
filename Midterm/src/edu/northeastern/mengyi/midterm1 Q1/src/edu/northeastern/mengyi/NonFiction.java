package edu.northeastern.mengyi;

public class NonFiction extends ClassBook implements iBorrowable {
    private int borrowDate;
    private int returnDay;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are true and based on real facts. ";
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDay = returnDate;
    }

    public Boolean Available(int day) {
        return day >= borrowDate && day <= returnDay;
    }
}
