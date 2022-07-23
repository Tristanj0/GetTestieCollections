package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    private HashSet<String> hash;
    @Before
    public void setUp(){
      this.hash = new HashSet<String>();
      hash.add("John");
      hash.add("Stacy");
      hash.add("Mike");
      hash.add("Kyle");
      hash.add("Elvis");
    }
    @Test
    public void hashSetTest1() {
        Assert.assertEquals(5, hash.size());
    }

    @Test
    public void hashSetTest_Remove() {
        hash.remove("Stacy");
        Assert.assertEquals(4, hash.size());
        Assert.assertEquals(false, hash.contains("Stacy"));
    }

    @Test
    public void hashSetTest_Duplicate() {
        hash.add("Stacy");
        hash.add("Stacy");
        hash.add("Stacy");
        hash.add("Stacy");
        hash.add("Stacy");
        String[] hashToArr = hash.toArray(new String[hash.size()]);
        Assert.assertEquals(false, hash.contains(hashToArr));
    }


}
