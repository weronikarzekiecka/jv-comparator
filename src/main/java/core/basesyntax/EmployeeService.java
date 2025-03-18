package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class EmployeeService {

    private Comparator<Employee> employeeComparator = new Comparator<>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int ageCompared = Integer.compare(o1.getAge(), o2.getAge());
            if (ageCompared != 0) {
                return ageCompared;
            }
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeeSet = new TreeSet<>(employeeComparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}