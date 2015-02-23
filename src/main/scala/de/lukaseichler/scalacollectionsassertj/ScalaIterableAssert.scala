package de.lukaseichler.scalacollectionsassertj

import java.lang
import java.util.Comparator

import org.assertj.core.api.{AbstractAssert, Condition}
import org.assertj.core.internal._
import org.assertj.core.util.VisibleForTesting

import scala.collection.JavaConverters._

/**
 * @author Lukas Eichler
 */
class ScalaIterableAssert[T <: AnyRef]  (actual: Iterable[T]) extends AbstractAssert[ScalaIterableAssert[T], Iterable[T]](actual, classOf[ScalaIterableAssert[T]]) with ScalaObjectEnumerableAssertTrait[T]{

    @VisibleForTesting
    var iterables: Iterables = Iterables.instance()

    override def doNotHave(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertDoNotHave(info, actual.asJava, condition)
        myself
    }

    override def haveAtLeastOne(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        haveAtLeast(1, condition)
        myself
    }

    override def haveAtLeast(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertHaveAtLeast(info, actual.asJava, n, condition)
        myself
    }

    override def containsOnly(values: T*): ScalaIterableAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    override def have(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertHave(info, actual.asJava, condition)
        myself
    }

    override def areExactly(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAreExactly(info, actual.asJava, n, condition)
        myself
    }

