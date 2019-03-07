package me.rotemfo.akka.feelings

import akka.actor.Actor

/**
  * project: scala-playground
  * package: me.rotemfo.akka.feelings
  * file:    Toggle
  * created: 2019-03-07
  * author:  rotem
  */
class Toggle extends Actor {
  def happy: Receive = {
    case QUESTION =>
      sender ! HAPPY
      context.become(sad)
    case _ => sender ! WTF
  }

  def sad : Receive = {
    case QUESTION =>
      sender ! SAD
      context.become(happy)
  }
  override def receive: Receive = happy
}
