/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.daos


import java.lang.Boolean
import java.lang.Integer
import java.lang.String
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.List

import javax.annotation.Generated

import models.jooq.tables.TwEvent
import models.jooq.tables.records.TwEventRecord

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
class TwEventDao(configuration : Configuration) extends DAOImpl[TwEventRecord, models.pojos.TwEvent, Integer](TwEvent.TW_EVENT, classOf[models.pojos.TwEvent], configuration) {

  /**
   * Create a new TwEventDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : models.pojos.TwEvent) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : models.pojos.TwEvent = {
    fetchOne(TwEvent.TW_EVENT.ID, value)
  }

  /**
   * Fetch records that have <code>user_id IN (values)</code>
   */
  def fetchByUserId(values : Integer*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.USER_ID, values:_*)
  }

  /**
   * Fetch records that have <code>start_date IN (values)</code>
   */
  def fetchByStartDate(values : LocalDate*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.START_DATE, values:_*)
  }

  /**
   * Fetch records that have <code>end_date IN (values)</code>
   */
  def fetchByEndDate(values : LocalDate*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.END_DATE, values:_*)
  }

  /**
   * Fetch records that have <code>all_day_event IN (values)</code>
   */
  def fetchByAllDayEvent(values : Boolean*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.ALL_DAY_EVENT, values:_*)
  }

  /**
   * Fetch records that have <code>type IN (values)</code>
   */
  def fetchByType(values : Integer*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.TYPE, values:_*)
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  def fetchByDescription(values : String*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.DESCRIPTION, values:_*)
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  def fetchByCreated(values : LocalDateTime*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.CREATED, values:_*)
  }

  /**
   * Fetch records that have <code>modified IN (values)</code>
   */
  def fetchByModified(values : LocalDateTime*) : List[models.pojos.TwEvent] = {
    fetch(TwEvent.TW_EVENT.MODIFIED, values:_*)
  }
}
