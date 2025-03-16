package LibraryManagement.Init;

import LibraryManagement.Person;

public class InitPerson {

    public static Person[] initPersons() {
        Person person1 = new Person("P001", "John", "Doe", 'M', "123 Elm Street", "1234567890", "john.doe@example.com");
        Person person2 = new Person("P002", "Jane", "Smith", 'F', "456 Oak Avenue", "0987654321", "jane.smith@example.com");
        Person person3 = new Person("P003", "Robert", "Johnson", 'M', "789 Pine Road", "1122334455", "robert.johnson@example.com");
        Person person4 = new Person("P004", "Emily", "Davis", 'F', "321 Maple Drive", "2233445566", "emily.davis@example.com");
        Person person5 = new Person("P005", "Michael", "Brown", 'M', "654 Cedar Lane", "3344556677", "michael.brown@example.com");
        Person person6 = new Person("P006", "Sarah", "Wilson", 'F', "987 Spruce Way", "4455667788", "sarah.wilson@example.com");
        Person person7 = new Person("P007", "David", "Lee", 'M', "741 Birch Court", "5566778899", "david.lee@example.com");
        Person person8 = new Person("P008", "Laura", "White", 'F', "852 Walnut Circle", "6677889900", "laura.white@example.com");
        Person person9 = new Person("P009", "James", "Harris", 'M', "963 Chestnut Blvd", "7788990011", "james.harris@example.com");
        Person person10 = new Person("P010", "Olivia", "Martinez", 'F', "159 Willow Parkway", "8899001122", "olivia.martinez@example.com");

        return new Person[]{
                person1, person2, person3, person4, person5, person6, person7, person8, person9, person10
        };
    }
}
