# Apache Spark 3 - Spark Programming in Scala for Beginners
This is the central repository for all the materials related to <em>Apache Spark 3 - Spark Programming in Scala for Beginners</em> <br>Course by Prashant Pandey.
<br> You can get the full course at <a href="https://www.udemy.com/course/apache-spark-programming-in-scala/?referralCode=BFF37C437A7431C20F14"> 
  Apache Spark Course @ Udemy.
</a>

<div>
<a href="https://www.udemy.com/course/apache-spark-programming-in-scala/?referralCode=BFF37C437A7431C20F14">
<img src="https://www.learningjournal.guru/_resources/img/jpg-5x/spark-beginners-course.jpg" alt="Apache Spark 3 - Spark Programming in Scala for Beginners" width="300" align="left"> 
</a>

<h2> Description </h2>
<p align="justify">
  I am creating <em>Apache Spark 3 - Spark Programming in Scala for Beginners </em>course to help you understand the Spark programming and apply that knowledge to build data engineering solutions. This course is example-driven and follows a working session like approach. We will be taking a live coding approach and explain all the needed concepts along the way.
</p>

<h3>Who should take this Course?</h3>
<p align="justify">
I designed this course for software engineers willing to develop a Data Engineering pipeline and application using the Apache Spark. I am also creating this course for data architects and data engineers who are responsible for designing and building the organization’s data-centric infrastructure. Another group of people is the managers and architects who do not directly work with Spark implementation. Still, they work with the people who implement Apache Spark at the ground level.
</p>

<h3>Kafka and source code version</h3>
<p align="justify">
This Course is using the Apache Spark 3.x. I have tested all the source code and examples used in this Course on Apache Spark 3.0.0 open-source distribution.
</p>

</div>

Commands used:

Must run spark (from docker or command line) prior to running zeppelin from docker.

docker run -it --rm -p 4040:4040 --name spark3.0-centos8 -h localhost leartingjournal?spark:spark3.0-centos8

docker run -u -p 8080:8080 --rm -v c:\logs:/logs -v C:\notebook:/notebook -e ZEPPELIN_LOG_DIR='/logs' -e ZEPPELIN_NOTEBOOK_DIR='/notebook' --name zeppelin apache/zeppelin:0.10.0


Another alternative: clone spark-zeppelin-docker project from github and follow the instructions
Data foldel under the project is mounted under /srv/data.

Spark-shell works on local if SPARK_HOME is set to c:/spark.

