package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{TestCondition, Condition}
import org.junit.BeforeClass
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert_areAtLeast_Test extends ScalaIterableAssertBaseTest{

    private val condition: Condition[AnyRef] = new TestCondition[AnyRef]()

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.areAtLeast(2, condition)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertAreAtLeast(getInfo(assertions), getActual(assertions).asJava, 2, condition)
    }

}
