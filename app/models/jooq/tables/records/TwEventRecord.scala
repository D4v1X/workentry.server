/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.records


import java.lang.Boolean
import java.lang.Integer
import java.lang.String
import java.time.LocalDate
import java.time.LocalDateTime

import javax.annotation.Generated

import models.jooq.tables.TwEvent

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record9
import org.jooq.Row9
import org.jooq.impl.UpdatableRecordImpl

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
class TwEventRecord extends UpdatableRecordImpl[TwEventRecord](TwEvent.TW_EVENT) with Record9[Integer, Integer, LocalDate, LocalDate, Boolean, Integer, String, LocalDateTime, LocalDateTime] {

  /**
   * Setter for <code>workentry_schema.tw_event.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.user_id</code>.
   */
  def setUserId(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.user_id</code>.
   */
  def getUserId : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.start_date</code>.
   */
  def setStartDate(value : LocalDate) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.start_date</code>.
   */
  def getStartDate : LocalDate = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[LocalDate]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.end_date</code>.
   */
  def setEndDate(value : LocalDate) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.end_date</code>.
   */
  def getEndDate : LocalDate = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[LocalDate]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.all_day_event</code>.
   */
  def setAllDayEvent(value : Boolean) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.all_day_event</code>.
   */
  def getAllDayEvent : Boolean = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Boolean]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.type</code>.
   */
  def setType(value : Integer) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.type</code>.
   */
  def getType : Integer = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.description</code>.
   */
  def setDescription(value : String) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.description</code>.
   */
  def getDescription : String = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.created</code>.
   */
  def setCreated(value : LocalDateTime) : Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.created</code>.
   */
  def getCreated : LocalDateTime = {
    val r = get(7)
    if (r == null) null else r.asInstanceOf[LocalDateTime]
  }

  /**
   * Setter for <code>workentry_schema.tw_event.modified</code>.
   */
  def setModified(value : LocalDateTime) : Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_event.modified</code>.
   */
  def getModified : LocalDateTime = {
    val r = get(8)
    if (r == null) null else r.asInstanceOf[LocalDateTime]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record9 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row9[Integer, Integer, LocalDate, LocalDate, Boolean, Integer, String, LocalDateTime, LocalDateTime] = {
    super.fieldsRow.asInstanceOf[ Row9[Integer, Integer, LocalDate, LocalDate, Boolean, Integer, String, LocalDateTime, LocalDateTime] ]
  }

  override def valuesRow : Row9[Integer, Integer, LocalDate, LocalDate, Boolean, Integer, String, LocalDateTime, LocalDateTime] = {
    super.valuesRow.asInstanceOf[ Row9[Integer, Integer, LocalDate, LocalDate, Boolean, Integer, String, LocalDateTime, LocalDateTime] ]
  }
  override def field1 : Field[Integer] = TwEvent.TW_EVENT.ID
  override def field2 : Field[Integer] = TwEvent.TW_EVENT.USER_ID
  override def field3 : Field[LocalDate] = TwEvent.TW_EVENT.START_DATE
  override def field4 : Field[LocalDate] = TwEvent.TW_EVENT.END_DATE
  override def field5 : Field[Boolean] = TwEvent.TW_EVENT.ALL_DAY_EVENT
  override def field6 : Field[Integer] = TwEvent.TW_EVENT.TYPE
  override def field7 : Field[String] = TwEvent.TW_EVENT.DESCRIPTION
  override def field8 : Field[LocalDateTime] = TwEvent.TW_EVENT.CREATED
  override def field9 : Field[LocalDateTime] = TwEvent.TW_EVENT.MODIFIED
  override def value1 : Integer = getId
  override def value2 : Integer = getUserId
  override def value3 : LocalDate = getStartDate
  override def value4 : LocalDate = getEndDate
  override def value5 : Boolean = getAllDayEvent
  override def value6 : Integer = getType
  override def value7 : String = getDescription
  override def value8 : LocalDateTime = getCreated
  override def value9 : LocalDateTime = getModified

  override def value1(value : Integer) : TwEventRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : TwEventRecord = {
    setUserId(value)
    this
  }

  override def value3(value : LocalDate) : TwEventRecord = {
    setStartDate(value)
    this
  }

  override def value4(value : LocalDate) : TwEventRecord = {
    setEndDate(value)
    this
  }

  override def value5(value : Boolean) : TwEventRecord = {
    setAllDayEvent(value)
    this
  }

  override def value6(value : Integer) : TwEventRecord = {
    setType(value)
    this
  }

  override def value7(value : String) : TwEventRecord = {
    setDescription(value)
    this
  }

  override def value8(value : LocalDateTime) : TwEventRecord = {
    setCreated(value)
    this
  }

  override def value9(value : LocalDateTime) : TwEventRecord = {
    setModified(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : LocalDate, value4 : LocalDate, value5 : Boolean, value6 : Integer, value7 : String, value8 : LocalDateTime, value9 : LocalDateTime) : TwEventRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this.value8(value8)
    this.value9(value9)
    this
  }

  /**
   * Create a detached, initialised TwEventRecord
   */
  def this(id : Integer, userId : Integer, startDate : LocalDate, endDate : LocalDate, allDayEvent : Boolean, `type` : Integer, description : String, created : LocalDateTime, modified : LocalDateTime) = {
    this()

    set(0, id)
    set(1, userId)
    set(2, startDate)
    set(3, endDate)
    set(4, allDayEvent)
    set(5, `type`)
    set(6, description)
    set(7, created)
    set(8, modified)
  }
}
