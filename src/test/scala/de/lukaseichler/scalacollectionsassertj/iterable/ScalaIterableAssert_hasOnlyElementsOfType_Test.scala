package de.lukaseichler.scalacollectionsassertj.iterable

import de.lukaseichler.scalacollectionsassertj.ScalaAssertions
import org.junit.Test

/**
 * @author Lukas Eichler

 */
class ScalaIterableAssert_hasOnlyElementsOfType_Test {

    @Test
    def should_pass_if_actual_has_one_element_of_the_expected_type() {
        val list = List[AnyRef](Int.box(1), Int.box(2))
        ScalaAssertions.assertThat(list).hasOnlyElementsOfType(classOf[Number])
            .hasOnlyElementsOfType(classOf[Integer])
    }
}
