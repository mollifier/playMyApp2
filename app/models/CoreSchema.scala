package models

import org.squeryl.Schema

object CoreSchema extends Schema {

  val users = table[User]("user")
}

