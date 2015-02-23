package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.Assertions
import org.assertj.core.internal.{OnFieldsComparator, ComparatorBasedComparisonStrategy, IgnoringFieldsComparator, Iterables}

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_usingElementComparatorOnFields_Test extends ScalaIterableAssertBaseTest{

    private var iterablesBefore: Iterables = null


    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.usingElementComparatorOnFields("field")
    }

    override def verify_internal_effects(): Unit = {
        val iterables: Iterables = getIterables(assertions)
        Assertions.assertThat(iterables).isNotSameAs(iterablesBefore)
        Assertions.assertThat(iterables.getComparisonStrategy).isInstanceOf(classOf[ComparatorBasedComparisonStrategy])
        val strategy: ComparatorBasedComparisonStrategy = iterables.getComparisonStrategy.asInstanceOf[ComparatorBasedComparisonStrategy]
        Assertions.assertThat(strategy.getComparator).isInstanceOf(classOf[OnFieldsComparator])
        Assertions.assertThat(strategy.getComparator.asInstanceOf[OnFieldsComparator].getFields()).containsOnly("field")
    }
 }
