import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

import Helo._

class AlbumTest extends FunSpec with ShouldMatchers  {
   describe("something") {
       it ("returns appletree") {
         Helo.appl should equal ("appletree")
       }
   }
}
