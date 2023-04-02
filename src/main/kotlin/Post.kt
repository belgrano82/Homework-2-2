data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int?,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var postType: String,
    val postSource: PostSource?,
    val geo: Geo?,
    val signerId: Int?,
    val copyHistory: ArrayList<Reposts>,
    val canPin: Boolean?,
    val canDelete: Boolean?,
    val canEdit: Boolean?,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int,
    val attachments: ArrayList<Attachments>?

) {


}

data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

data class Copyright(val id: Int, val link: String, val name: String, val type: String)
data class Likes(var count: Int, val userLikes: Int, val canLike: Boolean, val canPublish: Boolean)
data class Reposts(var count: Int, val userReposted: Boolean)
data class Views(var count: Int)
class PostSource()
data class Geo(val type: String, val coordinates: String, val place: Place)
class Place()
data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeHolder: PlaceHolder?,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

class PlaceHolder()
