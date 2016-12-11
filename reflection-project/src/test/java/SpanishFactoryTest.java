import com.lakshay.reflection.SpanishFactory;
import com.lakshay.reflection.school.JuanSchool;
import junit.framework.TestCase;

/**
 * Created by lakshay suri on 11/12/16.
 */
public class SpanishFactoryTest extends TestCase{

    private SpanishFactory spanishFactory;

    protected void setUp() throws Exception {
        super.setUp();
        spanishFactory = new SpanishFactory();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Tests that a Juan School is built
     */
    public void testBuildJuanSchool() {
        JuanSchool juanSchool = (JuanSchool) spanishFactory
                .build(JuanSchool.class);
        assertNotNull(juanSchool.getAdmin1());
        assertNotNull(juanSchool.getPlayground1());
        assertNotNull(juanSchool.getTheatre1());
        assertNotNull(juanSchool.getTheatre2());
    }
}
