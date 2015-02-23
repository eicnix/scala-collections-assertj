package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.util.Lists
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_doesNotContainAnyElementsOf_Scala_Test extends ScalaIterableAssertBaseTest{

    private val values: Iterable[AnyRef] = List("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.doesNotContainAnyElementsOf(values)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertDoesNotContainAnyElementsOf(getInfo(assertions), getActual(assertions).asJava, values.asJava)
    }

}
