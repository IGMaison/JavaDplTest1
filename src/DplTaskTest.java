import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DplTaskTest {

    @Test
    public void getResult() {

        List<Integer> result1 = DplTask.getResult("dddossooo");
        List<Integer> expectedResult1 = new ArrayList<>(Arrays.asList(-3, 81, 81, 81));


        List<Integer> result2 = DplTask.getResult("iiisdoso");
        List<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(8, 64));

        assertEquals(expectedResult1, result1);
        assertEquals(expectedResult2, result2);
        assertEquals(new ArrayList<>(), DplTask.getResult(""));


    }

    @Test(expected = NullPointerException.class)
    public void getResultExeption() throws Exception {
        assertNull(DplTask.getResult("iii2sdoso"));
    }
}

