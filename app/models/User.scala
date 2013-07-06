package models

import java.util.Date
import org.squeryl.KeyedEntity
import org.squeryl.annotations.Column

case class User(
                  name: String,
                  email: String,
                  password: String,
                  createDate: Date
             ) extends KeyedEntity[Long] {

  val id: Long = 0
}

