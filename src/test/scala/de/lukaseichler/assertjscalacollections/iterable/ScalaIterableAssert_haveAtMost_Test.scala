package de.lukaseichler.assertjscalacollections.iterable

import de.lukaseichler.assertjscalacollections.{ScalaIterableAssert, ScalaIterableAssertBaseTest}
import org.assertj.core.api.{Condition, TestCondition}
import org.mockito.Mockito._

import scala.collection.JavaConverters._

/**
  * @author Lukas Eichler

  */
class ScalaIterableAssert_haveAtMost_Test extends ScalaIterableAssertBaseTest{

     private val condition: Condition[AnyRef] = new TestCondition[AnyRef]()

     override def invoke_api_method(): ScalaIterableAssert[AnyRef] = {
         assertions.haveAtMost(2, condition)
     }

     override def verify_internal_effects(): Unit = {
         verify(iterables).assertHaveAtMost(getInfo(assertions), getActual(assertions).asJava, 2, condition)
     }

 }
