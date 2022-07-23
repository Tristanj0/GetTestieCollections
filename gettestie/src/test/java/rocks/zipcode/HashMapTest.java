package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    private HashMap<Integer, Person> hashAdd;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;

    @Before
    public void setUp() {
       this.hashAdd = new HashMap<Integer, Person>();
       person1 = new Person("Gary", 2000);
       hashAdd.put(person1.getYearOfBirth(),person1);

       person2 = new Person("Gary T", 2001);
       hashAdd.put(person2.getYearOfBirth(), person2);

       person3 = new Person("Gary J", 2005);
       hashAdd.put(person3.getYearOfBirth(), person3);

    }

    @Test
    public void HashMapTest() {
        Assert.assertEquals(false, hashAdd.isEmpty());
    }

    @Test
    public void HashMapTest1() {
        Assert.assertEquals(person3,hashAdd.get(2005));
    }
}
