package de.lukaseichler.scalacollectionsassertj

import org.assertj.core.api.BaseTestTemplate
import org.assertj.core.internal.Iterables
import org.mockito.Mockito.mock

/**
 * @author leichler
 */
abstract class ScalaIterableAssertBaseTest extends BaseTestTemplate[ScalaIterableAssert[AnyRef], Iterable[AnyRef]]{

    protected var iterables: Iterables = _

    override protected def create_assertions(): ScalaIterableAssert[AnyRef] = {
        new ScalaIterableAssert[AnyRef](List[AnyRef]())
    }

    override protected def inject_internal_objects() = {
        super.inject_internal_objects()
        iterables = mock(classOf[Iterables])
        assertions.iterables = iterables
    }

    protected def getIterables(assertions: ScalaIterableAssert[AnyRef]): Iterables = {
        assertions.iterables
    }

    override def getActual(someAssertions: ScalaIterableAssert[AnyRef]): Iterable[AnyRef] = super.getActual(someAssertions)
}
