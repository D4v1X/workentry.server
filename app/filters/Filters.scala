package filters

import javax.inject._

import play.api.http.DefaultHttpFilters
import play.filters.cors.CORSFilter
import play.filters.gzip.GzipFilter

/**
 * This class configures filters that run on every request. This
 * class is queried by Play to get a list of filters.
 *
 * Play will automatically use filters from any class called
 * `filters.Filters` that is placed the root package. You can load filters
 * from a different class by adding a `play.http.filters` setting to
 * the `application.conf` configuration file.
 */
@Singleton
class Filters @Inject()(corsFilter: CORSFilter, gzipFilter: GzipFilter) extends DefaultHttpFilters(corsFilter, gzipFilter)
