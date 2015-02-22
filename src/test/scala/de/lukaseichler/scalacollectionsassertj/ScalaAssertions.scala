package de.lukaseichler.scalacollectionsassertj

import org.assertj.core.api.Assertions

/**
 * @author leichler
 */
object ScalaAssertions extends Assertions {

    def assertThat[V <: Iterable[_]](iterable: V): ScalaIterableAssert[V] = {
        //new ScalaIterableCollectionAssert[V](iterable)
        null
    }
    
    /*def assertThat[V](seq: Seq[V]): ScalaSeqAssert[V] = {
        new ScalaSeqAssert[V](seq)
    }*/


}
