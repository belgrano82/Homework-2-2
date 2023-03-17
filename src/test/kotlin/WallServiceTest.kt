import WallService.add
import WallService.update
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTests() {
        WallService.clear()
    }

    @Test
    fun addNewPostTest() {

        val testPost = Post(0, 111, 222, "New post",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))

        val result = add(post = testPost)


        assertEquals( Post(1, 111, 222, "New post",
            Likes(0, 0, true, true),
            Comments(0, true, true, true, true)), result)
    }

    @Test
    fun updateIfTrue() {
//        val posts = arrayOf(Post(5, 111, 222, "New post1",
//            Likes(0, 0, true, true),
//            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true)), Post(10, 112, 223, "New post2",
//            Likes(0, 0, true, true),
//            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true)))
        val testPost1 = Post(0, 111, 222, "New post1",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        val testPost2 = Post(0, 112, 223, "New post2",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        add(post = testPost1)
        add(post = testPost2)
        val testPostUpdated = Post(2, 111_000, 222_000, "New post Updated",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        val result = update(post = testPostUpdated)

        assertEquals(true, result)

    }

    @Test
    fun updateIfFalse(){
        val testPost1 = Post(0, 111, 222, "New post1",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        val testPost2 = Post(0, 112, 223, "New post2",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        add(post = testPost1)
        add(post = testPost2)
        val testPostUpdated = Post(3, 111_000, 222_000, "New post Updated",
            Likes(0, 0, true, true),
            Comments(0, canPost = true, groupsCanPost = true, canClose = true, canOpen = true))
        val result = update(post = testPostUpdated)

        assertEquals(false, result)

    }
}