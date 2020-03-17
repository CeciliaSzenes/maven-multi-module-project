import com.google.common.collect.Lists;

import java.util.List;


public class MyApi {
    public static void main(String[] args) {

        List<Person> ourList= Lists.newArrayList();
        Person tom=new Person();
        Person maarten=new Person();
        ourList.add(tom);
        ourList.add(maarten);
        System.out.println(ourList);


    }
}
