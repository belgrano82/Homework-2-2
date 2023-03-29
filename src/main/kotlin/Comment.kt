data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Attachments?,
    val parentStack: ArrayList<Int>?,
    val thread: Thread?
)

data class Thread(val count: Int, val items: ArrayList<Comments>, val canPost: Boolean, val showReplyButton: Boolean, val groupsCanPost: Boolean)

