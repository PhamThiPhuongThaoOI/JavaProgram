package lap09.exs0202;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBookMap implements PhoneBook{
    HashMap<String,Student>phoneBook;
    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }
    @Override
    public void addPerson( Student s) {
       if( phoneBook.containsKey(s.getPhone())) {
           phoneBook.put(s.getPhone(),s);
       } else {
           phoneBook.put(s.getPhone(),s);
       }
    }
    @Override
    public Student searchByName( String name) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            Student student  = entry.getValue();
            if( student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByLastName( String lastname) {
        for( Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            Student student = entry.getValue();
            if(student.getName().equalsIgnoreCase(lastname)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student searchByNumber( String phone) {
        for( Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            Student student = entry.getValue();
            if( student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }
    @Override
    public Student deleteByNumber(String phone) {
        for (Iterator<Map.Entry<String, Student>> iterator = phoneBook.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, Student> entry = iterator.next();
            Student student = entry.getValue();
            if( student.getPhone().equals(phone)) {
                iterator.remove();
                return student;
            }
        }
        return null;
    }
}
