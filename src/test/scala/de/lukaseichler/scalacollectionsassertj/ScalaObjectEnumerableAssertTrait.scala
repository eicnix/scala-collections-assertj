package de.lukaseichler.scalacollectionsassertj

import org.assertj.core.api.ObjectEnumerableAssert

/**
 * @author leichler
 */
trait ScalaObjectEnumerableAssertTrait[T <: AnyRef] extends ObjectEnumerableAssert[ScalaIterableAssert[T], T] {
}