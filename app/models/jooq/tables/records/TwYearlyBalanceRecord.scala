/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.records


import java.lang.Integer
import java.math.BigDecimal
import java.time.LocalDateTime

import javax.annotation.Generated

import models.jooq.tables.TwYearlyBalance

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
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
class TwYearlyBalanceRecord extends UpdatableRecordImpl[TwYearlyBalanceRecord](TwYearlyBalance.TW_YEARLY_BALANCE) with Record7[Integer, Integer, Integer, BigDecimal, BigDecimal, LocalDateTime, LocalDateTime] {

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.id</code>.
   */
  def setId(value : Integer) : Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.id</code>.
   */
  def getId : Integer = {
    val r = get(0)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.user_id</code>.
   */
  def setUserId(value : Integer) : Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.user_id</code>.
   */
  def getUserId : Integer = {
    val r = get(1)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.year</code>.
   */
  def setYear(value : Integer) : Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.year</code>.
   */
  def getYear : Integer = {
    val r = get(2)
    if (r == null) null else r.asInstanceOf[Integer]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.hour_balance</code>.
   */
  def setHourBalance(value : BigDecimal) : Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.hour_balance</code>.
   */
  def getHourBalance : BigDecimal = {
    val r = get(3)
    if (r == null) null else r.asInstanceOf[BigDecimal]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.vacation_balance</code>.
   */
  def setVacationBalance(value : BigDecimal) : Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.vacation_balance</code>.
   */
  def getVacationBalance : BigDecimal = {
    val r = get(4)
    if (r == null) null else r.asInstanceOf[BigDecimal]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.created</code>.
   */
  def setCreated(value : LocalDateTime) : Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.created</code>.
   */
  def getCreated : LocalDateTime = {
    val r = get(5)
    if (r == null) null else r.asInstanceOf[LocalDateTime]
  }

  /**
   * Setter for <code>workentry_schema.tw_yearly_balance.modified</code>.
   */
  def setModified(value : LocalDateTime) : Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>workentry_schema.tw_yearly_balance.modified</code>.
   */
  def getModified : LocalDateTime = {
    val r = get(6)
    if (r == null) null else r.asInstanceOf[LocalDateTime]
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------
  override def key : Record1[Integer] = {
    return super.key.asInstanceOf[ Record1[Integer] ]
  }

  // -------------------------------------------------------------------------
  // Record7 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow : Row7[Integer, Integer, Integer, BigDecimal, BigDecimal, LocalDateTime, LocalDateTime] = {
    super.fieldsRow.asInstanceOf[ Row7[Integer, Integer, Integer, BigDecimal, BigDecimal, LocalDateTime, LocalDateTime] ]
  }

  override def valuesRow : Row7[Integer, Integer, Integer, BigDecimal, BigDecimal, LocalDateTime, LocalDateTime] = {
    super.valuesRow.asInstanceOf[ Row7[Integer, Integer, Integer, BigDecimal, BigDecimal, LocalDateTime, LocalDateTime] ]
  }
  override def field1 : Field[Integer] = TwYearlyBalance.TW_YEARLY_BALANCE.ID
  override def field2 : Field[Integer] = TwYearlyBalance.TW_YEARLY_BALANCE.USER_ID
  override def field3 : Field[Integer] = TwYearlyBalance.TW_YEARLY_BALANCE.YEAR
  override def field4 : Field[BigDecimal] = TwYearlyBalance.TW_YEARLY_BALANCE.HOUR_BALANCE
  override def field5 : Field[BigDecimal] = TwYearlyBalance.TW_YEARLY_BALANCE.VACATION_BALANCE
  override def field6 : Field[LocalDateTime] = TwYearlyBalance.TW_YEARLY_BALANCE.CREATED
  override def field7 : Field[LocalDateTime] = TwYearlyBalance.TW_YEARLY_BALANCE.MODIFIED
  override def value1 : Integer = getId
  override def value2 : Integer = getUserId
  override def value3 : Integer = getYear
  override def value4 : BigDecimal = getHourBalance
  override def value5 : BigDecimal = getVacationBalance
  override def value6 : LocalDateTime = getCreated
  override def value7 : LocalDateTime = getModified

  override def value1(value : Integer) : TwYearlyBalanceRecord = {
    setId(value)
    this
  }

  override def value2(value : Integer) : TwYearlyBalanceRecord = {
    setUserId(value)
    this
  }

  override def value3(value : Integer) : TwYearlyBalanceRecord = {
    setYear(value)
    this
  }

  override def value4(value : BigDecimal) : TwYearlyBalanceRecord = {
    setHourBalance(value)
    this
  }

  override def value5(value : BigDecimal) : TwYearlyBalanceRecord = {
    setVacationBalance(value)
    this
  }

  override def value6(value : LocalDateTime) : TwYearlyBalanceRecord = {
    setCreated(value)
    this
  }

  override def value7(value : LocalDateTime) : TwYearlyBalanceRecord = {
    setModified(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : BigDecimal, value5 : BigDecimal, value6 : LocalDateTime, value7 : LocalDateTime) : TwYearlyBalanceRecord = {
    this.value1(value1)
    this.value2(value2)
    this.value3(value3)
    this.value4(value4)
    this.value5(value5)
    this.value6(value6)
    this.value7(value7)
    this
  }

  /**
   * Create a detached, initialised TwYearlyBalanceRecord
   */
  def this(id : Integer, userId : Integer, year : Integer, hourBalance : BigDecimal, vacationBalance : BigDecimal, created : LocalDateTime, modified : LocalDateTime) = {
    this()

    set(0, id)
    set(1, userId)
    set(2, year)
    set(3, hourBalance)
    set(4, vacationBalance)
    set(5, created)
    set(6, modified)
  }
}
