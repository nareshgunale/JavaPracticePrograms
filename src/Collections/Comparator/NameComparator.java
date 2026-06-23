package Collections.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employeee> {
    @Override
    public int compare(Employeee e1,Employeee e2){
        return -e1.getName().compareTo(e2.getName());

    }

}
