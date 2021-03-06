/*
 * This file is generated by jOOQ.
*/
package models.jooq.tables.daos


import java.lang.Integer
import java.lang.String
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.List

import javax.annotation.Generated

import models.jooq.tables.TmUserContract
import models.jooq.tables.records.TmUserContractRecord

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
class TmUserContractDao(configuration : Configuration) extends DAOImpl[TmUserContractRecord, models.pojos.TmUserContract, Integer](TmUserContract.TM_USER_CONTRACT, classOf[models.pojos.TmUserContract], configuration) {

  /**
   * Create a new TmUserContractDao without any configuration
   */
  def this() = {
    this(null)
  }

  override protected def getId(o : models.pojos.TmUserContract) : Integer = {
    o.getId
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  def fetchById(values : Integer*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.ID, values:_*)
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  def fetchOneById(value : Integer) : models.pojos.TmUserContract = {
    fetchOne(TmUserContract.TM_USER_CONTRACT.ID, value)
  }

  /**
   * Fetch records that have <code>user_id IN (values)</code>
   */
  def fetchByUserId(values : Integer*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.USER_ID, values:_*)
  }

  /**
   * Fetch records that have <code>description IN (values)</code>
   */
  def fetchByDescription(values : String*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.DESCRIPTION, values:_*)
  }

  /**
   * Fetch records that have <code>hours_per_week IN (values)</code>
   */
  def fetchByHoursPerWeek(values : Integer*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.HOURS_PER_WEEK, values:_*)
  }

  /**
   * Fetch records that have <code>days_per_week IN (values)</code>
   */
  def fetchByDaysPerWeek(values : Integer*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.DAYS_PER_WEEK, values:_*)
  }

  /**
   * Fetch records that have <code>start_date IN (values)</code>
   */
  def fetchByStartDate(values : LocalDate*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.START_DATE, values:_*)
  }

  /**
   * Fetch records that have <code>end_date IN (values)</code>
   */
  def fetchByEndDate(values : LocalDate*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.END_DATE, values:_*)
  }

  /**
   * Fetch records that have <code>created IN (values)</code>
   */
  def fetchByCreated(values : LocalDateTime*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.CREATED, values:_*)
  }

  /**
   * Fetch records that have <code>modified IN (values)</code>
   */
  def fetchByModified(values : LocalDateTime*) : List[models.pojos.TmUserContract] = {
    fetch(TmUserContract.TM_USER_CONTRACT.MODIFIED, values:_*)
  }
}
