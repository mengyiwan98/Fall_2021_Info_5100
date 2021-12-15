package edu.northeastern.mengyi;

public class Roomba {
    int[][] roomba;
    Main.Direction direction;
    int x;
    int y;

    public boolean Roomba(int[][] roomba) {
        this.roomba = roomba;
        direction = Main.Direction.DOWN;
        x = 0;
        y = 0;

        public boolean move() {
            int newX = x;
            int newY = y;
            if (this.direction == Main.Direction.DOWN) {
                newX++;
            } else if (this.direction == Main.Direction.UP) {
                newX--;
            } else if (this.direction == Main.Direction.LEFT) {
                newY--;
            } else {
                newY++;
            }

            if (newX < 0 || newY < 0 || newX >= Room.roomdata.length || newY >= Room.roomdata[0].length) {
                return false;
            }

            if (Room.roomdata[newX][newY] == -1) {
                return false;
            }

            this.x = newX;
            this.y = newY;
            return true;
        }
        ;

        void turnLeft() {
            if (this.direction == Main.Direction.UP) {
                this.direction = Main.Direction.LEFT;
            } else if (this.direction == Main.Direction.DOWN) {
                this.direction = Main.Direction.RIGHT;
            } else if (this.direction == Main.Direction.LEFT) {
                this.direction = Main.Direction.DOWN;
            } else {
                this.direction = Main.Direction.UP;
            }
        }

        void turnRight() {
            if (this.direction == Main.Direction.UP) {
                this.direction = Main.Direction.RIGHT;
            } else if (this.direction == Main.Direction.DOWN) {
                this.direction = Main.Direction.LEFT;
            } else if (this.direction == Main.Direction.LEFT) {
                this.direction = Main.Direction.UP;
            } else {
                this.direction = Main.Direction.DOWN;
            }
        };
        void clean() {
            this.Room.roomdata[x][y] = 1;
        };
    }
}












