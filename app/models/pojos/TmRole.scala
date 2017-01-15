/**
 * This class is generated by jOOQ
 */
package models.pojos


import java.io.Serializable
import java.lang.Integer
import java.lang.String
import java.lang.StringBuilder
import java.time.LocalDateTime

import javax.annotation.Generated

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.8.6"
  ),
  comments = "This class is generated by jOOQ"
)
class TmRole(
    private var id : Integer      
  , private var name : String       
  , private var created : LocalDateTime
  , private var modified : LocalDateTime
) extends Serializable {

  def this() = {
    this(null, null, null, null)
  }

  def this (value : TmRole) = {
    this(
        value.id
      , value.name
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

  def getName : String = {
    this.name
  }

  def setName(name : String) : Unit = {
    this.name = name
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
    val sb = new StringBuilder("TmRole (")

    sb.append(id)
    sb.append(", ").append(name)
    sb.append(", ").append(created)
    sb.append(", ").append(modified)

    sb.append(")");
    return sb.toString
  }
}
