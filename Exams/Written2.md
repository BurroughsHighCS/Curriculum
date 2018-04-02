Consider a system for processing names and addresses from a mailing list. A `Recipients` class will be used as part of this system. The lines in the mailing list are stored in an `ArrayList<String>, a private instance variable in the Recipients class. The blank line that separates recipients in the mailing list is stored as the empty string in this list, and the final element in the list is an emptry string.

A portion of the mailing list is shown below, with the corresponding part of the `ArrayList`:

```
    Mr. J. Adams
    6 Rose St. 
    Ithaca, NY 14850

    Jack S. Smith
    12 Posy Way
    Suite 201
    Glendale, CA 91203

    Ms. M.K. Delgado
    2 River Dr.
    New York, NY 10013
```

```
    [0]     "Mr. J. Adams"
    [1]     "6 Rose St."
    [2]     "Ithaca, NY 14850"
    [3]     ""
    [4]     "Jack S. Smith"
    [5]     "12 Posy Way"
    [6]     "Suite #201"
    [7]     "Glendale, CA 91023"
    [8]     ""
    [9]     "Ms. M.K. Delgado"
    [10]    "2 River Dr."
    [11]    "New York, NY 10013"
    [12]    ""
```

The `Recipients` class that process this data is shown below:

```Java
public class Recipients {
    /** The list of lines in the mailing list */
    private List<String> lines;

    /** Constructor. Fill lines with mailing list data.
    *   Postcondition:
    *   - Each element in lines is one line of the mailing list.
    *   - Lines appear in the list in the same order that they appear in the mailing list
    *   - Blank line separators in the mailing list are stored as empty strings.
    */
    public Reciptions() 
    { /* Implementation not shown */ }

    /** Postcondition: Returns the city contained in the cityZip string of an address
    *   @param cityZip contains the city, state, and zipcode line of an address
    *   @return the city substring contained in cityZip
    */
    public String extractCity(String cityZip)
    { /* to be implemented in part (a) */ }

    /** Precondition: The recipient name is the first line of each label on the mailing list.
    *   Postcondition: Prints a list of recipient names to console, one per line.
    */
    public String printNames()
    { /* to be implemented in part (b) */ }

    /** Postcondition: Returns the address of the recipient with the specified name
    *   @param name a name in the lines ArrayList
    *   @return the address of the recipient with the given name
    */
    public String getAddress(String name)
    { /* to be implemented in part (c) */ }

    //Other methods are not shown
}
```

a.  Write the `extractCity` method of the `Recipients` class. In the cityZip parameter the city is followed by a comma, then one blank space, then two capital letters for a state abbreviation, then a space and 5-digit zip code. For example, if `cityZip` is "Ithaca, NY 14850", the method `extractCity(cityZip)` should return "Ithaca".

Complete mothod `extractCity`:
```Java
    /** Postcondition: Returns the city contained in the cityZip string of an address
    *   @param cityZip contains the city, state, and zipcode line of an address
    *   @return the city substring contained in cityZip
    */
    public String extractCity(String cityZip){ 
        
    }
```

b.  Write the `printNames` method of the `Recipients` class. Method `printNames` prints the names of all recipients to the console, one per line. For the sample part of the mailing list shown at the beginning of the question, the output for `printNames` would be:

```
Mr. J. Adams
Jack S. Smith
Ms. M.K. Delgado
```

Complete method `printNames`:
```Java
    /** Precondition: The recipient name is the first line of each label on the mailing list.
    *   Postcondition: Prints a list of recipient names to console, one per line.
    */
    public String printNames(){ 

    }
```

c. Write the `getAddress method of the `Recipients class. This method should return a string that contains only the address of the corresponding `name` parameter. For example, if `name` is "Jack S. Smith", a string containing three subsequent lines of his address should be returned. This string should contain line breaks in appropriate places, including after the last line of the address. This ensures that the address will have the proper address format when printed by a client class.

Complete method `getAddress`:
```Java
    /** Postcondition: Returns the address of the recipient with the specified name
    *   @param name a name in the lines ArrayList
    *   @return the address of the recipient with the given name
    */
    public String getAddress(String name){ 
        
    }
```