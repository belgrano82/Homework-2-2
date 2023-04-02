interface Attachments {
    val type: String

}

open class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachments
data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Sizes,
    val width: Int,
    val height: Int
)

data class Sizes(val type: String, val url: String, val width: Int, val height: Int)

open class AudioAttachment(override val type: String = "audio", val audio: Audio) : Attachments
data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHq: Boolean
)

open class LinkAttachment(override val type: String = "link", val link: Link) : Attachments
data class Link(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo,
    val previewUrl: String
)

open class GiftAttachment(override val type: String = "gift", val gift: Gift) : Attachments
class Gift(val id: Int, val thumb256: String, val thumb96: String, val thumb48: String)


open class GraffitiAttachment(override val type: String = "graffiti", val graffiti: Graffiti) : Attachments
data class Graffiti(val id: Int, val ownerId: Int, val url: String, val width: Int, val height: Int)