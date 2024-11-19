# Exception-Input
Due: Wed 11/20 at 11:59 PM
Create a program called ExceptionInput.java

Prompt the user for a number

This is how many integers you will read in

Prompt the user for the appropriate number of integers and store them in an array

Prompt the user for two integers

Print the sum of the integers at those two indices following the format given in the example output

Be sure to handle all exceptions using try/catch statements

If the user does not enter a number when prompted, print "ERROR: a number must be entered" and then stop execution of the program

If the user does not enter a valid index, print "ERROR: a valid index must be given" and then stop execution of the program

Example Input:
3
1
2
cat
0
1
Example Output:
ERROR: a number must be entered

Example Input:
3
1
2
3
woof
1
Example Output:
ERROR: a number must be entered

Example Input:
3
1
2
3
0
3
Example Output:
ERROR: a valid index must be given

Example Input:
3
1
2
3
0
1
Example Output:
The sum of the values at index 0 and index 1 is 3