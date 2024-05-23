package lap09.exs0202;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName( String name);
    Student searchByLastName( String lastname);
    Student searchByNumber( String phone);
    Student deleteByNumber(String phone);
}
