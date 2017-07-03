import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vaisakh on 02/07/17.
 */
class GroupAnagramsTest extends GroupAnagrams {

    @Test
    void anagrams() {

        GroupAnagrams ga = new GroupAnagrams();
        assertEquals(1,ga.anagrams(0,0, new String[]{"act, cat, tac"}));
    }

}