3.1 Naming convention

Names must begin with a letter, and after
that, they can have any combination of letters and digits
The length is  essentially unlimited. You cannot use a Java reserved word (such as public or
class) for a class name. (See the appendix for a list of reserved words.)

Include nouns camel case "CamelCase"

brace format

void main method in java: return an "exit code", normally exit code = 0, another value use System.exit
void like C++ not return value

3.3 Data types
Java is strongly typed language 

3.3.1 Integer types

int 4 bytes
short 2 bytes
long 8 bytes 
byte 1 byte
Note that Java does not have any unsigned versions of the int, long, short,
or byte types.

3.3.2 Floating-point types 
float 4 bytes
double 8 bytes

The constants Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, and
Double.NaN (as well as corresponding Float constants) represent these
special values, but they are rarely used in practice. In particular, you cannot
test
if (x == Double.NaN) // is never true
to check whether a particular result equals Double.NaN. All “not a number”
values are considered distinct. However, you can use the Double.isNaN
method:
if (Double.isNaN(x)) // check whether x is "not a number"




