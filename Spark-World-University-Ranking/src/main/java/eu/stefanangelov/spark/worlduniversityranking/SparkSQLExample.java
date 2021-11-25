package eu.stefanangelov.spark.worlduniversityranking;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkSQLExample {

    private static final String APP_NAME = "CARS_APPLICATION";
    private static final String MASTER = "local";
    private static final String FILE_NAME = "cars.json";

    public static void main(String[] args) {
        SparkConf sconf = new SparkConf().setAppName(APP_NAME) .setMaster(MASTER);
        SparkSession spark = SparkSession.builder() .config(sconf) .getOrCreate();
        Dataset<Row> carsBaseDF = spark.read() .json(FILE_NAME);
        carsBaseDF.show();
    }
}
