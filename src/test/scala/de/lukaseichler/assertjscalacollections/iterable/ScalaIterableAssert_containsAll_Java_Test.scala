package de.lukaseichler.assertjscalacollections.iterable

import java.util

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert_containsAll_Java_Test extends ScalaIterableAssertBaseTest{

    private val iterable: java.lang.Iterable[AnyRef] = new util.ArrayList[AnyRef]()

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.containsAll(iterable)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertContainsAll(getInfo(assertions), getActual(assertions).asJava, iterable)
    }
}
