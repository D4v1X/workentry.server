/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.records


import java.lang.Integer
import java.lang.String
import java.time.LocalDate
import java.time.LocalDateTime

import javax.annotation.Generated

import models.jooq.tables.TmUserContract

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
class TmUserContractRecord extends UpdatableRecordImpl[TmUserContractRecord](TmUserContract.TM_USER_CONTRACT) with Record9[Integer, Integer, String, Integer, Integer, LocalDate, LocalDate, LocalDateTime, LocalDateTime] {

  /**
   * Setter for <code>workentry_schema.tm_user_contract.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.user_id</code>.
   */
  def setUserId(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.user_id</code>.
   */
  def getUserId : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.description</code>.
   */
  def setDescription(value : String) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.description</code>.
   */
  def getDescription : String = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[String]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.hours_per_week</code>.
   */
  def setHoursPerWeek(value : Integer) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.hours_per_week</code>.
   */
  def getHoursPerWeek : Integer = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.days_per_week</code>.
   */
  def setDaysPerWeek(value : Integer) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.days_per_week</code>.
   */
  def getDaysPerWeek : Integer = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.start_date</code>.
   */
  def setStartDate(value : LocalDate) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.start_date</code>.
   */
  def getStartDate : LocalDate = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[LocalDate]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.end_date</code>.
   */
  def setEndDate(value : LocalDate) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.end_date</code>.
   */
  def getEndDate : LocalDate = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[LocalDate]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.created</code>.
   */
  def setCreated(value : LocalDateTime) : Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.created</code>.
   */
  def getCreated : LocalDateTime = {
    val r = get(7)
    if (r == null) null else r.asInstanceOf[LocalDateTime]
  }

  /**
   * Setter for <code>workentry_schema.tm_user_contract.modified</code>.
   */
  def setModified(value : LocalDateTime) : Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>workentry_schema.tm_user_contract.modified</code>.
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

  override def fieldsRow : Row9[Integer, Integer, String, Integer, Integer, LocalDate, LocalDate, LocalDateTime, LocalDateTime] = {
    super.fieldsRow.asInstanceOf[ Row9[Integer, Integer, String, Integer, Integer, LocalDate, LocalDate, LocalDateTime, LocalDateTime] ]
  }

  override def valuesRow : Row9[Integer, Integer, String, Integer, Integer, LocalDate, LocalDate, LocalDateTime, LocalDateTime] = {
    super.valuesRow.asInstanceOf[ Row9[Integer, Integer, String, Integer, Integer, LocalDate, LocalDate, LocalDateTime, LocalDateTime] ]
  }
  override def field1 : Field[Integer] = TmUserContract.TM_USER_CONTRACT.ID
  override def field2 : Field[Integer] = TmUserContract.TM_USER_CONTRACT.USER_ID
  override def field3 : Field[String] = TmUserContract.TM_USER_CONTRACT.DESCRIPTION
  override def field4 : Field[Integer] = TmUserContract.TM_USER_CONTRACT.HOURS_PER_WEEK
  override def field5 : Field[Integer] = TmUserContract.TM_USER_CONTRACT.DAYS_PER_WEEK
  override def field6 : Field[LocalDate] = TmUserContract.TM_USER_CONTRACT.START_DATE
  override def field7 : Field[LocalDate] = TmUserContract.TM_USER_CONTRACT.END_DATE
  override def field8 : Field[LocalDateTime] = TmUserContract.TM_USER_CONTRACT.CREATED
  override def field9 : Field[LocalDateTime] = TmUserContract.TM_USER_CONTRACT.MODIFIED
  override def value1 : Integer = getId
  override def value2 : Integer = getUserId
  override def value3 : String = getDescription
  override def value4 : Integer = getHoursPerWeek
  override def value5 : Integer = getDaysPerWeek
  override def value6 : LocalDate = getStartDate
  override def value7 : LocalDate = getEndDate
  override def value8 : LocalDateTime = getCreated
  override def value9 : LocalDateTime = getModified

  override def value1(value : Integer) : TmUserContractRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : TmUserContractRecord = {
    setUserId(value)
    this
  }

  override def value3(value : String) : TmUserContractRecord = {
    setDescription(value)
    this
  }

  override def value4(value : Integer) : TmUserContractRecord = {
    setHoursPerWeek(value)
    this
  }

  override def value5(value : Integer) : TmUserContractRecord = {
    setDaysPerWeek(value)
    this
  }

  override def value6(value : LocalDate) : TmUserContractRecord = {
    setStartDate(value)
    this
  }

  override def value7(value : LocalDate) : TmUserContractRecord = {
    setEndDate(value)
    this
  }

  override def value8(value : LocalDateTime) : TmUserContractRecord = {
    setCreated(value)
    this
  }

  override def value9(value : LocalDateTime) : TmUserContractRecord = {
    setModified(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : String, value4 : Integer, value5 : Integer, value6 : LocalDate, value7 : LocalDate, value8 : LocalDateTime, value9 : LocalDateTime) : TmUserContractRecord = {
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
   * Create a detached, initialised TmUserContractRecord
   */
  def this(id : Integer, userId : Integer, description : String, hoursPerWeek : Integer, daysPerWeek : Integer, startDate : LocalDate, endDate : LocalDate, created : LocalDateTime, modified : LocalDateTime) = {
    this()

    set(0, id)
    set(1, userId)
    set(2, description)
    set(3, hoursPerWeek)
    set(4, daysPerWeek)
    set(5, startDate)
    set(6, endDate)
    set(7, created)
    set(8, modified)
  }
}
