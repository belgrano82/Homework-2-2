
object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var increaseId = 0

    fun clear() {
        posts = emptyArray()
        increaseId = 0
    }

    fun add(post: Post): Post {
        increaseId++
        val newPost = post.copy(id = increaseId)
        posts += newPost

        return posts.last()
    }

    fun update(post: Post): Boolean {
        var result = false

        for (i in 0 until posts.size) {
            if (posts[i].id == post.id) {
                posts[i] = post.copy()
                result = true
            }
        }
        return result
    }

    private fun findById(id: Int): Post? {

        for (post in posts)
            if (post.id == id) return post


        return null
    }

    fun createComment(postId: Int, comment: Comment): Comment {

        findById(postId)
            ?: throw PostNotFoundException("Comment can not be added because post with id $postId does not exist")

        comments += comment

        return comments.last()

    }
}

class PostNotFoundException(message: String) : RuntimeException(message)





