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

        val testPost = Post(
            0,
            111,
            222,
            111,
            1679447042,
            "New post",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null

        )


        val result = add(post = testPost)


        assertEquals(
            Post(1,
                111,
                222,
                111,
                1679447042,
                "New post",
                333,
                444,
                true,
                null,
                Copyright(5, "www", "String", "String"),
                Likes(0, 0, true, true),
                Reposts(0, false),
                Views(0),
                "string",
                postSource = null,
                null,
                null,
                copyHistory = ArrayList<Reposts>(),
                null,
                null,
                null,
                true,
                true,
                true,
                Donut(true, 10, placeHolder = null, true, "string"),
                100,
                attachments = null
            ), result
        )
    }

    @Test
    fun updateIfTrue() {

        val testPost1 = Post(
            0,
            111,
            222,
            111,
            1679447042,
            "New post1",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        val testPost2 = Post(
            0,
            111,
            222,
            111,
            1679447042,
            "New post2",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        add(post = testPost1)
        add(post = testPost2)
        val testPostUpdated = Post(
            2,
            111,
            222,
            111,
            1679447042,
            "New post updated",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        val result = update(post = testPostUpdated)


        assertTrue("true", result)

    }

    @Test
    fun updateIfFalse() {
        val testPost1 = Post(
            0,
            111,
            222,
            111,
            1679447042,
            "New post1",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        val testPost2 = Post(
            0,
            111,
            222,
            111,
            1679447042,
            "New post2",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        add(post = testPost1)
        add(post = testPost2)
        val testPostUpdated = Post(
            3,
            111,
            222,
            111,
            1679447042,
            "New post updated",
            333,
            444,
            true,
            null,
            Copyright(5, "www", "String", "String"),
            Likes(0, 0, true, true),
            Reposts(0, false),
            Views(0),
            "string",
            postSource = null,
            null,
            null,
            copyHistory = ArrayList<Reposts>(),
            null,
            null,
            null,
            true,
            true,
            true,
            Donut(true, 10, placeHolder = null, true, "string"),
            100,
            attachments = null
        )
        val result = update(post = testPostUpdated)

        assertFalse("false", result)

    }
}