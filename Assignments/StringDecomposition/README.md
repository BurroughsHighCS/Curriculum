# String Decomposition
We have worked a lot with the `String` data type, but there are a lot of functions within the `String` class that we still have not covered.

## References
* Indexing / Access
    * `int length()`
        * Returns the number of chars contained in the string.
    * `char charAt(int index)`
        * Returns the `char` at position `index` within the string.
    * `int indexOf(char c)`
        * Returns the `int` of the index of the _first occurence_ of `char c` within the string.
    * `int indexOf(string substr)` 
        * Returns the `int` of the index of the _first char_ of the _first occurence_ of `String substr` within the string.
* Traversal
    * `for(char c : str) {...} //DOES NOT WORK`
    * `for(int i = 0; i < str.length(); i++) {...}`
* Comparison
    * `Boolean equals(String other)`
        * Compares two Strings.
        * ```Java
            String s = "Hello";
            if(s.equals("Hello")) {
                System.out.print("This works!")
            }

* Substrings
    * `String substring(int from, int to)`
        * Returns the substring beginning at `from` and ending at `to-1`.
        * Given `String s = "Hello"`, `s.substring(1,3)` will return a string only two characters: `"el"` 
    * `String substring(int from)`
        * Returns `substring(from, length())`
