# String Decomposition
We have worked a lot with the `String` data type, but there are a lot of functions within the `String` class that we still have not covered.

## References
* Indexing / Access
    * `int length()`
        * Returns the number of chars contained in the string.
    * `char charAt(int index)`
        * Returns the `char` at position `index` within the string.
    * `int indexOf(char c)`
        * Returns the `int` of the _first occurence_ of `char c` within the string.
    * `int indexOf(string substr)` 
        * Returns the `int` of the _first char_ of the _first occurence_ of `String substr` within the string.
* Traversal
    * `for(char c : str) {...}`
    * `for(int i = 0; i < str.length(); i++) {...}`
* Comparison
    * `Boolean equals(String other)`
        * Compares two Strings.
        * ```Java
            String s = "Hello";
            if(s == "Hello") {
                System.out.println("This doesn't work.");
            }

            if(s.equals("Hello")) {
                System.out.print("This works!")
            }
        * The `==` operator does not work as you expect it to for the `String` data type. You must use the `equals(String other)` function to compare equality between two strings in Java.

* Substrings
    * `String substring(int from, int to)`
        * Returns the substring beginning at `from` and ending at `to-1`.
        * WARNING: Up until now I had been teaching the `substring` function WRONG. I said the second paramater is how many spaces it should go _forward_ from the starting index, but that's incorrect. The second parameter **is the desired _end_ index of your substring - 1**.
    * `String substring(int from)`
        * Returns `substring(from, length())`