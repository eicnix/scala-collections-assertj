package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{Condition, TestCondition}
import org.junit.Test
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_isEmpty_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.isEmpty()
        null
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertEmpty(getInfo(assertions), getActual(assertions).asJava)
    }

    @Test
    override def should_return_this(): Unit = {
        // Disable this test because return type is void
    }
 }
