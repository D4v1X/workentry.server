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
import models.jooq.tables.records.TwUserRoleRecord

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


object TwUserRole {

  /**
   * The reference instance of <code>workentry_schema.tw_user_role</code>
   */
  val TW_USER_ROLE = new TwUserRole
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
class TwUserRole(alias : String, aliased : Table[TwUserRoleRecord], parameters : Array[ Field[_] ]) extends TableImpl[TwUserRoleRecord](alias, WorkentrySchema.WORKENTRY_SCHEMA, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TwUserRoleRecord] = {
    classOf[TwUserRoleRecord]
  }

  /**
   * The column <code>workentry_schema.tw_user_role.id</code>.
   */
  val ID : TableField[TwUserRoleRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('workentry_schema.tw_user_role_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), "")

  /**
   * The column <code>workentry_schema.tw_user_role.user_id</code>.
   */
  val USER_ID : TableField[TwUserRoleRecord, Integer] = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>workentry_schema.tw_user_role.role_id</code>.
   */
  val ROLE_ID : TableField[TwUserRoleRecord, Integer] = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>workentry_schema.tw_user_role.created</code>.
   */
  val CREATED : TableField[TwUserRoleRecord, LocalDateTime] = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), "", new TimestampToLocalDateTimeConverter())

  /**
   * The column <code>workentry_schema.tw_user_role.modified</code>.
   */
  val MODIFIED : TableField[TwUserRoleRecord, LocalDateTime] = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), "", new TimestampToLocalDateTimeConverter())

  /**
   * Create a <code>workentry_schema.tw_user_role</code> table reference
   */
  def this() = {
    this("tw_user_role", null, null)
  }

  /**
   * Create an aliased <code>workentry_schema.tw_user_role</code> table reference
   */
  def this(alias : String) = {
    this(alias, models.jooq.tables.TwUserRole.TW_USER_ROLE, null)
  }

  private def this(alias : String, aliased : Table[TwUserRoleRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = WorkentrySchema.WORKENTRY_SCHEMA

  override def getIdentity : Identity[TwUserRoleRecord, Integer] = {
    Keys.IDENTITY_TW_USER_ROLE
  }

  override def getPrimaryKey : UniqueKey[TwUserRoleRecord] = {
    Keys.TW_USER_ROLE_PKEY
  }

  override def getKeys : List[ UniqueKey[TwUserRoleRecord] ] = {
    return Arrays.asList[ UniqueKey[TwUserRoleRecord] ](Keys.TW_USER_ROLE_PKEY)
  }

  override def getReferences : List[ ForeignKey[TwUserRoleRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TwUserRoleRecord, _] ](Keys.TW_USER_ROLE__TW_USER_ROLE_USER_ID_FKEY, Keys.TW_USER_ROLE__TW_USER_ROLE_ROLE_ID_FKEY)
  }

  override def as(alias : String) : TwUserRole = {
    new TwUserRole(alias, this)
  }

  /**
   * Rename this table
   */
  def rename(name : String) : TwUserRole = {
    new TwUserRole(name, null)
  }
}
