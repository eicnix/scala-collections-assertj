package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.junit.Test
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_isNotEmpty_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.isNotEmpty()
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertNotEmpty(getInfo(assertions), getActual(assertions).asJava)
    }
 }
