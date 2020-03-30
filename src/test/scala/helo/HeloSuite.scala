import Helo._
import org.scalatest.freespec.AnyFreeSpecLike
import org.scalatest.matchers.should.Matchers

class AlbumTest extends AnyFreeSpecLike with Matchers {
  "something" - {
    "returns appletree" in {
      Helo.appl should equal ("appletree")
    }
  }
}
