package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.IterableAssertBaseTest
import org.assertj.core.util.Lists
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasSameSizeAs_with_Iterable_Java_Test  extends ScalaIterableAssertBaseTest {

    private val other = Lists.newArrayList("Solo", "Leia")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.hasSameSizeAs(other)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertHasSameSizeAs(getInfo(assertions), getActual(assertions).asJava, other)
    }
}
