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

3.3.4 Char type
The char type was originally intended to describe individual characters.
However, this is no longer the case. Nowadays, some Unicode characters can
be described with one char value, and other Unicode characters require two
char

một vài ký tự unicode có thể mô tả 1 char value và có các ký tự unicode cần 2 char value

3.3.5 Boolean type

The boolean type has two values, false and true. It is used for evaluating logical conditions. You cannot convert between integers and boolean values.

3.4 Variables and constants

3.4.1 Declaring variable

The terms “letter,” “digit,” and “currency symbol” are much broader in Java
than in most languages. A letter is any Unicode character that denotes a letter
in a language. For example, German users can use umlauts such as 'ä' in
variable names; Greek speakers could use a π. Similarly, digits are 0–9 and
any Unicode characters that denote a digit. Currency symbols are $, €, ¥, and
so on. Punctuation connectors include the underscore character _, a “wavy
low line” , and a few others. In practice, most programmers stick to A-Z, a-z,
0-9, and the underscore _.

3.4.2 Initializing variable

In Java, it is considered good style to declare variables as closely as possible
to the point where they are first used

Khai báo càng gần điểm sử dụng lần đầu càng tốt





