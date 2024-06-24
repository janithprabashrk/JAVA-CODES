file:///C:/Users/USER/Downloads/%23SOLOLEARN/JAVA%20Sololearn/JAVA%20CODES/FloorExample.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\oss.sonatype.org\content\repositories\public\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 696
uri: file:///C:/Users/USER/Downloads/%23SOLOLEARN/JAVA%20Sololearn/JAVA%20CODES/FloorExample.java
text:
```scala
/*Similarly, Math.floor() rounds a floating point value down to the nearest integer value.*/
public class FloorExample {
    public static void main(String[] args) {
      double value1 = 4.3;
      double value2 = -4.3;
      double value3 = 4.0;
      double value4 = -4.0;
      double value5 = 4.999;
  
      System.out.println("Math.floor(4.3) = " + Math.floor(value1));   // 4.0
      System.out.println("Math.floor(-4.3) = " + Math.floor(value2));  // -5.0
      System.out.println("Math.floor(4.0) = " + Math.floor(value3));   // 4.0
      System.out.println("Math.floor(-4.0) = " + Math.floor(value4));  // -4.0
      System.out.println("Math.floor(4.999) = " + Math.floor(@@value5)); // 4.0
    }
  }
  
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
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:380)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator