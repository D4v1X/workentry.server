/*
 * This file is generated by jOOQ.
*/
package models.pojos


import java.io.Serializable
import java.lang.Boolean
import java.lang.Integer
import java.lang.String
import java.lang.StringBuilder
import java.time.LocalDate
import java.time.LocalDateTime

import javax.annotation.Generated

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.9.1"
  ),
  comments = "This class is generated by jOOQ"
)
class TwEvent(
    private var id : Integer      
  , private var userId : Integer      
  , private var startDate : LocalDate    
  , private var endDate : LocalDate    
  , private var allDayEvent : Boolean      
  , private var `type` : Integer      
  , private var description : String       
  , private var created : LocalDateTime
  , private var modified : LocalDateTime
) extends Serializable {

  def this() = {
    this(null, null, null, null, null, null, null, null, null)
  }

  def this (value : TwEvent) = {
    this(
        value.id
      , value.userId
      , value.startDate
      , value.endDate
      , value.allDayEvent
      , value.`type`
      , value.description
      , value.created
      , value.modified
    )
  }

  def getId : Integer = {
    this.id
  }

  def setId(id : Integer) : Unit = {
    this.id = id
  }

  def getUserId : Integer = {
    this.userId
  }

  def setUserId(userId : Integer) : Unit = {
    this.userId = userId
  }

  def getStartDate : LocalDate = {
    this.startDate
  }

  def setStartDate(startDate : LocalDate) : Unit = {
    this.startDate = startDate
  }

  def getEndDate : LocalDate = {
    this.endDate
  }

  def setEndDate(endDate : LocalDate) : Unit = {
    this.endDate = endDate
  }

  def getAllDayEvent : Boolean = {
    this.allDayEvent
  }

  def setAllDayEvent(allDayEvent : Boolean) : Unit = {
    this.allDayEvent = allDayEvent
  }

  def getType : Integer = {
    this.`type`
  }

  def setType(`type` : Integer) : Unit = {
    this.`type` = `type`
  }

  def getDescription : String = {
    this.description
  }

  def setDescription(description : String) : Unit = {
    this.description = description
  }

  def getCreated : LocalDateTime = {
    this.created
  }

  def setCreated(created : LocalDateTime) : Unit = {
    this.created = created
  }

  def getModified : LocalDateTime = {
    this.modified
  }

  def setModified(modified : LocalDateTime) : Unit = {
    this.modified = modified
  }

  override def toString : String = {
    val sb = new StringBuilder("TwEvent (")

    sb.append(id)
    sb.append(", ").append(userId)
    sb.append(", ").append(startDate)
    sb.append(", ").append(endDate)
    sb.append(", ").append(allDayEvent)
    sb.append(", ").append(`type`)
    sb.append(", ").append(description)
    sb.append(", ").append(created)
    sb.append(", ").append(modified)

    sb.append(")");
    return sb.toString
  }
}
