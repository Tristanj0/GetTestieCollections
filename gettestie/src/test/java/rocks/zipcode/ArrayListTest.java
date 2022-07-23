package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    private ArrayList<String> arrList;

    @Before
    public void setUp() {
        this.arrList = new ArrayList<String>();
        arrList.add("Harry");
        arrList.add("James");
        arrList.add("Bob");
        arrList.add("Kris");
        arrList.add("Lisa");
    }

    @Test
    public void arrayListTest() {
        Assert.assertEquals(5, arrList.size());
    }
}
