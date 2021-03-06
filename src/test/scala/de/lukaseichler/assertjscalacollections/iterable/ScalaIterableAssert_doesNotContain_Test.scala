package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_doesNotContain_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.doesNotContain("Yoda", "Luke")
    }

    override def verify_internal_effects(): Unit = {
       verify(iterables).assertDoesNotContain(getInfo(assertions), getActual(assertions).asJava, Array("Yoda", "Luke"))
    }
}
