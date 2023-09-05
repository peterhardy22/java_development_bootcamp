public class Airline {
    
    Person[] people;

    public Airline(Person[] people) {
        this.people = new Person[11];
        for (int i = 0; i < this.people.length; i++) {
            this.people[i] = new Person(people[i]);
        }
    }


    public Person getPerson(int index) {
        Person copy = new Person(this.people[index]);
        return copy;
    }
}
