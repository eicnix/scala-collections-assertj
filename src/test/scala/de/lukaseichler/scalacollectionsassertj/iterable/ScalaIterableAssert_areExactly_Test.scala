package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{TestCondition, Condition}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author leichler
 */
class ScalaIterableAssert_areExactly_Test extends ScalaIterableAssertBaseTest{

    private val condition: Condition[AnyRef] = new TestCondition[AnyRef]()

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.areExactly(2, condition)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertAreExactly(getInfo(assertions), getActual(assertions).asJava, 2, condition)
    }

}
