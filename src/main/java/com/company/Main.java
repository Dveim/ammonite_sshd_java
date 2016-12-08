package com.company;

import ammonite.ops.Path;
import ammonite.sshd.*;

public class Main {
    public static int i = 0;

    static {
        new SshdRepl(
            new SshServerConfig(
                "localhost",
                22222,
                "repl",
                "",
                ammonite.main.Defaults.ammoniteHome(),
                scala.Option$.MODULE$.<Path>empty()
            ),
            "",
            true,
            Path.apply(java.nio.file.Paths.get(System.getProperty("user.home"))),
            scala.collection.immutable.Seq$.MODULE$.empty(),
            SshdRepl.class.getClassLoader()
        ).start();
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            i += 1;
            System.out.println("i = " + i);
            Thread.sleep(1000);
        }
    }
}
