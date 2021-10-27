package edu.northeastern.mengyi;

public interface iBorrowable {
    public interface Borrowable{
        void setBorrowDate(int day);

        void setReturnDate(int day);

        boolean isAvailable(int day);
    }
}
