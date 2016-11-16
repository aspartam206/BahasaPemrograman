package com.wicaku;
import java.util.*;
/**
 *
 * @author ame
 */
public class LLDemos {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("Item 1");
        list.add("Item 2");
        list.add("String 1");
        System.out.println("Isi LinkedList adalah :" + list);
        
        list.addFirst("Masuk Jadi Urutan Pertama");
        list.addLast("Masuk jadi urutan terakhir");
        System.out.println("Isi LinkedList sekarang :" + list);
        
        LinkedList<Person> persons = new LinkedList<Person>();
        
        persons.add(new Person("Mochammad Rizki Wicaksono","Laki-Laki",20));
        persons.add(new Person("Muhammad Fahmi Zamroni","Laki-Laki",21));
        
        System.out.println("");
        String name;
        String gender;
        int age;
        gender = persons.get(0).getGender();
        name = persons.get(0).getName();
        age = persons.get(0).getAge();
        System.out.println(name +" "+
                gender +" " +
                age);
        
        gender = persons.get(1).getGender();
        name = persons.get(1).getName();
        age = persons.get(1).getAge();
        System.out.println(name +" "+
                gender +" " +
                age);
    }
}
