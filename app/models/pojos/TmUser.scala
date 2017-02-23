/*
 * This file is generated by jOOQ.
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
    "jOOQ version:3.9.1"
  ),
  comments = "This class is generated by jOOQ"
)
class TmUser(
    private var id : Integer      
  , private var name : String       
  , private var email : String       
  , private var nif : String       
  , private var afiliationNo : String       
  , private var loginName : String       
  , private var password : String       
  , private var created : LocalDateTime
  , private var modified : LocalDateTime
) extends Serializable {

  def this() = {
    this(null, null, null, null, null, null, null, null, null)
  }

  def this (value : TmUser) = {
    this(
        value.id
      , value.name
      , value.email
      , value.nif
      , value.afiliationNo
      , value.loginName
      , value.password
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

  def getEmail : String = {
    this.email
  }

  def setEmail(email : String) : Unit = {
    this.email = email
  }

  def getNif : String = {
    this.nif
  }

  def setNif(nif : String) : Unit = {
    this.nif = nif
  }

  def getAfiliationNo : String = {
    this.afiliationNo
  }

  def setAfiliationNo(afiliationNo : String) : Unit = {
    this.afiliationNo = afiliationNo
  }

  def getLoginName : String = {
    this.loginName
  }

  def setLoginName(loginName : String) : Unit = {
    this.loginName = loginName
  }

  def getPassword : String = {
    this.password
  }

  def setPassword(password : String) : Unit = {
    this.password = password
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
    val sb = new StringBuilder("TmUser (")

    sb.append(id)
    sb.append(", ").append(name)
    sb.append(", ").append(email)
    sb.append(", ").append(nif)
    sb.append(", ").append(afiliationNo)
    sb.append(", ").append(loginName)
    sb.append(", ").append(password)
    sb.append(", ").append(created)
    sb.append(", ").append(modified)

    sb.append(")");
    return sb.toString
  }
}
