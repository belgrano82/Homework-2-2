object WallService {
    var posts = emptyArray<Post>()
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

}
