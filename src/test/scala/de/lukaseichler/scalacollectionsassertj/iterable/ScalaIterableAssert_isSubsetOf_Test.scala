package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.mockito.Mockito._
import scala.collection.JavaConverters._
/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_isSubsetOf_Test extends ScalaIterableAssertBaseTest{

    private val values: Iterable[AnyRef] = List[AnyRef]("Yoda", "Luke")

    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.isSubsetOf(values)
    }

    override def verify_internal_effects(): Unit = {
        verify(iterables).assertIsSubsetOf(getInfo(assertions), getActual(assertions).asJava, values.asJava)
    }

}
