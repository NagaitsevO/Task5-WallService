

fun main() {
    val theFirstComments = Comments (
            canPost = true
    )
    val theFirstLikes = Likes (
            canLike = true
    )
    val theFirstReposts = Reposts ()
    val theFirstViewsObject = ViewsObject (
            count = 1
    )

    val theFirstPost = Post (
            id = 1,
            comments = theFirstComments,
            likes = theFirstLikes,
            reposts = theFirstReposts,
            viewsObject = theFirstViewsObject,
            postType = PostType.POST
    )

    println(theFirstPost)
    WallService.add(theFirstPost)
    println(WallService.update(theFirstPost))
    println(theFirstPost)
}