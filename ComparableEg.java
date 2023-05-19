import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Emp implements Comparable<Emp>{
    private String name;
    private String phone;
    private int empid;

    @Override
    public int compareTo(Emp o) {
        System.out.println(this.empid - o.empid+"mm");
        return this.empid - o
        .empid;
    }

    public Emp(String name, String phone, int empid){
        this.name = name;
        this.phone = phone;
        this.empid = empid;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public int getEmpid(){
        return empid;
    }

    public String toString(){
        return "Emp{ "+
                "name= "+name+" "+
                ", phone= "+phone+" "+
                ", empid= "+empid+
                "}";
    }
}

public class ComparableEg {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>(); // Integer is a class
        // marks.add(12);
        // marks.add(34);
        // marks.add(6);

        // System.out.println(marks);

        // Collections.sort(marks);

        // System.out.println(marks);

        emps.add(new Emp("Prachi", "987456123", 12));
        emps.add(new Emp("Sanika", "888556232", 1));
        emps.add(new Emp("Sonal", "777888999", 15));

        Collections.sort(emps);
        System.out.println(emps);
    }
}
