package builder;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void testBuilding() {
        User user = User.builder()
                .name("Viha")
                .age(19)
                .gender("devo4ka")
                .height(158)
                .race("american girl")
                .occupation("sleeping")
                .occupation("eating")
                .build();

        assertEquals("Viha", user.getName());
        assertEquals(19, user.getAge());
        assertEquals("devo4ka", user.getGender());
        assertEquals(158, user.getHeight());
        assertEquals("american girl", user.getRace());
        assertArrayEquals(new String[] {"sleeping", "eating"}, user.getOccupations().toArray(new String[0]));
    }
}
