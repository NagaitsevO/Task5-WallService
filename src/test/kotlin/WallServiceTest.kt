import junit.framework.Assert.assertEquals
import org.junit.Test

internal class WallServiceTest {
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

    @Test
    fun add() {
        var testParam: Boolean = true
        WallService.add(theFirstPost)
        if (theFirstPost.id == 0) testParam = false
        assertEquals(true, testParam)
    }

    @Test
    fun updateRealID() {
        WallService.add(theFirstPost)
        assertEquals(true, WallService.update(theFirstPost))
    }

    @Test
    fun updateNotRealID() {
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

        val theSecondPost = Post (
                id = 5,
                comments = theFirstComments,
                likes = theFirstLikes,
                reposts = theFirstReposts,
                viewsObject = theFirstViewsObject,
                postType = PostType.POST
        )
        assertEquals(false, WallService.update(theSecondPost))
    }
}