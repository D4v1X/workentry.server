/**
 * This class is generated by jOOQ
 */
package models.jooq.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.time.LocalDateTime
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.jooq.Keys
import models.jooq.WorkentrySchema
import models.jooq.tables.records.TwNewsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl

import scala.Array

import utils.jooq.converters.TimestampToLocalDateTimeConverter


object TwNews {

  /**
   * The reference instance of <code>workentry_schema.tw_news</code>
   */
  val TW_NEWS = new TwNews
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.8.6"
  ),
  comments = "This class is generated by jOOQ"
)
class TwNews(alias : String, aliased : Table[TwNewsRecord], parameters : Array[ Field[_] ]) extends TableImpl[TwNewsRecord](alias, WorkentrySchema.WORKENTRY_SCHEMA, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TwNewsRecord] = {
    classOf[TwNewsRecord]
  }

  /**
   * The column <code>workentry_schema.tw_news.id</code>.
   */
  val ID : TableField[TwNewsRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('workentry_schema.tw_news_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * The column <code>workentry_schema.tw_news.title</code>.
   */
  val TITLE : TableField[TwNewsRecord, String] = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), "")

  /**
   * The column <code>workentry_schema.tw_news.body</code>.
   */
  val BODY : TableField[TwNewsRecord, String] = createField("body", org.jooq.impl.SQLDataType.VARCHAR.length(4000), "")

  /**
   * The column <code>workentry_schema.tw_news.author_id</code>.
   */
  val AUTHOR_ID : TableField[TwNewsRecord, Integer] = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>workentry_schema.tw_news.created</code>.
   */
  val CREATED : TableField[TwNewsRecord, LocalDateTime] = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), "", new TimestampToLocalDateTimeConverter())

  /**
   * The column <code>workentry_schema.tw_news.modified</code>.
   */
  val MODIFIED : TableField[TwNewsRecord, LocalDateTime] = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), "", new TimestampToLocalDateTimeConverter())

  /**
   * Create a <code>workentry_schema.tw_news</code> table reference
   */
  def this() = {
    this("tw_news", null, null)
  }

  /**
   * Create an aliased <code>workentry_schema.tw_news</code> table reference
   */
  def this(alias : String) = {
    this(alias, models.jooq.tables.TwNews.TW_NEWS, null)
  }

  private def this(alias : String, aliased : Table[TwNewsRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = WorkentrySchema.WORKENTRY_SCHEMA

  override def getIdentity : Identity[TwNewsRecord, Integer] = {
    Keys.IDENTITY_TW_NEWS
  }

  override def getPrimaryKey : UniqueKey[TwNewsRecord] = {
    Keys.TW_NEWS_PKEY
  }

  override def getKeys : List[ UniqueKey[TwNewsRecord] ] = {
    return Arrays.asList[ UniqueKey[TwNewsRecord] ](Keys.TW_NEWS_PKEY)
  }

  override def getReferences : List[ ForeignKey[TwNewsRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TwNewsRecord, _] ](Keys.TW_NEWS__TW_NEWS_AUTHOR_ID_FKEY)
  }

  override def as(alias : String) : TwNews = {
    new TwNews(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : TwNews = {
    new TwNews(name, null)
  }
}
