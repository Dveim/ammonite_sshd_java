# ammonite_sshd_java

git clone https://github.com/dveim/ammonite_sshd_java
cd ammonite_sshd_java
mvn compile exec:java -Dexec.mainClass="com.company.Main"

In separate console:
ssh repl@localhost -p22222
Password authentication
Password: // empty, just press enter
i = 5
Welcome to the Ammonite Repl 0.8.0
(Scala 2.11.8 Java 1.8.0_92)
i = 6
@ i = 7
@
@ i = 8
@ com.company.Main.i = 666 // ammonite successfully changed it!
i = 9
i = 10
i = 667
