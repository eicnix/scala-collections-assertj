package de.lukaseichler.assertjscalacollections

import org.assertj.core.api.ObjectEnumerableAssert

/**
 * @author Lukas Eichler
 */
trait ScalaObjectEnumerableAssertTrait[T <: AnyRef] extends ObjectEnumerableAssert[ScalaIterableAssert[T], T] {
}