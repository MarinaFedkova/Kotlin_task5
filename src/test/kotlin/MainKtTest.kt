import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun add() {
        val post = Post(id = 0)
        val expected = 1
        WallService.add(post)
        val result = WallService.add(post).id

        assertEquals(expected, result)
    }

    @Test
    fun update_true() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 11, text = "newText")
        WallService.add(post1)

        val result = WallService.update(post2)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 12, text = "newText")
        WallService.add(post1)

        val result = WallService.update(post2)

        assertFalse(result)
    }
}

