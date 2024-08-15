package JavaConcepts.SortingObjects.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Use Comparator when:
    //    You need multiple sorting orders for the same type of object.
    //    You cannot modify the class, or it does not make sense to define a natural order within the class.
    //    You want to keep the sorting logic separate from the class itself.
public class ComparatorExample {
    public static void main(String args[]){

        sortByAgeAsc();
        sortByAgeDesc();
        sortByNameWithNullsFirst();

    }

    //Example 1: Comparator to Sort by Age
    public static void sortByAgeAsc(){

        List<Person> list = new ArrayList<>();
        list.add(new Person("p1", 20));
        list.add(new Person("p2", 19));
        list.add(new Person("p3", 25));

        Comparator<Person> byAgeByAscending = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        //lambda expression:
        //Comparator<Person> byAge = (Person p1, Person p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Collections.sort(list, byAgeByAscending);
        System.out.println("Asc : " + list);
    }

    public static void sortByAgeDesc(){

        List<Person> list = new ArrayList<>();
        list.add(new Person("p1", 20));
        list.add(new Person("p2", 19));
        list.add(new Person("p3", 25));

        Comparator<Person> byAgeByDesc = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        };

        //lambda expression:
        //Comparator<Person> byAge = (Person p1, Person p2) -> Integer.compare(p2.getAge(), p3.getAge());
        Collections.sort(list, byAgeByDesc);
        System.out.println("Desc: " + list);
    }

    public static void sortByNameWithNullsFirst(){
        List<Person> people = new ArrayList<>();
        people.add(new Person(null, 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by name, nulls first
        Comparator<Person> byNameWithNullsFirst = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getName() == null && p2.getName() == null) {
                    return 0;
                }
                if (p1.getName() == null) {
                    return -1;
                }
                if (p2.getName() == null) {
                    return 1;
                }
                return p1.getName().compareTo(p2.getName());
            }
        };

        // Comparator<Person> byNameWithNullsFirst = Comparator.comparing(Person::getName, Comparator.nullsFirst(String::compareTo));

        Collections.sort(people, byNameWithNullsFirst);

        System.out.println("sort By Name With Nulls First : " + people); // Output: [null (30), Bob (25), Charlie (35)]
    }

}
