import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Tools.class})
public class ToolsTest {


    @Before
    public void setUp() {
    }

    @Test
    public void partitionManuelleTest() throws Exception {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<List<Integer>> result = Tools.partitionManuelle(liste, 3);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.toString(), "[[1, 2, 3], [4, 5, 6], [7]]");
    }

    @Test
    public void partitionTest() throws Exception {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> result = Tools.partition(liste, 2);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.toString(), "[[1, 2], [3, 4], [5, 6], [7]]");
    }

    @Test
    public void testBothFunctionsEqualities() throws Exception {
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<List<Integer>> result1 = Tools.partition(liste, 1);
        List<List<Integer>> result2 = Tools.partitionManuelle(liste, 1);
        Assert.assertNotNull(result1);
        Assert.assertEquals(result1.toString(), result2.toString());
        Assert.assertEquals(result1.toString(), "[[1], [2], [3], [4], [5], [6], [7]]");

    }
}
