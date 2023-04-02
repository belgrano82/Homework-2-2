data class Note(
    var id: Int,
    val ownerId: Int,
    var title: String,
    var text: String,
    val date: Int = 0,
    var comments: Int = 0,
    var readComments: Int = 0,
    val viewURL: String = "www",
    val privacyView: String = "yes",
    var canComment: Boolean = true,
    val textWiki: String = "no"
)