/**
 * This class is generated by jOOQ
 */
package models.jooq


import java.lang.Integer

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
import models.jooq.tables.records.ThWorklogRecord
import models.jooq.tables.records.TmEventTypeRecord
import models.jooq.tables.records.TmRoleRecord
import models.jooq.tables.records.TmUserContractRecord
import models.jooq.tables.records.TmUserRecord
import models.jooq.tables.records.TwEventRecord
import models.jooq.tables.records.TwNewsRecord
import models.jooq.tables.records.TwUserRoleRecord
import models.jooq.tables.records.TwWorklogRecord
import models.jooq.tables.records.TwYearlyBalanceRecord

import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.UniqueKey
import org.jooq.impl.AbstractKeys

import scala.Array


/**
 * A class modelling foreign key relationships between tables of the <code>workentry_schema</code> 
 * schema
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.8.6"
  ),
  comments = "This class is generated by jOOQ"
)
object Keys {

  // -------------------------------------------------------------------------
  // IDENTITY definitions
  // -------------------------------------------------------------------------

  val IDENTITY_TH_WORKLOG = Identities0.IDENTITY_TH_WORKLOG
  val IDENTITY_TM_EVENT_TYPE = Identities0.IDENTITY_TM_EVENT_TYPE
  val IDENTITY_TM_ROLE = Identities0.IDENTITY_TM_ROLE
  val IDENTITY_TM_USER = Identities0.IDENTITY_TM_USER
  val IDENTITY_TM_USER_CONTRACT = Identities0.IDENTITY_TM_USER_CONTRACT
  val IDENTITY_TW_EVENT = Identities0.IDENTITY_TW_EVENT
  val IDENTITY_TW_NEWS = Identities0.IDENTITY_TW_NEWS
  val IDENTITY_TW_USER_ROLE = Identities0.IDENTITY_TW_USER_ROLE
  val IDENTITY_TW_WORKLOG = Identities0.IDENTITY_TW_WORKLOG
  val IDENTITY_TW_YEARLY_BALANCE = Identities0.IDENTITY_TW_YEARLY_BALANCE

  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  val TH_WORKLOG_PKEY = UniqueKeys0.TH_WORKLOG_PKEY
  val TM_EVENT_TYPE_PKEY = UniqueKeys0.TM_EVENT_TYPE_PKEY
  val TM_EVENT_TYPE_NAME_KEY = UniqueKeys0.TM_EVENT_TYPE_NAME_KEY
  val TM_ROLE_PKEY = UniqueKeys0.TM_ROLE_PKEY
  val TM_ROLE_NAME_KEY = UniqueKeys0.TM_ROLE_NAME_KEY
  val TM_USER_PKEY = UniqueKeys0.TM_USER_PKEY
  val TM_USER_NIF_KEY = UniqueKeys0.TM_USER_NIF_KEY
  val TM_USER_AFILIATION_NO_KEY = UniqueKeys0.TM_USER_AFILIATION_NO_KEY
  val TM_USER_LOGIN_NAME_KEY = UniqueKeys0.TM_USER_LOGIN_NAME_KEY
  val TM_USER_CONTRACT_PKEY = UniqueKeys0.TM_USER_CONTRACT_PKEY
  val TW_EVENT_PKEY = UniqueKeys0.TW_EVENT_PKEY
  val TW_NEWS_PKEY = UniqueKeys0.TW_NEWS_PKEY
  val TW_USER_ROLE_PKEY = UniqueKeys0.TW_USER_ROLE_PKEY
  val TW_WORKLOG_PKEY = UniqueKeys0.TW_WORKLOG_PKEY
  val TW_YEARLY_BALANCE_PKEY = UniqueKeys0.TW_YEARLY_BALANCE_PKEY

  // -------------------------------------------------------------------------
  // FOREIGN KEY definitions
  // -------------------------------------------------------------------------

  val TH_WORKLOG__TH_WORKLOG_WORKLOG_ID_FKEY = ForeignKeys0.TH_WORKLOG__TH_WORKLOG_WORKLOG_ID_FKEY
  val TH_WORKLOG__TH_WORKLOG_USER_ID_FKEY = ForeignKeys0.TH_WORKLOG__TH_WORKLOG_USER_ID_FKEY
  val TH_WORKLOG__TH_WORKLOG_UPDATE_BY_FKEY = ForeignKeys0.TH_WORKLOG__TH_WORKLOG_UPDATE_BY_FKEY
  val TM_USER_CONTRACT__TM_USER_CONTRACT_USER_ID_FKEY = ForeignKeys0.TM_USER_CONTRACT__TM_USER_CONTRACT_USER_ID_FKEY
  val TW_EVENT__TW_EVENT_USER_ID_FKEY = ForeignKeys0.TW_EVENT__TW_EVENT_USER_ID_FKEY
  val TW_EVENT__TW_EVENT_TYPE_FKEY = ForeignKeys0.TW_EVENT__TW_EVENT_TYPE_FKEY
  val TW_NEWS__TW_NEWS_AUTHOR_ID_FKEY = ForeignKeys0.TW_NEWS__TW_NEWS_AUTHOR_ID_FKEY
  val TW_USER_ROLE__TW_USER_ROLE_USER_ID_FKEY = ForeignKeys0.TW_USER_ROLE__TW_USER_ROLE_USER_ID_FKEY
  val TW_USER_ROLE__TW_USER_ROLE_ROLE_ID_FKEY = ForeignKeys0.TW_USER_ROLE__TW_USER_ROLE_ROLE_ID_FKEY
  val TW_WORKLOG__TW_WORKLOG_USER_ID_FKEY = ForeignKeys0.TW_WORKLOG__TW_WORKLOG_USER_ID_FKEY
  val TW_WORKLOG__TW_WORKLOG_UPDATE_BY_FKEY = ForeignKeys0.TW_WORKLOG__TW_WORKLOG_UPDATE_BY_FKEY
  val TW_YEARLY_BALANCE__TW_YEARLY_BALANCE_USER_ID_FKEY = ForeignKeys0.TW_YEARLY_BALANCE__TW_YEARLY_BALANCE_USER_ID_FKEY

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private object Identities0 extends AbstractKeys {
    val IDENTITY_TH_WORKLOG : Identity[ThWorklogRecord, Integer] = AbstractKeys.createIdentity(ThWorklog.TH_WORKLOG, ThWorklog.TH_WORKLOG.ID)
    val IDENTITY_TM_EVENT_TYPE : Identity[TmEventTypeRecord, Integer] = AbstractKeys.createIdentity(TmEventType.TM_EVENT_TYPE, TmEventType.TM_EVENT_TYPE.ID)
    val IDENTITY_TM_ROLE : Identity[TmRoleRecord, Integer] = AbstractKeys.createIdentity(TmRole.TM_ROLE, TmRole.TM_ROLE.ID)
    val IDENTITY_TM_USER : Identity[TmUserRecord, Integer] = AbstractKeys.createIdentity(TmUser.TM_USER, TmUser.TM_USER.ID)
    val IDENTITY_TM_USER_CONTRACT : Identity[TmUserContractRecord, Integer] = AbstractKeys.createIdentity(TmUserContract.TM_USER_CONTRACT, TmUserContract.TM_USER_CONTRACT.ID)
    val IDENTITY_TW_EVENT : Identity[TwEventRecord, Integer] = AbstractKeys.createIdentity(TwEvent.TW_EVENT, TwEvent.TW_EVENT.ID)
    val IDENTITY_TW_NEWS : Identity[TwNewsRecord, Integer] = AbstractKeys.createIdentity(TwNews.TW_NEWS, TwNews.TW_NEWS.ID)
    val IDENTITY_TW_USER_ROLE : Identity[TwUserRoleRecord, Integer] = AbstractKeys.createIdentity(TwUserRole.TW_USER_ROLE, TwUserRole.TW_USER_ROLE.ID)
    val IDENTITY_TW_WORKLOG : Identity[TwWorklogRecord, Integer] = AbstractKeys.createIdentity(TwWorklog.TW_WORKLOG, TwWorklog.TW_WORKLOG.ID)
    val IDENTITY_TW_YEARLY_BALANCE : Identity[TwYearlyBalanceRecord, Integer] = AbstractKeys.createIdentity(TwYearlyBalance.TW_YEARLY_BALANCE, TwYearlyBalance.TW_YEARLY_BALANCE.ID)
  }

  private object UniqueKeys0 extends AbstractKeys {
    val TH_WORKLOG_PKEY : UniqueKey[ThWorklogRecord] = AbstractKeys.createUniqueKey(ThWorklog.TH_WORKLOG, "th_worklog_pkey", ThWorklog.TH_WORKLOG.ID)
    val TM_EVENT_TYPE_PKEY : UniqueKey[TmEventTypeRecord] = AbstractKeys.createUniqueKey(TmEventType.TM_EVENT_TYPE, "tm_event_type_pkey", TmEventType.TM_EVENT_TYPE.ID)
    val TM_EVENT_TYPE_NAME_KEY : UniqueKey[TmEventTypeRecord] = AbstractKeys.createUniqueKey(TmEventType.TM_EVENT_TYPE, "tm_event_type_name_key", TmEventType.TM_EVENT_TYPE.NAME)
    val TM_ROLE_PKEY : UniqueKey[TmRoleRecord] = AbstractKeys.createUniqueKey(TmRole.TM_ROLE, "tm_role_pkey", TmRole.TM_ROLE.ID)
    val TM_ROLE_NAME_KEY : UniqueKey[TmRoleRecord] = AbstractKeys.createUniqueKey(TmRole.TM_ROLE, "tm_role_name_key", TmRole.TM_ROLE.NAME)
    val TM_USER_PKEY : UniqueKey[TmUserRecord] = AbstractKeys.createUniqueKey(TmUser.TM_USER, "tm_user_pkey", TmUser.TM_USER.ID)
    val TM_USER_NIF_KEY : UniqueKey[TmUserRecord] = AbstractKeys.createUniqueKey(TmUser.TM_USER, "tm_user_nif_key", TmUser.TM_USER.NIF)
    val TM_USER_AFILIATION_NO_KEY : UniqueKey[TmUserRecord] = AbstractKeys.createUniqueKey(TmUser.TM_USER, "tm_user_afiliation_no_key", TmUser.TM_USER.AFILIATION_NO)
    val TM_USER_LOGIN_NAME_KEY : UniqueKey[TmUserRecord] = AbstractKeys.createUniqueKey(TmUser.TM_USER, "tm_user_login_name_key", TmUser.TM_USER.LOGIN_NAME)
    val TM_USER_CONTRACT_PKEY : UniqueKey[TmUserContractRecord] = AbstractKeys.createUniqueKey(TmUserContract.TM_USER_CONTRACT, "tm_user_contract_pkey", TmUserContract.TM_USER_CONTRACT.ID)
    val TW_EVENT_PKEY : UniqueKey[TwEventRecord] = AbstractKeys.createUniqueKey(TwEvent.TW_EVENT, "tw_event_pkey", TwEvent.TW_EVENT.ID)
    val TW_NEWS_PKEY : UniqueKey[TwNewsRecord] = AbstractKeys.createUniqueKey(TwNews.TW_NEWS, "tw_news_pkey", TwNews.TW_NEWS.ID)
    val TW_USER_ROLE_PKEY : UniqueKey[TwUserRoleRecord] = AbstractKeys.createUniqueKey(TwUserRole.TW_USER_ROLE, "tw_user_role_pkey", TwUserRole.TW_USER_ROLE.ID)
    val TW_WORKLOG_PKEY : UniqueKey[TwWorklogRecord] = AbstractKeys.createUniqueKey(TwWorklog.TW_WORKLOG, "tw_worklog_pkey", TwWorklog.TW_WORKLOG.ID)
    val TW_YEARLY_BALANCE_PKEY : UniqueKey[TwYearlyBalanceRecord] = AbstractKeys.createUniqueKey(TwYearlyBalance.TW_YEARLY_BALANCE, "tw_yearly_balance_pkey", TwYearlyBalance.TW_YEARLY_BALANCE.ID)
  }

  private object ForeignKeys0 extends AbstractKeys {
    val TH_WORKLOG__TH_WORKLOG_WORKLOG_ID_FKEY : ForeignKey[ThWorklogRecord, TwWorklogRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TW_WORKLOG_PKEY, ThWorklog.TH_WORKLOG, "th_worklog__th_worklog_worklog_id_fkey", ThWorklog.TH_WORKLOG.WORKLOG_ID)
    val TH_WORKLOG__TH_WORKLOG_USER_ID_FKEY : ForeignKey[ThWorklogRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, ThWorklog.TH_WORKLOG, "th_worklog__th_worklog_user_id_fkey", ThWorklog.TH_WORKLOG.USER_ID)
    val TH_WORKLOG__TH_WORKLOG_UPDATE_BY_FKEY : ForeignKey[ThWorklogRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, ThWorklog.TH_WORKLOG, "th_worklog__th_worklog_update_by_fkey", ThWorklog.TH_WORKLOG.UPDATE_BY)
    val TM_USER_CONTRACT__TM_USER_CONTRACT_USER_ID_FKEY : ForeignKey[TmUserContractRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TmUserContract.TM_USER_CONTRACT, "tm_user_contract__tm_user_contract_user_id_fkey", TmUserContract.TM_USER_CONTRACT.USER_ID)
    val TW_EVENT__TW_EVENT_USER_ID_FKEY : ForeignKey[TwEventRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwEvent.TW_EVENT, "tw_event__tw_event_user_id_fkey", TwEvent.TW_EVENT.USER_ID)
    val TW_EVENT__TW_EVENT_TYPE_FKEY : ForeignKey[TwEventRecord, TmEventTypeRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_EVENT_TYPE_PKEY, TwEvent.TW_EVENT, "tw_event__tw_event_type_fkey", TwEvent.TW_EVENT.TYPE)
    val TW_NEWS__TW_NEWS_AUTHOR_ID_FKEY : ForeignKey[TwNewsRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwNews.TW_NEWS, "tw_news__tw_news_author_id_fkey", TwNews.TW_NEWS.AUTHOR_ID)
    val TW_USER_ROLE__TW_USER_ROLE_USER_ID_FKEY : ForeignKey[TwUserRoleRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwUserRole.TW_USER_ROLE, "tw_user_role__tw_user_role_user_id_fkey", TwUserRole.TW_USER_ROLE.USER_ID)
    val TW_USER_ROLE__TW_USER_ROLE_ROLE_ID_FKEY : ForeignKey[TwUserRoleRecord, TmRoleRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_ROLE_PKEY, TwUserRole.TW_USER_ROLE, "tw_user_role__tw_user_role_role_id_fkey", TwUserRole.TW_USER_ROLE.ROLE_ID)
    val TW_WORKLOG__TW_WORKLOG_USER_ID_FKEY : ForeignKey[TwWorklogRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwWorklog.TW_WORKLOG, "tw_worklog__tw_worklog_user_id_fkey", TwWorklog.TW_WORKLOG.USER_ID)
    val TW_WORKLOG__TW_WORKLOG_UPDATE_BY_FKEY : ForeignKey[TwWorklogRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwWorklog.TW_WORKLOG, "tw_worklog__tw_worklog_update_by_fkey", TwWorklog.TW_WORKLOG.UPDATE_BY)
    val TW_YEARLY_BALANCE__TW_YEARLY_BALANCE_USER_ID_FKEY : ForeignKey[TwYearlyBalanceRecord, TmUserRecord] = AbstractKeys.createForeignKey(models.jooq.Keys.TM_USER_PKEY, TwYearlyBalance.TW_YEARLY_BALANCE, "tw_yearly_balance__tw_yearly_balance_user_id_fkey", TwYearlyBalance.TW_YEARLY_BALANCE.USER_ID)
  }
}
