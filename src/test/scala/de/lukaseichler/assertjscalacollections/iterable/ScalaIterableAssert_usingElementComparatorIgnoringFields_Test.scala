package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.Assertions
import org.assertj.core.internal.{ComparisonStrategy, Iterables, IgnoringFieldsComparator, ComparatorBasedComparisonStrategy}
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_usingElementComparatorIgnoringFields_Test extends ScalaIterableAssertBaseTest{

    private val iterablesBefore: Iterables = null


    override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
        assertions.usingElementComparatorIgnoringFields("field")
    }

    override def verify_internal_effects(): Unit = {
        val iterables: Iterables = getIterables(assertions)
        Assertions.assertThat(iterables).isNotSameAs(iterablesBefore)
        Assertions.assertThat(iterables.getComparisonStrategy).isInstanceOf(classOf[ComparatorBasedComparisonStrategy])
        val strategy: ComparatorBasedComparisonStrategy = iterables.getComparisonStrategy.asInstanceOf[ComparatorBasedComparisonStrategy]
        Assertions.assertThat(strategy.getComparator).isInstanceOf(classOf[IgnoringFieldsComparator])
        Assertions.assertThat(strategy.getComparator.asInstanceOf[IgnoringFieldsComparator].getFields()).containsOnly("field")
    }
 }