    override def containsSubsequence(sequence: T*): ScalaIterableAssert[T] = {
        iterables.assertContainsSubsequence(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def containsOnlyOnce(values: T*): ScalaIterableAssert[T] = {
        iterables.assertContainsOnlyOnce(info, actual.asJava,values.toArray[AnyRef]
         )
        myself
    }

    override def are(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAre(info, actual.asJava, condition)
        myself
    }

    override def doesNotContain(values: T*): ScalaIterableAssert[T] = {
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
    def doesNotContainAnyElementsOf(iterable: Iterable[T]): ScalaIterableAssert[T] = {
        iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable.asJava)
        myself
    }

    override def haveAtMost(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertHaveAtMost(info, actual.asJava, n, condition)
        myself
    }

    override def haveExactly(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertHaveExactly(info, actual.asJava, n, condition)
        myself
    }

    override def contains(values: T*): ScalaIterableAssert[T] = {
        iterables.assertContains(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

        override def containsNull(): ScalaIterableAssert[T] = {
        iterables.assertContainsNull(info, actual.asJava)
        myself
    }

    override def areNot(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAreNot(info, actual.asJava, condition)
        myself
    }

    override def containsAll(iterable: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsAll(info, actual.asJava, iterable)
        myself
    }

    def containsAll(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsAll(info, actual.asJava, iterable.asJava)
        myself
    }

    override def areAtLeast(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAreAtLeast(info, actual.asJava, n, condition)
        myself
    }

    override def endsWith(sequence: T*): ScalaIterableAssert[T] = {
        iterables.assertEndsWith(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def doesNotHaveDuplicates(): ScalaIterableAssert[T] = {
        iterables.assertDoesNotHaveDuplicates(info, actual.asJava)
        myself
    }

    override def areAtLeastOne(condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAreAtLeast(info, actual.asJava, 1, condition)
        myself
    }

    override def containsSequence(sequence: T*): ScalaIterableAssert[T] = {
        iterables.assertContainsSequence(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def areAtMost(n: Int, condition: Condition[_ >: T]): ScalaIterableAssert[T] = {
        iterables.assertAreAtMost(info, actual.asJava, n, condition)
        myself
    }

    override def doesNotContainNull(): ScalaIterableAssert[T] = {
        iterables.assertDoesNotContainNull(info, actual.asJava)
        myself
    }

    override def hasAtLeastOneElementOfType(expectedType: Class[_]): ScalaIterableAssert[T] = {
        ObjectArrays.instance().assertHasAtLeastOneElementOfType(info, org.assertj.core.util.Iterables.toArray(actual.asJava), expectedType)
        myself
    }

    override def containsExactly(values: T*): ScalaIterableAssert[T] = {
        iterables.assertContainsExactly(info, actual.asJava, values.toArray[AnyRef])
        myself
    }

    override def startsWith(sequence: T*): ScalaIterableAssert[T] = {
    iterables.assertStartsWith(info, actual.asJava, sequence.toArray[AnyRef])
        myself
    }

    override def hasOnlyElementsOfType(expectedType: Class[_]): ScalaIterableAssert[T] = {
        ObjectArrays.instance().assertHasOnlyElementsOfType(info, org.assertj.core.util.Iterables.toArray(actual.asJava), expectedType)
        myself
    }

    override def isNotEmpty: ScalaIterableAssert[T] = {
        iterables.assertNotEmpty(info, actual.asJava)
        myself
    }

    override def hasSize(expected: Int): ScalaIterableAssert[T] = {
        iterables.assertHasSize(info, actual.asJava, expected)
        myself
    }

    override def hasSameSizeAs(other: lang.Iterable[_]): ScalaIterableAssert[T] = {
        iterables.assertHasSameSizeAs(info, actual.asJava, other)
        myself
    }

    override def hasSameSizeAs(array: scala.Any): ScalaIterableAssert[T] = {
        iterables.assertHasSameSizeAs(info, actual.asJava, array)
        myself
    }

    override def isNullOrEmpty(): Unit = {
        iterables.assertNullOrEmpty(info, actual.asJava)
    }

    override def usingElementComparator(customComparator: Comparator[_ >: T]): ScalaIterableAssert[T] = {
        iterables = new Iterables(new ComparatorBasedComparisonStrategy(customComparator))
        myself
    }

    override def usingDefaultElementComparator(): ScalaIterableAssert[T] = {
        usingDefaultComparator()
        iterables = Iterables.instance()
        myself
    }

    override def isEmpty(): Unit = {
        iterables.assertEmpty(info, actual.asJava)
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
    def isSubsetOf(values: Iterable[T]): ScalaIterableAssert[T] = {
        iterables.assertIsSubsetOf(info, actual.asJava, values.asJava)
        myself
    }

    override def hasSameElementsAs(iterable: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, org.assertj.core.util.Iterables.toArray(iterable))
        myself
    }

    def hasSameElementsAs(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, org.assertj.core.util.Iterables.toArray(iterable.asJava))
        myself
    }

    override def isSubsetOf(values: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertIsSubsetOf(info, actual.asJava, values)
        myself
    }

    override def doesNotContainAnyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable)
        myself
    }

    override def containsExactlyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable)
        myself
    }

    def containsExactlyElementsOf(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable.asJava)
        myself
    }

    override def containsOnlyElementsOf(iterable: lang.Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, org.assertj.core.util.Iterables.toArray(iterable))
        myself
    }

    def containsOnlyElementsOf(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
        iterables.assertContainsOnly(info, actual.asJava, org.assertj.core.util.Iterables.toArray(iterable.asJava))
        myself
    }

    /**
     * Use field by field comparison on all fields <b>except</b> the given ones (fields can be inherited fields) instead
     * of relying on actual type A <code>equals</code> method to compare group elements for incoming assertion checks.
     * <p/>
     * This can be handy if <code>equals</code> method of the objects to compare does not suit you.
     * <p/>
     * Note that only <b>accessible </b>fields values are compared, accessible fields include directly accessible fields
     * (e.g. public) or fields with an accessible getter.<br/>
     * Moreover comparison is <b>not</b> recursive, if one of the field is an Object, it will be compared to the other
     * field using its <code>equals</code> method.
     * </p>
     * Example:
     *
     * <pre><code class='java'>
     * TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
     * TolkienCharacter sam = new TolkienCharacter("Sam", 38, HOBBIT);
     *
     * // frodo and sam both are hobbits, so they are equals when comparing only race (i.e. ignoring all other fields)
     * assertThat(newArrayList(frodo)).usingElementComparatorIgnoringFields("name", "age").contains(sam); // OK
     *
     * // ... but not when comparing both name and race
     * assertThat(newArrayList(frodo)).usingElementComparatorIgnoringFields("age").contains(sam); // FAIL
     * </code></pre>
     *
     * @return { @code this} assertion object.
     */
    def usingElementComparatorIgnoringFields(fields: String*): ScalaIterableAssert[T]  = {
        usingElementComparator(new IgnoringFieldsComparator(fields:_*))
    }

    /**
     * Use field by field comparison on the <b>given fields only</b> (fields can be inherited fields) instead of relying
     * on actual type A <code>equals</code> method to compare group elements for incoming assertion checks.
     * <p/>
     * This can be handy if <code>equals</code> method of the objects to compare does not suit you.
     * <p/>
     * Note that only <b>accessible </b>fields values are compared, accessible fields include directly accessible fields
     * (e.g. public) or fields with an accessible getter.<br/>
     * Moreover comparison is <b>not</b> recursive, if one of the field is an Object, it will be compared to the other
     * field using its <code>equals</code> method.
     * </p>
     * Example:
     *
     * <pre><code class='java'>
     * TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
     * TolkienCharacter sam = new TolkienCharacter("Sam", 38, HOBBIT);
     *
     * // frodo and sam both are hobbits, so they are equals when comparing only race
     * assertThat(newArrayList(frodo)).usingElementComparatorOnFields("race").contains(sam); // OK
     *
     * // ... but not when comparing both name and race
     * assertThat(newArrayList(frodo)).usingElementComparatorOnFields("name", "race").contains(sam); // FAIL
     * </code></pre>
     *
     * @return { @code this} assertion object.
     */
    def usingElementComparatorOnFields(fields: String*): ScalaIterableAssert[T] = {
        usingElementComparator(new OnFieldsComparator(fields:_*))
    }

    /**
     * Use field by field comparison (including inherited fields) instead of relying on actual type A <code>equals</code>
     * method to compare group elements for incoming assertion checks.
     * <p/>
     * This can be handy if <code>equals</code> method of the objects to compare does not suit you.
     * <p/>
     * Note that only <b>accessible </b>fields values are compared, accessible fields include directly accessible fields
     * (e.g. public) or fields with an accessible getter.<br/>
     * Moreover comparison is <b>not</b> recursive, if one of the field is an Object, it will be compared to the other
     * field using its <code>equals</code> method.
     * </p>
     * Example:
     *
     * <pre><code class='java'>
     * TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
     * TolkienCharacter frodoClone = new TolkienCharacter("Frodo", 33, HOBBIT);
     *
     * // Fail if equals has not been overriden in TolkienCharacter as equals default implementation only compares references
     * assertThat(newArrayList(frodo)).contains(frodoClone);
     *
     * // frodo and frodoClone are equals when doing a field by field comparison.
     * assertThat(newArrayList(frodo)).usingFieldByFieldElementComparator().contains(frodoClone);
     * </code></pre>
     *
     * @return { @code this} assertion object.
     */
    def usingFieldByFieldElementComparator: ScalaIterableAssert[T] = {
        usingElementComparator(new FieldByFieldComparator)
    }
}
