package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableCollectionAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{TestCondition, Condition}
import org.mockito.Mockito._
import scala.collection.JavaConverters._
/**
 * @author leichler
 */
class ScalaIterableAssert_areAtMost_Test extends ScalaIterableAssertBaseTest{

    protected var condition: Condition[AnyRef] = new TestCondition[AnyRef]()

    override def invoke_api_method(): ScalaIterableCollectionAssert[AnyRef] = {
        assertions.areAtMost(2, condition)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertAreAtMost(getInfo(assertions), getActual(assertions).asJava, 2, condition)
    }
}
