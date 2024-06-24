file:///C:/Users/USER/Downloads/%23SOLOLEARN/JAVA%20Sololearn/JAVA%20CODES/CeilExample.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\oss.sonatype.org\content\repositories\public\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/USER/Downloads/%23SOLOLEARN/JAVA%20Sololearn/JAVA%20CODES/CeilExample.java
text:
```scala
public class CeilExample {
    public static void main(String[] args) {
      double value1 = 4.3;
      double value2 = -4.3;
      double value3 = 4.0;
      double value4 = -4.0;
      double value5 = 4.999;
  
      System.out.println("Math.ceil(4.3) = " + Math.ceil(value1));   // 5.0
      System.out.println("Math.ceil(-4.3) = " + Math.ceil(value2));  // -4.0
      System.out.println("Math.ceil(4.0) = " + Math.ceil(value3));   // 4.0
      System.out.println("Math.ceil(-4.0) = " + Math.ceil(value4));  // -4.0
      System.out.println("Math.ceil(4.999) = " + Math.ceil(value5)); // 5.0
    }
  }
  
  /*Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double. */
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:28)
	scala.meta.internal.pc.SimpleCollector.<init>(PcCollector.scala:367)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:111)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator