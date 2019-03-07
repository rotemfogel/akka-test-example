package me.rotemfo.akka.feelings

 import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

 /**
  * project: scala-playground
  * package: me.rotemfo.akka.feelings
  * file:    ToggleSpec
  * created: 2019-03-07
  * author:  rotem
  */
class ToggleSpec extends TestKit(ActorSystem("ToggleSpec")) with ImplicitSender
  with WordSpecLike with Matchers with BeforeAndAfterAll {

   override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }

   "A Toggle actor" must {
     "toggle messages" in {
      val toggle = system.actorOf(Props[Toggle])
      toggle ! QUESTION
      expectMsg(HAPPY)
      toggle ! QUESTION
      expectMsg(SAD)
      toggle ! QUESTION
      expectMsg(HAPPY)
    }
  }
}
