import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FakeTest : StringSpec({
    "a test" {
        "a test".shouldBe("a test")
    }
})