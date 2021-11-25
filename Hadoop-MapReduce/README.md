### HDFS list commands to show all the directories in root "/"
```shell
hdfs dfs -ls /
```

### Create a new directory inside HDFS using mkdir tag.
```shell
hdfs dfs -mkdir -p /user/root
```
### Copy the files to the input path in HDFS.

```shell
hdfs dfs -put <file_name> <path>
```
### Have a look at the content of your input file.
```shell
hdfs dfs -cat <input_file>
```
### Run map reduce job from the path where you have the jar file.
hadoop jar <jar_file_name> <class_name> input output

