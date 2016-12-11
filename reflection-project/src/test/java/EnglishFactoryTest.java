import com.lakshay.reflection.EnglishFactory;
import com.lakshay.reflection.school.BritishSchool;
import com.lakshay.reflection.school.RyanSchool;
import junit.framework.TestCase;

/**
 * Created by lakshay on 11/12/16.
 */
public class EnglishFactoryTest extends TestCase {

    private EnglishFactory englishFactory;

    protected void setUp() throws Exception {
        super.setUp();
        englishFactory = new EnglishFactory();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Tests that a British School is built
     */
    public void testBuildBritishSchool() {
        BritishSchool britishSchool = (BritishSchool) englishFactory
                .build(BritishSchool.class);
        assertNotNull(britishSchool.getAdmin1());
        assertNotNull(britishSchool.getPlayground1());
        assertNotNull(britishSchool.getTheatre());
    }

    /**
     * Tests that a Ryan School is built
     */
    public void testBuildRyanSchool() {
        RyanSchool ryanSchool = (RyanSchool) englishFactory
                .build(RyanSchool.class);
        assertNotNull(ryanSchool.getAdmin1());
        assertNotNull(ryanSchool.getAdmin2());
        assertNotNull(ryanSchool.getPlayground1());
        assertNotNull(ryanSchool.getPlayground2());
        assertNotNull(ryanSchool.getTheatre());
    }
}
