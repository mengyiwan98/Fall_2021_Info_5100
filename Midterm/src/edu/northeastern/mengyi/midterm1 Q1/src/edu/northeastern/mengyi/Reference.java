package edu.northeastern.mengyi;

//Fields: String category (example: dictionaries, encyclopedia)
//Fiction (String title, double price, String publishYear, String category); //Constructor
//Method: getter and setter
//Also implement the abstract method in parent class.
//Sample description : “World Maps(title) all information is real.”

public class Reference extends ClassBook{

    private int getter;
    private int setter;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear, category);
    }
    public String reference() {
        return this.getTitle() + " all information is real ";
    }
}
