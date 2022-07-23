package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    private ArrayList<Person> arrList;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;

    @Before
    public void setUp() {
        this.arrList = new ArrayList<Person>();
        person1 = new Person("Harry", 1990);
        person2 = new Person("Kris", 1900);
        person3 = new Person("Sam", 1995);
        person4 = new Person("Lisa", 1997);
        person5 = new Person("Beth", 1992);
    }

    @Test
    public void arrayListTest() {
//        Assert.assertEquals(5, arrList.size());
    }


    @Test
    public void arrayListTest_Remove() {
        arrList.remove(person2);
        Assert.assertEquals(false, arrList.contains(person2));
    }

}
