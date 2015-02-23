package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_doesNotHaveDuplicates_Test extends ScalaIterableAssertBaseTest{

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.doesNotHaveDuplicates()
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertDoesNotHaveDuplicates(getInfo(assertions), getActual(assertions).asJava)
    }

}
