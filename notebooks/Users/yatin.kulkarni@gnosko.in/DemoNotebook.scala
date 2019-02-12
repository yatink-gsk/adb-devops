// Databricks notebook source
// This is a comment
// Take a look at the file system
display(dbutils.fs.ls("/databricks-datasets/samples/docs/"))

// Setup the textFile RDD to read the README.md file
//   Note this is lazy 
val textFile = sc.textFile("/databricks-datasets/samples/docs/README.md")

// When performing an action (like a count) this is when the textFile is read and aggregate calculated
//    Click on [View] to see the stages and executors
textFile.count()

