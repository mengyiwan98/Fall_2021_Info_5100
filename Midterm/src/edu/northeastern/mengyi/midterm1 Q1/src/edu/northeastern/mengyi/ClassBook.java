package edu.northeastern.mengyi;

public abstract class ClassBook {
        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public String getPublishYear() {
            return publishYear;
        }

        public String getCategory() {
            return category;
        }

        private String title;
        private double price;
        private String publishYear;
        private String category;

        public ClassBook(String title, double price, String publishYear) {
            this.title = title;
            this.price = price;
            this.publishYear = publishYear;

        }

        @Override
        public String toString() {
            return "title = " + this.title + "price = " + this.price + "publishYear = " + this.publishYear;
        }

        public abstract String description();
}
