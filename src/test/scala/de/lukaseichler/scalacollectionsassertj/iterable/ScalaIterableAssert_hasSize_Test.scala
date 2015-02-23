package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasSize_Test extends ScalaIterableAssertBaseTest{


    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.hasSize(6)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertHasSize(getInfo(assertions), getActual(assertions).asJava, 6)
    }

}
