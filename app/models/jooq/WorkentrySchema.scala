/*
 * This file is generated by jOOQ.
*/
package models.jooq


import java.util.ArrayList
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.jooq.tables.ThWorklog
import models.jooq.tables.TmEventType
import models.jooq.tables.TmRole
import models.jooq.tables.TmUser
import models.jooq.tables.TmUserContract
import models.jooq.tables.TwEvent
import models.jooq.tables.TwNews
import models.jooq.tables.TwUserRole
import models.jooq.tables.TwWorklog
import models.jooq.tables.TwYearlyBalance

import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl

import scala.Array


object WorkentrySchema {

  /**
   * The reference instance of <code>workentry_schema</code>
   */
  val WORKENTRY_SCHEMA = new WorkentrySchema
}

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
class WorkentrySchema extends SchemaImpl("workentry_schema", DefaultCatalog.DEFAULT_CATALOG) {

  override def getCatalog : Catalog = DefaultCatalog.DEFAULT_CATALOG

  override def getSequences : List[Sequence[_]] = {
    val result = new ArrayList[Sequence[_]]
    result.addAll(getSequences0)
    result
  }

  private def getSequences0(): List[Sequence[_]] = {
    return Arrays.asList[Sequence[_]](
      Sequences.TH_WORKLOG_ID_SEQ,
      Sequences.TM_EVENT_TYPE_ID_SEQ,
      Sequences.TM_ROLE_ID_SEQ,
      Sequences.TM_USER_CONTRACT_ID_SEQ,
      Sequences.TM_USER_ID_SEQ,
      Sequences.TW_EVENT_ID_SEQ,
      Sequences.TW_NEWS_ID_SEQ,
      Sequences.TW_USER_ROLE_ID_SEQ,
      Sequences.TW_WORKLOG_ID_SEQ,
      Sequences.TW_YEARLY_BALANCE_ID_SEQ)
  }

  override def getTables : List[Table[_]] = {
    val result = new ArrayList[Table[_]]
    result.addAll(getTables0)
    result
  }

  private def getTables0(): List[Table[_]] = {
    return Arrays.asList[Table[_]](
      ThWorklog.TH_WORKLOG,
      TmEventType.TM_EVENT_TYPE,
      TmRole.TM_ROLE,
      TmUser.TM_USER,
      TmUserContract.TM_USER_CONTRACT,
      TwEvent.TW_EVENT,
      TwNews.TW_NEWS,
      TwUserRole.TW_USER_ROLE,
      TwWorklog.TW_WORKLOG,
      TwYearlyBalance.TW_YEARLY_BALANCE)
  }
}
