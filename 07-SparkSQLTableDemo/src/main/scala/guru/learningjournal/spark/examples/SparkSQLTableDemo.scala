package guru.learningjournal.spark.examples

import org.apache.log4j.Logger
import org.apache.spark.sql.{SaveMode, SparkSession}

object SparkSQLTableDemo extends Serializable {
  @transient lazy val logger: Logger = Logger.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark SQL Table Demo")
      .master("local[3]")
      .enableHiveSupport()
      .getOrCreate()

    val flightTimeParquetDF = spark.read
      .format("parquet")
      .option("path", "dataSource/")
      .load()

    import spark.sql
    sql("CREATE DATABASE IF NOT EXISTS AIRLINE_DB")
//    sql("USE AIRLINE_DB")

    spark.catalog.setCurrentDatabase("AIRLINE_DB")

    flightTimeParquetDF.write
      .mode(SaveMode.Overwrite)
      .format("parquet")
//      .format("csv")
//      .partitionBy("ORIGIN", "OP_CARRIER")
      .bucketBy(5, "ORIGIN", "OP_CARRIER")
      .sortBy("ORIGIN", "OP_CARRIER")
      .saveAsTable("AIRLINE_DB.flight_data")

    spark.catalog.listTables("AIRLINE_DB").show()

    logger.info("Finished.")
    spark.stop()
  }

}
