class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        
        if (person1.name == null || person2.name == null) {
            
            return 0;
            
        }
        
        int result = person1.name.compareTo(person2.name);

        return result == 0 ? Integer.compare(person1.age, person2.age) : result;
        
    }
    
}


class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {

        int personComparatorResult = new PersonComparator().compare(employee1, employee2);

        return personComparatorResult == 0 ?
        
                Double.compare(employee1.getSalary(), employee2.getSalary())
                
                : personComparatorResult;
    }
    
}

class DeveloperComparator implements Comparator<Developer> {
    @Override
    public int compare(Developer developer1, Developer developer2) {

        int personComparatorResult = new PersonComparator().compare(developer1, developer2);

        return personComparatorResult == 0 ?
        
                developer1.getLevel().compareTo(developer2.getLevel())
                
                : personComparatorResult;
    }
    
}

public class Utility {
    
    public static <T extends Person> void sortPeople(T[] people, Comparator<? super T> comparator) {
        
        Arrays.sort(people, comparator);
        
    }
}
