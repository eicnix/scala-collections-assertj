package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.ScalaAssertions
import org.junit.Test

import scala.collection.mutable

/**
 * @author Lukas Eichler

 */
class IterableAssert_hasAtLeastOneElementOfType_Test {

    @Test
    def should_pass_if_actual_has_one_element_of_the_expected_type() {
        var list = mutable.MutableList[AnyRef]()
        list+= "Test".asInstanceOf[AnyRef]
        list += Int.box(1)
        ScalaAssertions.assertThat(list).hasAtLeastOneElementOfType(classOf[String])
        ScalaAssertions.assertThat(list) .hasAtLeastOneElementOfType(classOf[Integer])
        ScalaAssertions.assertThat(list).hasAtLeastOneElementOfType(classOf[AnyRef])
    }
}
