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
class TwNews(
    private var id : Integer      
  , private var title : String       
  , private var body : String       
  , private var authorId : Integer      
  , private var created : LocalDateTime
  , private var modified : LocalDateTime
) extends Serializable {

  def this() = {
    this(null, null, null, null, null, null)
  }

  def this (value : TwNews) = {
    this(
        value.id
      , value.title
      , value.body
      , value.authorId
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

  def getTitle : String = {
    this.title
  }

  def setTitle(title : String) : Unit = {
    this.title = title
  }

  def getBody : String = {
    this.body
  }

  def setBody(body : String) : Unit = {
    this.body = body
  }

  def getAuthorId : Integer = {
    this.authorId
  }

  def setAuthorId(authorId : Integer) : Unit = {
    this.authorId = authorId
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
    val sb = new StringBuilder("TwNews (")

    sb.append(id)
    sb.append(", ").append(title)
    sb.append(", ").append(body)
    sb.append(", ").append(authorId)
    sb.append(", ").append(created)
    sb.append(", ").append(modified)

    sb.append(")");
    return sb.toString
  }
}
