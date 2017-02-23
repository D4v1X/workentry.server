package services

import com.google.inject.ImplementedBy
import models.caseclasses.{TmUserCC, TmUserContractCC}
import models.pojos.{TmUser, TmUserContract}
import services.impl.UserServiceImpl

import scala.concurrent.Future

/**
  * Created by davidsantiago on 16/2/17.
  */
@ImplementedBy(classOf[UserServiceImpl])
trait UserContract {

  /** Find all contract in our application.
    *
    * @return List of the TmUsers
    */
  def findAll(): Future[Seq[TmUserContract]]


  /** Find a contract by id.
    *
    * @param contractId id of the user.
    * @return a TmUser
    */
  def findById(contractId: Int): Future[TmUserContract]

  /** Create a contract with TmUserContractCC information.
    *
    * @param tmUserContractCC user information.
    * @return a TmUser
    */
  def add(tmUserContractCC: TmUserContractCC): Future[Int]

  /** Create a contract with TmUserContractCC information.
    *
    * @param tmUserContractCC user information.
    * @return a TmUser
    */
  def update(tmUserContractCC: TmUserContractCC): Future[Int]

  /** Delete a contract by contract id.
    *
    * @param contractId user id.
    * @return a TmUser
    */
  def delete(contractId: Int): Future[Int]

}
