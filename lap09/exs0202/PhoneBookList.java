package lap09.exs0202;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBookList implements PhoneBook{
    ArrayList< Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }
    @Override
    public void addPerson( Student p) {
        for( Student student: phoneBook) {
            if( student.getName().equals(p.getName())){
                return;
            }
        }
        phoneBook.add(p);
    }
    @Override
    public Student searchByName( String name) {
        for( Student student : phoneBook) {
            if( student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByLastName( String name) {
        for( Student student : phoneBook) {
            if( student.getLastname().equals(name)){
                return student;
            }
        }
    return null;
    }
    @Override
    public Student searchByNumber( String phone) {
        for( Student student : phoneBook) {
            if( student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student deleteByNumber(String phone) {
        for ( int i = 0; i< phoneBook.size(); i++) {
           Student student = phoneBook.get(i);
           if( student.getPhone().equals(phone)) {
               phoneBook.remove(i);
               return student;
           }
        }
//        for(Iterator<Student> iterator = phoneBook.iterator(); iterator.hasNext()) {
//            Student student = iterator.next();
//            if( student.getPhone().equals(phone)) {
//                iterator.remove();
//                return student;
//            }
//        }
        return null;
    }
}
