

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import checkarray.Checkarray;

/**
 *
 * @author Adison
 */
public class Checkarray1 {
    
    public Checkarray1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

      @Test
    public void testSortedAscArray() {
        int[] array = {2,3,4,5,6};
        boolean Sorted = Checkarray.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testSortedDescArray() {
        int[] array = {6,5,4,3,2};
        boolean Sorted = Checkarray.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testUnsortedArray() {
        int[] array = {6,3,5,4,2};
        boolean Sorted = Checkarray.arrSort(array);
        assertFalse(Sorted);
    }

    @Test
    public void testEmpArray() {
        int[] array = {};
        boolean Sorted = Checkarray.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testSnglEleArray() {
        int[] array = {1};
        boolean Sorted = Checkarray.arrSort(array);
        assertTrue(Sorted);
    }
}


