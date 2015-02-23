package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._
/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert_containsAll_Scala_Test extends ScalaIterableAssertBaseTest{

    private val list: Iterable[_ <: AnyRef] = List()

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.containsAll(list)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertContainsAll(getInfo(assertions), getActual(assertions).asJava, list.asJava)
    }

}
