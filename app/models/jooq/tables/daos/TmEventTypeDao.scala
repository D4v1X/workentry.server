/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.daos


import java.lang.Integer
import java.lang.String
import java.time.LocalDateTime
import java.util.List

import javax.annotation.Generated

import models.jooq.tables.TmEventType
import models.jooq.tables.records.TmEventTypeRecord

import org.jooq.Configuration
import org.jooq.impl.DAOImpl

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
class TmEventTypeDao(configuration : Configuration) extends DAOImpl[TmEventTypeRecord, models.pojos.TmEventType, Integer](TmEventType.TM_EVENT_TYPE, classOf[models.pojos.TmEventType], configuration) {

  /**
   * Create a new TmEventTypeDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : models.pojos.TmEventType) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : models.pojos.TmEventType = {
    fetchOne(TmEventType.TM_EVENT_TYPE.ID, value)
  }

  /**
   * Fetch records that have <code>name IN (values)</code>
   */
  def fetchByName(values : String*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.NAME, values:_*)
  }

  /**
   * Fetch a unique record that has <code>name = value</code>
   */
  def fetchOneByName(value : String) : models.pojos.TmEventType = {
    fetchOne(TmEventType.TM_EVENT_TYPE.NAME, value)
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  def fetchByDescription(values : String*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.DESCRIPTION, values:_*)
  }

  /**
   * Fetch records that have <code>color IN (values)</code>
   */
  def fetchByColor(values : String*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.COLOR, values:_*)
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  def fetchByCreated(values : LocalDateTime*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.CREATED, values:_*)
  }

  /**
   * Fetch records that have <code>modified IN (values)</code>
   */
  def fetchByModified(values : LocalDateTime*) : List[models.pojos.TmEventType] = {
    fetch(TmEventType.TM_EVENT_TYPE.MODIFIED, values:_*)
  }
}
