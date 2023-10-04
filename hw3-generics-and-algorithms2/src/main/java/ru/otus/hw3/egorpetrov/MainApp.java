package ru.otus.hw3.egorpetrov;

public class MainApp {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box();
        Box<Apple> boxOfApples = new Box();
        Box<Fruit> universalBox = new Box<>();
        Box<Fruit> emptyBox = new Box<>();

        Orange orange1 = new Orange(5);
        Orange orange2= new Orange(4);

        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        Apple apple3 = new Apple(3);
        Apple apple4 = new Apple(4);
        Apple apple5 = new Apple(5);

        boxOfOranges.addFruit(orange1);
        boxOfOranges.addFruit(orange2);
        System.out.println("boxOfOranges = " + boxOfOranges.getFruits());

        boxOfApples.addFruit(apple1);
        boxOfApples.addFruit(apple2);
        boxOfApples.addFruit(apple3);
        boxOfApples.addFruit(apple4);
        boxOfApples.addFruit(apple5);
        System.out.println("boxOfApples = " + boxOfApples.getFruits());

        universalBox.addFruit(apple1);
        universalBox.addFruit(apple2);
        universalBox.addFruit(apple3);
        universalBox.addFruit(orange1);
        universalBox.addFruit(orange2);
        System.out.println("universalBox = " + universalBox.getFruits());

        System.out.println("Weight of boxOfApples = " + boxOfApples.boxWeight());
        System.out.println("Weight of boxOfOranges = " + boxOfOranges.boxWeight());
        System.out.println("Weight of universalBox = " + universalBox.boxWeight());

        System.out.println(boxOfApples.compareBoxes(universalBox));

        System.out.println("==================================");

        boxOfApples.putFruitsToAnotherBox(emptyBox, 3);

        System.out.println("boxOfApples = " + boxOfApples.getFruits());
        System.out.println("emptyBox = " + emptyBox.getFruits());
    }
}
