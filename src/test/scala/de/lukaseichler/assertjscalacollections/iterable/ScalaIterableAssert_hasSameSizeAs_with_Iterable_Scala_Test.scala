package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.util.Lists
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasSameSizeAs_with_Iterable_Scala_Test  extends ScalaIterableAssertBaseTest {

    private val other = List("Solo", "Leia")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.hasSameSizeAs(other)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertHasSameSizeAs(getInfo(assertions), getActual(assertions).asJava, other)
    }
}
