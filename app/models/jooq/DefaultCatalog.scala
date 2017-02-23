/*
 * This file is generated by jOOQ.
*/
package models.jooq


import java.util.ArrayList
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Schema
import org.jooq.impl.CatalogImpl

import scala.Array


object DefaultCatalog {

  /**
   * The reference instance of <code></code>
   */
  val DEFAULT_CATALOG = new DefaultCatalog
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
class DefaultCatalog extends CatalogImpl("") {

  /**
   * The schema <code>workentry_schema</code>.
   */
  val WORKENTRY_SCHEMA = models.jooq.WorkentrySchema.WORKENTRY_SCHEMA

  override def getSchemas : List[Schema] = {
    val result = new ArrayList[Schema]
    result.addAll(getSchemas0)
    result
  }

  private def getSchemas0(): List[Schema] = {
    return Arrays.asList[Schema](
      WorkentrySchema.WORKENTRY_SCHEMA)
  }
}
