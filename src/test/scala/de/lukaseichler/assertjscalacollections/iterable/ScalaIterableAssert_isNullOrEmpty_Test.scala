package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.junit.Test
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_isNullOrEmpty_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.isNullOrEmpty()
        null
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertNullOrEmpty(getInfo(assertions), getActual(assertions).asJava)
    }

    @Test
    override def should_return_this(): Unit = {
        // Disable this test because return type is void
    }
 }
