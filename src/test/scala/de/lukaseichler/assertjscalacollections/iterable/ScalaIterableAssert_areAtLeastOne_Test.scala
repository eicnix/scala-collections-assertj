package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{ConcreteIterableAssert, TestCondition, IterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * Tests for <code>{@link org.assertj.core.api.AbstractIterableAssert#areAtLeastOne(org.assertj.core.api.Condition)}</code>.
 */
class ScalaIterableAssert_areAtLeastOne_Test extends ScalaIterableAssertBaseTest {
    val condition = new TestCondition[AnyRef]()


    override protected def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.areAtLeastOne(condition)
    }

    override protected def verify_internal_effects() = {
        verify(iterables).assertAreAtLeast(getInfo(assertions), getActual(assertions).asJava, 1, condition)
    }
}
