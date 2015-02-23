package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_endsWith_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.endsWith("Yoda", "Luke")
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertEndsWith(getInfo(assertions), getActual(assertions).asJava, Array("Yoda", "Luke"))
    }

}
