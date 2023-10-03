package ru.otus.hw3.egorpetrov;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> list = new ArrayList<>();

    public void addFruit (T fruit) {
        list.add(fruit);
    }

    public List<T> getFruits (){
        return list;
    }


    public int boxWeight() {
        int result = 0;
        for (T fruit : list){
            result += fruit.getWeight();
        }
        return result;
    }

    public boolean compareBoxes (Box box){
        if (box == null)
            return false;

        return this.boxWeight() == box.boxWeight();
    }

    public void putFruitsToAnotherBox (Box box, int number) {
        int i = this.list.size() - 1;
        while (number > 0){
            box.addFruit(this.list.get(i));
            number--;
            i--;
        }

//        for (int i = 0; i < number; i++){
//            box.addFruit(list.get(i));
//        }
        this.list.removeAll(box.getFruits());

    }
}
