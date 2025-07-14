package QUIZ.Quiz05.quiz0505;

import java.util.Arrays;

public class OOPQuiz5_5 {
    // Quiz 5-5 문제 1
    static class Problem1 {
        static class Vehicle {
            int registrationNumber;
            String owner;
            // TODO: 생성자 작성
            public Vehicle(int registrationNumber, String owner) {
                this.registrationNumber = registrationNumber;
                this.owner = owner;
            }
        }
        static class Car extends Vehicle {
            int numberOfDoors;
            // TODO: 생성자 작성
            public Car(int registrationNumber, String owner, int numberOfDoors) {
                super(registrationNumber, owner);
                this.numberOfDoors = numberOfDoors;
            }
        }
        static void run() {
            // TODO: Car 객체 생성 및 출력
            Vehicle vehicle = new Vehicle(1, "부모");
            Car car = new Car(2, "자식", 3);
            System.out.println("1번 정답");
            System.out.printf("부모 객체 : %d번, 나는 %s이다\n",  car.registrationNumber, vehicle.owner);
            System.out.printf("부모 객체 : %d번, 나는 %s이고 추가로 문 %d개 가진다\n",  car.registrationNumber, car.owner, car.numberOfDoors);
            System.out.println();
        }
    }

    // Quiz 5-5 문제 2
    static class Problem2 {
        static class Shape {
            // TODO: draw 메서드 작성
            void draw() {
                System.out.println("도형을 그립니다.");
            }
        }
        static class Rectangle extends Shape {
            // TODO: draw 메서드 오버라이딩
            @Override
            void draw() {
                System.out.println("사각형을 그립니다.");
            }
        }
        static void run() {
            // TODO: Rectangle 객체 생성 및 메서드 호출
            System.out.println("2번 정답");
            Rectangle rect = new Rectangle();
            rect.draw();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 3
    static class Problem3 {
        static class Shape {
            void draw() {
                System.out.println("도형을 그립니다.");
            }
        }
        static class Rectangle extends Shape {
            @Override
            void draw() {
                System.out.println("사각형을 그립니다.");
            }
        }
        static class Circle extends Shape {
            @Override
            void draw() {
                System.out.println("원을 그립니다.");
            }
        }
        static void run() {
            // TODO: Shape 배열 생성 및 다양한 객체 추가
            // TODO: 모든 객체의 draw 메서드 호출
            System.out.println("3번 정답");
            Shape[] shapes = { new Rectangle(), new Circle(), new Rectangle() };
            for (Shape s : shapes) {
                s.draw();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 4
    static class Problem4 {
        static abstract class Shape {
            // TODO: abstract draw 메서드 정의
            abstract void draw();
        }
        static class Rectangle extends Shape {
            // TODO: draw 메서드 구현
            @Override
            void draw() {
                System.out.println("사각형을 그립니다.");
            }
        }
        static class Oval extends Shape {
            // TODO: draw 메서드 구현
            @Override
            void draw() {
                System.out.println("타원을 그립니다.");
            }
        }
        static void run() {
            // TODO: Rectangle 및 Oval 객체 생성 및 draw 호출
            System.out.println("4번 정답");
            Shape rect = new Rectangle();
            Shape oval = new Oval();
            rect.draw();
            oval.draw();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 5
    static class Problem5 {
        static class Vehicle {}
        static class Car extends Vehicle {
            String model = "승용차";
        }
        static class Truck extends Vehicle {
            String model = "트럭";
        }
        static void run() {
            System.out.println("5번 정답");
            // TODO: Vehicle 배열 생성 및 객체 추가
            // TODO: instanceof를 사용하여 타입 확인 후 출력
            Vehicle[] vehicles = { new Car(), new Truck(), new Car() };
            for (Vehicle v : vehicles) {
                if (v instanceof Car) {
                    System.out.println("Car 객체: " + ((Car)v).model);
                } else if (v instanceof Truck) {
                    System.out.println("Truck 객체: " + ((Truck)v).model);
                }
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 6
    static class Problem6 {
        static class Vehicle {
            // TODO: final 메서드 작성
            final void printRegistration() {
                System.out.println("등록 정보를 출력");
            }
        }
        static class Car extends Vehicle {
            // TODO: 메서드 오버라이드 시도
            // @Override
            // void printRegistration() {
            //     System.out.println("Car 등록 정보를 출력");
            // }
        }
        static void run() {
            System.out.println("6번 정답");
            // TODO: Car 객체 생성 및 메서드 호출
            Car car = new Car();
            car.printRegistration();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 7
    static class Problem7 {
        static class Animal {
            String name;
            void makeSound() {
                System.out.println("동물 소리");
            }
        }
        static class Dog extends Animal {
            @Override
            void makeSound() {
                System.out.println("멍멍");
            }
        }
        static class Cat extends Animal {
            @Override
            void makeSound() {
                System.out.println("야옹");
            }
        }
        static void run() {
            System.out.println("7번 정답");
            // TODO: Animal, Dog, Cat 객체 생성 및 makeSound 호출
            Animal a = new Animal();
            Dog d = new Dog();
            Cat c = new Cat();
            a.makeSound();
            d.makeSound();
            c.makeSound();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 8
    static class Problem8 {
        static abstract class Animal {
            // TODO: abstract void makeSound() 메서드 정의
            abstract void makeSound();
        }
        static class Dog extends Animal {
            @Override
            void makeSound() {
                System.out.println("멍멍");
            }
        }
        static class Bird extends Animal {
            @Override
            void makeSound() {
                System.out.println("짹짹");
            }
        }
        static void run() {
            System.out.println("8번 정답");
            // TODO: Animal 배열 생성 및 객체 추가
            // TODO: 모든 객체의 makeSound 호출
            Animal[] animals = { new Dog(), new Bird(), new Dog() };
            for (Animal a : animals) {
                a.makeSound();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 9
    static class Problem9 {
        static class Shape implements Comparable<Shape> {
            int size;
            Shape(int size) {
                this.size = size;
            }
            @Override
            public int compareTo(Shape other) {
                return Integer.compare(this.size, other.size);
            }
        }
        static void run() {
            System.out.println("9번 정답");
            // TODO: Shape 배열 생성 및 객체 추가
            // TODO: 크기 순으로 정렬 후 출력
            Shape[] arr = { new Shape(5), new Shape(2), new Shape(8) };
            Arrays.sort(arr);
            for (Shape s : arr) {
                System.out.println("Shape size = "  + s.size);
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 10
    static class Problem10 {
        static abstract class Vehicle {
            // TODO: abstract void drive() 메서드 정의
            abstract void drive();
        }
        static class Car extends Vehicle {
            @Override
            void drive() {
                System.out.println("자동차 운전");
            }
        }
        static class Bike extends Vehicle {
            @Override
            void drive() {
                System.out.println("자전거 운전");
            }
        }
        static void run() {
            System.out.println("10번 정답");
            // TODO: Vehicle 배열 생성 및 객체 추가
            // TODO: 모든 객체의 drive 호출
            Vehicle[] arr = { new Car(), new Bike() };
            for (Vehicle v : arr) {
                v.drive();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 11
    static class Problem11 {
        static abstract class Shape {
            // TODO: abstract calculateArea 메서드 정의
            abstract double calculateArea();
        }
        static class Rectangle extends Shape {
            double width;
            double height
                    ;
            // TODO: 생성자와 calculateArea 메서드 구현
            Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }
            @Override
            double calculateArea() {
                return width * height;
            }
        }
        static class Circle extends Shape {
            double radius;
            // TODO: 생성자와 calculateArea 메서드 구현
            Circle(double radius) {
                this.radius = radius;
            }
            @Override
            double calculateArea() {
                return Math.PI * radius * radius;
            }
        }
        static void run() {
            System.out.println("11번 정답");
            // TODO: Rectangle 및 Circle 객체 생성 및 면적 출력
            Rectangle rect = new Rectangle(3, 4);
            Circle circle = new Circle(2);
            System.out.println("사각형 넓이: " + rect.calculateArea());
            System.out.println("원 넓이: " + circle.calculateArea());
            System.out.println();
        }
    }

    // Quiz 5-5 문제 12
    static class Problem12 {
        static abstract class Shape {
            // TODO: abstract double calculateArea() 메서드 정의
            abstract double calculateArea();
        }
        static class Rectangle extends Shape {
            double width, height;
            Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }
            @Override
            double calculateArea() {
                return width * height;
            }
        }
        static class Triangle extends Shape {
            double base, height;
            Triangle(double base, double height) {
                this.base = base;
                this.height = height;
            }
            @Override
            double calculateArea() {
                return base * height / 2;
            }
        }
        static void run() {
            System.out.println("12번 정답");
            // TODO: Shape 배열 생성 및 도형 추가
            // TODO: 전체 면적 합산 및 출력
            Shape[] arr = { new Rectangle(3, 4), new Triangle(5, 2), new Rectangle(2, 2) };
            double sum = 0;
            for (Shape s : arr) {
                sum += s.calculateArea();
            }
            System.out.println("전체 면적: " + sum);
            System.out.println();
        }
    }

    // Quiz 5-5 문제 13
    static class Problem13 {
        static abstract class Animal {
            String name;
            // TODO: 생성자 및 move 메서드 정의
            Animal(String name) {
                this.name = name;
            }
            abstract void move();
        }
        static class Bird extends Animal {
            Bird(String name) {
                super(name);
            }
            @Override
            void move() {
                System.out.println(name + "는 하늘을 납니다.");
            }
        }
        static class Fish extends Animal {
            Fish(String name) {
                super(name);
            }
            @Override
            void move() { System.out.println(name + "는 물속을 헤엄칩니다."); }
        }
        static void run() {
            System.out.println("13번 정답");
            // TODO: Bird 및 Fish 객체 생성 및 move 호출
            Animal bird = new Bird("참새");
            Animal fish = new Fish("참치");
            bird.move();
            fish.move();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 14
    static class Problem14 {
        static abstract class Animal {
            // TODO: abstract void makeSound() 메서드 정의
            abstract void makeSound();
        }
        static class Dog extends Animal {
            @Override
            void makeSound() { System.out.println("멍멍"); }
        }
        static class Cat extends Animal {
            @Override
            void makeSound() { System.out.println("야옹"); }
        }
        static void run() {
            System.out.println("14번 정답");
            // TODO: Animal 배열 생성 및 객체 추가
            // TODO: 모든 객체의 makeSound 호출
            Animal[] arr = { new Dog(), new Cat(), new Dog() };
            for (Animal a : arr) {
                a.makeSound();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 15
    static class Problem15 {
        static abstract class Vehicle {
            // TODO: abstract void drive() 메서드 정의
            abstract void drive();
        }
        static class Car extends Vehicle {
            @Override
            void drive() {
                System.out.println("자동차 운전");
            }
        }
        static class Truck extends Vehicle {
            @Override
            void drive() { System.out.println("트럭 운전"); }
        }
        static void run() {
            System.out.println("15번 정답");
            // TODO: Vehicle 배열 생성 및 객체 추가
            // TODO: 모든 객체의 drive 호출
            Vehicle[] arr = { new Car(), new Truck(), new Car() };
            for (Vehicle v : arr) {
                v.drive();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 16
    static class Problem16 {
        interface Drawable {
            // TODO: draw 메서드 선언
            void draw();
        }
        static class Rectangle implements Drawable {
            // TODO: draw 메서드 구현
            @Override
            public void draw() {
                System.out.println("사각형을 그립니다.");
            }
        }
        static class Circle implements Drawable {
            // TODO: draw 메서드 구현
            @Override
            public void draw() {
                System.out.println("원을 그립니다.");
            }
        }
        static void run() {
            System.out.println("16번 정답");
            // TODO: Drawable 배열 생성 및 draw 호출
            Drawable[] arr = { new Rectangle(), new Circle() };
            for (Drawable d : arr) {
                d.draw();
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 17
    static class Problem17 {
        static class Shape {}
        static class Rectangle extends Shape {}
        static class Circle extends Shape {}
        static void run() {
            System.out.println("17번 정답");
            // TODO: Shape 배열 생성 및 객체 추가
            // TODO: 패턴 매칭을 사용하여 타입 확인 후 출력
            Shape[] arr = { new Rectangle(), new Circle(), new Rectangle() };
            for (Shape s : arr) {
                if (s instanceof Rectangle) {
                    System.out.println("Rectangle 객체");
                } else if (s instanceof Circle) {
                    System.out.println("Circle 객체");
                }
            }
            System.out.println();
        }
    }

    // Quiz 5-5 문제 18
    static class Problem18 {
        // TODO: Vehicle 클래스 정의
        final static class Vehicle {}
        // static class Car extends Vehicle {}
        static void run() {
            System.out.println("18번 정답");
            System.out.println("final 클래스는 상속불가");
            System.out.println();
        }
    }

    // Quiz 5-5 문제 19
    static class Problem19 {
        static class Vehicle {
            // TODO: final 메서드 정의
            final void startEngine() {
                System.out.println("엔진 시동");
            }
        }
        // static class Car extends Vehicle {
        //      TODO: 메서드 오버라이드 시도
        //      @Override
        //      void startEngine() {
        //          System.out.println("Car 엔진 시동");
        //      }
        // }
        static void run() {
            System.out.println("19번 정답");
            Vehicle v = new Vehicle();
            v.startEngine();
            System.out.println();
        }
    }

    // Quiz 5-5 문제 20
    static class Problem20 {
        static abstract class Animal {
            // TODO: abstract eat 메서드 정의
            abstract void eat();
        }
        static class Dog extends Animal {
            @Override
            void eat() { System.out.println("개가 먹는다"); }
        }
        static class Fish extends Animal {
            @Override
            void eat() { System.out.println("물고기가 먹는다"); }
        }
        static void run() {
            System.out.println("20번 정답");
            // TODO: Animal 배열 생성 및 eat 호출
            Animal[] arr = { new Dog(), new Fish() };
            for (Animal a : arr) {
                a.eat();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Problem1.run();
        Problem2.run();
        Problem3.run();
        Problem4.run();
        Problem5.run();
        Problem6.run();
        Problem7.run();
        Problem8.run();
        Problem9.run();
        Problem10.run();
        Problem11.run();
        Problem12.run();
        Problem13.run();
        Problem14.run();
        Problem15.run();
        Problem16.run();
        Problem17.run();
        Problem18.run();
        Problem19.run();
        Problem20.run();
    }
} 