# graph
Kotlin Neo4j Graph Issue 

org.springframework.boot - version "2.4.4"
kotlin - version "1.4.31"

This is an example of Kotlin Spring Data code which executes erratically.

When it does execute without error, the node 'c1' is strangely produced twice in the graph with two different ids.
When it does not execute, an exception is thrown on the save command.

Caused by: java.util.NoSuchElementException: No value present
	at java.base/java.util.Optional.get(Optional.java:148) ~[na:na]
  
