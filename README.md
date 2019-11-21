# Sets
## Description
This repository represents some aspects of Set Theory through object orientation. It all revolves around [Set.java](https://github.com/wknowleskellett/Sets/blob/master/Set.java)
`Set.java` is an interface requiring a single method of `Set` implementations:

```java
public boolean contains(Object a);
```
Everything else in this code is my attempt to stay true to the mathematical perspective of these concepts while implementing them myself. Feel free to dig through it!
## Running
None of the code here has a main method - it's on you to decide what you want to do with this. That being said, let me walk you through an example:
1. To get started, consider making an array of `String`s, such as `String[] my_list = new String[] {"apple", "pear", "salamander"};`, or whatever else you decide.
1. Then, initialize `Set s = new Specific<String>(my_list);` to make the set `s` contain those items.
1. Using `System.out.println("my string" + ": " + s.contains("my string"))`, see if your set contains the items from your list or some other items.
1. Initialize a complement of your set using `Set s_c = new Complement(s);`, and see what happens.
1. What happens when you take the union of a set and its complement?
Uh-oh, does the set contain itself? Hey, you're making me look bad!

## Things to Check Out
- I've implemented the Cantor Set, a famously impossible set, defined to contain 'any set that does not contain itself.' Does the Cantor Set contain itself?
I encourage you to look at the code and guess at what you think will happen, and then test it!
- The longest I have ever laughed in my life was in the few days immediately following programming the Empty Set. Even writing this note, I began to chuckle. Take a look.
- Try initializing a few Unions, Intersections, and Complements of sets.
- Write your own sets! How clever can you be translating real set theory principles into Java? If you come up with something cool, funny, or otherwise significant, feel free to share it!I'd love to take a look.
