package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasSameElementsAs_Scala_Test extends ScalaIterableAssertBaseTest{

    private val list = List[AnyRef]("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.hasSameElementsAs(list)
    }
    override def verify_internal_effects(): Unit = {
        verify(iterables).assertContainsOnly(getInfo(assertions), getActual(assertions).asJava, list.asJava
          .toArray)
    }

}
