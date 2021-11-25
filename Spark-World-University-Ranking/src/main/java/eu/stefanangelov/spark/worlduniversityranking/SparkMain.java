package eu.stefanangelov.spark.worlduniversityranking;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkMain {
    private static final String APP_NAME = "WORLD_UNIVERSITY_RANKING";
    private static final String MASTER = "local";
    private static final String FILE_NAME = "timesData.csv";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName(APP_NAME)
                .setMaster(MASTER);
        JavaSparkContext sc  = new JavaSparkContext();

        JavaRDD<String> rowRdd = sc.textFile(FILE_NAME);
        System.out.println("COUNT:"+rowRdd.filter(x -> x.contains("United Kingdom")).count());
    }
}
