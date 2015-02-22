package de.lukaseichler.scalacollectionsassertj

import java.lang
import java.util.Comparator

import org.assertj.core.api.{AbstractAssert, Condition}
import org.assertj.core.internal.Iterables
import org.assertj.core.util.VisibleForTesting

import scala.collection.JavaConverters._

/**
 * @author leichler
 */
class ScalaIterableCollectionAssert[T <: AnyRef]  (actual: Iterable[T]) extends AbstractAssert[ScalaIterableCollectionAssert[T], Iterable[T]](actual, classOf[ScalaIterableCollectionAssert[T]]) with ScalaObjectEnumerableAssertTrait[T]{

    @VisibleForTesting
    var iterables: Iterables = Iterables.instance()

    override def doNotHave(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertDoNotHave(info, actual.asJava, condition)
        myself
    }

    override def haveAtLeastOne(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        areAtLeast(1, condition)
        myself
    }

    override def haveAtLeast(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = ???

    override def containsOnly(values: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    override def have(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertHave(info, actual.asJava, condition)
        myself
    }

    override def areExactly(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = ???

    override def containsSubsequence(sequence: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsSubsequence(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def containsOnlyOnce(values: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsOnlyOnce(info, actual.asJava,values.toArray[AnyRef]
         )
        myself
    }

    override def are(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertAre(info, actual.asJava, condition)
        myself
    }

    override def doesNotContain(values: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertDoesNotContain(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    /**
     * Verifies that the actual group does not contain any elements of the given {@link Iterable} (i.e. none).
     * <p/>
     *
     * <pre>
     * // this assertion succeeds :
     * List&lt;String&gt; actual = newArrayList(&quot;GIT&quot;, &quot;CVS&quot;, &quot;SOURCESAFE&quot;);
     * List&lt;String&gt; values = newArrayList(&quot;git&quot;, &quot;cvs&quot;, &quot;subversion&quot;);
     * assertThat(actual).doesNotContainAnyElementsOf(values);
     *
     * // This one fails :
     * List&lt;String&gt; actual = newArrayList(&quot;GIT&quot;, &quot;cvs&quot;, &quot;SOURCESAFE&quot;);
     * List&lt;String&gt; values = newArrayList(&quot;git&quot;, &quot;cvs&quot;, &quot;subversion&quot;);
     * assertThat(actual).doesNotContainAnyElementsOf(values);
     * </pre>
     *
     * @param iterable the given { @link Iterable}
     * @return { @code this} assertion object.
     * @throws NullPointerException if the given argument is { @code null}.
     * @throws IllegalArgumentException if the given argument is an empty iterable.
     * @throws AssertionError if the actual group is { @code null}.
     * @throws AssertionError if the actual group contains some elements of the given { @link Iterable}.
     */
    def doesNotContainAnyElementsOf(iterable: Iterable[T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable.asJava)
        return myself
    }

    override def haveAtMost(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = ???

    override def haveExactly(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = ???

    override def contains(values: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContains(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    override def containsNull(): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsNull(info, actual.asJava)
        myself
    }

    override def areNot(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertAreNot(info, actual.asJava, condition)
        myself
    }

    override def containsAll(iterable: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???

    override def areAtLeast(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertAreAtLeast(info, actual.asJava, n, condition)
        myself
    }

    override def endsWith(sequence: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertEndsWith(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def doesNotHaveDuplicates(): ScalaIterableCollectionAssert[T] = {
        iterables.assertDoesNotHaveDuplicates(info, actual.asJava)
        myself
    }

    override def areAtLeastOne(condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertAreAtLeast(info, actual.asJava, 1, condition)
        myself
    }

    override def containsSequence(sequence: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsSequence(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def areAtMost(n: Int, condition: Condition[_ >: T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertAreAtMost(info, actual.asJava, n, condition)
        myself
    }

    override def doesNotContainNull(): ScalaIterableCollectionAssert[T] = {
        iterables.assertDoesNotContainNull(info, actual.asJava)
        myself
    }

    override def hasAtLeastOneElementOfType(expectedType: Class[_]): ScalaIterableCollectionAssert[T] = ???

    override def containsExactly(values: T*): ScalaIterableCollectionAssert[T] = {
        iterables.assertContainsExactly(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    override def startsWith(sequence: T*): ScalaIterableCollectionAssert[T] = {
    iterables.assertStartsWith(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def hasOnlyElementsOfType(expectedType: Class[_]): ScalaIterableCollectionAssert[T] = ???

    override def isNotEmpty: ScalaIterableCollectionAssert[T] = {
        iterables.assertNotEmpty(info, actual.asJava)
        myself
    }

    override def hasSize(expected: Int): ScalaIterableCollectionAssert[T] = {
        iterables.assertHasSize(info, actual.asJava, expected)
        myself
    }

    override def hasSameSizeAs(other: lang.Iterable[_]): ScalaIterableCollectionAssert[T] = {
        iterables.assertHasSameSizeAs(info, actual.asJava, other)
        myself
    }

    override def hasSameSizeAs(array: scala.Any): ScalaIterableCollectionAssert[T] = {
        iterables.assertHasSameSizeAs(info, actual.asJava, array)
        myself
    }

    override def isNullOrEmpty(): Unit = {
        iterables.assertNullOrEmpty(info, actual.asJava)
    }

    override def usingElementComparator(customComparator: Comparator[_ >: T]): ScalaIterableCollectionAssert[T] = ???

    override def usingDefaultElementComparator(): ScalaIterableCollectionAssert[T] = ???

    override def isEmpty(): Unit = {
        iterables.assertNullOrEmpty(info, actual.asJava)
    }

    /**
     * Verifies that all the elements of the actual {@code Iterable} are present in the given {@code Iterable}.
     *
     * @param values the { @code Iterable} that should contain all actual elements.
     * @return this assertion object.
     * @throws AssertionError if the actual { @code Iterable} is { @code null}.
     * @throws NullPointerException if the given { @code Iterable} is { @code null}.
     * @throws AssertionError if the actual { @code Iterable} is not subset of set { @code Iterable}.
     */
    def isSubsetOf(values: Iterable[T]): ScalaIterableCollectionAssert[T] = {
        iterables.assertIsSubsetOf(info, actual.asJava, values.asJava)
        myself
    }

    override def hasSameElementsAs(iterable: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???

    override def isSubsetOf(values: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???

    override def doesNotContainAnyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???

    override def containsExactlyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???

    override def containsOnlyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableCollectionAssert[T] = ???
}
