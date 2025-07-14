package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 12
class Animal12 {
    protected String species;

    public Animal12(String species) {
        this.species = species;
    }
}

class Bird12 extends Animal12 {
    private String color;

    public Bird12(String species, String color) {
        // TODO: super를 사용하여 Animal의 species 필드를 초기화하세요.
        super(species);
        this.color = color;
    }

    public void display() {
        System.out.println("Species: " + species + ", Color: " + color);
    }
}

class Main12 {
    public static void main(String[] args) {
        Bird12 bird = new Bird12("Parrot", "Green");
        bird.display(); // Species: Parrot, Color: Green 출력
    }
} 