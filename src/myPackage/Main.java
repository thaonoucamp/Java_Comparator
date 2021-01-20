package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("a", 1));
        list.add(new Person("b", 2));
        list.add(new Person("e", 4));
        list.add(new Person("c", 3));
        list.add(new Person("f", 5));

        for (Person i :
                list) {
            System.out.println(i.getName() + i.getAge());
        }
        System.out.println("---");

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Person p :
                list) {
            System.out.println(p.getName() + p.getAge());
        }
    }
}
//class My implements Comparator<Person> {
//    @Override
//    public int compare(Person o1, Person o2) {
//        if (o1.getAge() > o2.getAge()) {
//            return 1;
//        } else if (o1.getAge() < o2.getAge()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//}

// so sanh Obj qua Anonymous class;

// Tiet kiem time tao Class moi;

// Su dung nhieu trong thuc te;

