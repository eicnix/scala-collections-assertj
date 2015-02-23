package de.lukaseichler.scalacollectionsassertj

import org.assertj.core.api.Assertions

/**
 * @author Lukas Eichler
 */
object ScalaAssertions extends Assertions {

    def assertThat[V <: AnyRef](iterable: Iterable[V]): ScalaIterableAssert[V] = {
        new ScalaIterableAssert[V](iterable)
    }

}
