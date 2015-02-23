package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasSameElementsAs_Java_Test extends ScalaIterableAssertBaseTest{

    private val list = List[AnyRef]("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.hasSameElementsAs(list.asJava)
    }
    override def verify_internal_effects(): Unit = {
        verify(iterables).assertContainsOnly(getInfo(assertions), getActual(assertions).asJava, list.asJava
          .toArray)
    }

}
