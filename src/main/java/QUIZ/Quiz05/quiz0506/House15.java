package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 15
class House15 {
    private int rooms;
    private String color;

    public House15 setRooms(int rooms) {
        this.rooms = rooms;
        return this; // TODO: this를 반환하여 메서드 체이닝 구현
    }

    public House15 setColor(String color) {
        this.color = color;
        return this; // TODO: this를 반환하여 메서드 체이닝 구현
    }

    public void display() {
        System.out.println("Rooms: " + rooms + ", Color: " + color);
    }

    public static void main(String[] args) {
        House15 house = new House15();
        house.setRooms(3).setColor("Blue").display();
        // Rooms: 3, Color: Blue 출력
    }
} 