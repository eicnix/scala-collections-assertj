package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert_containsOnly_Test extends ScalaIterableAssertBaseTest{

    private val values = Array[AnyRef]("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.containsOnly("Yoda", "Luke")
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertContainsOnly(getInfo(assertions), getActual(assertions).asJava, values)
    }

}
