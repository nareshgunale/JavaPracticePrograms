package Collections.Comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employeee> {
    public int compare(Employeee e1,Employeee e2){
        return e1.getSalary().compareTo(e2.getSalary());

    }
}
