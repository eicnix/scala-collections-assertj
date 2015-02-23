package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.util.Lists
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert_containsExactlyElementsOf_Java_Test extends ScalaIterableAssertBaseTest{

    private val values: java.util.List[String] = Lists.newArrayList("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.containsExactlyElementsOf(values)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertDoesNotContainAnyElementsOf(getInfo(assertions), getActual(assertions).asJava, values)
    }

}
