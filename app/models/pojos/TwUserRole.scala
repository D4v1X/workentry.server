/*
 * This file is generated by jOOQ.
*/
package models.pojos


import java.io.Serializable
import java.lang.Integer
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
    "jOOQ version:3.9.1"
  ),
  comments = "This class is generated by jOOQ"
)
class TwUserRole(
    private var id : Integer      
  , private var userId : Integer      
  , private var roleId : Integer      
  , private var created : LocalDateTime
  , private var modified : LocalDateTime
) extends Serializable {

  def this() = {
    this(null, null, null, null, null)
  }

  def this (value : TwUserRole) = {
    this(
        value.id
      , value.userId
      , value.roleId
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

  def getRoleId : Integer = {
    this.roleId
  }

  def setRoleId(roleId : Integer) : Unit = {
    this.roleId = roleId
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
    val sb = new StringBuilder("TwUserRole (")

    sb.append(id)
    sb.append(", ").append(userId)
    sb.append(", ").append(roleId)
    sb.append(", ").append(created)
    sb.append(", ").append(modified)

    sb.append(")");
    return sb.toString
  }
}
