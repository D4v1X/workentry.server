package services

import com.google.inject.ImplementedBy
import models.caseclasses.TmUserCC
import models.pojos.TmUser
import services.impl.UserServiceImpl

import scala.concurrent.Future

/**
  * Created by davidsantiago on 16/2/17.
  */
@ImplementedBy(classOf[UserServiceImpl])
trait UserService {

  /** A person who uses our application.
    *
    * @return List of the TmUsers
    */
  def findAll(): Future[Seq[TmUser]]


  /** Find a user by id.
    *
    * @param userId id of the user.
    * @return a TmUser
    */
  def findById(userId: Int): Future[TmUser]

  /** Create a user with TmUserCC information.
    *
    * @param tmUserCC user information.
    * @return a TmUser
    */
  def add(tmUserCC: TmUserCC): Future[Int]

  /** Create a user with TmUserCC information.
    *
    * @param tmUserCC user information.
    * @return a TmUser
    */
  def update(tmUserCC: TmUserCC): Future[Int]

  /** Delete a user by user id.
    *
    * @param userId user id.
    * @return a TmUser
    */
  def delete(userId: Int): Future[Int]

}
