1.2.1 Simple

Purpose

We wanted to build a system that could be programmed easily without a
lot of esoteric training and which leveraged today’s standard practice.
So even though we found that C++ was unsuitable, we designed Java as
closely to C++ as possible in order to make the system more
comprehensible. Java omits many rarely used, poorly understood,
confusing features of C++ that, in our experience, bring more grief than
benefit.

Mục tiêu xây dựng một hệ thống tiêu chuẩn mà ko cần phải có quá nhiều khoá đào tạo. Java được thiết kế gần với C++ để hệ thống có thể tốt hơn nhưng bỏ qua những thứ khó hiểu mà ít mang lại lợi ích

1.2.2 Object oriented

1.2.3 Distributed

Java has an extensive library of routines for coping with TCP/IP
protocols like HTTP and FTP. Java applications can open and access
objects across the Net via URLs with the same ease as when accessing a
local file system.
Nowadays, one takes this for granted—but in 1995, connecting to a web
server from a C++ or Visual Basic program was a major undertaking

Java có một thư viện phong phú để xử lý TCP/IP các giao thức như HTTP, FTP. Các ứng dụng Java có thể mở và truy cập các đối tương trên mạng thông qua URLs dễ dàng như khi truy cập một file ở local system. Với C++ hoặc Virtual Basic thì rất khó khăn

1.2.4 Robust

Java is intended for writing programs that must be reliable in a variety
of ways. Java puts a lot of emphasis on early checking for possible
problems, later dynamic (runtime) checking, and eliminating situations
that are error-prone. . . . The single biggest dif erence between Java and
C/C++ is that Java has a pointer model that eliminates the possibility of
overwriting memory and corrupting data.
The Java compiler detects many problems that in other languages would show
up only at runtime. As for the second point, anyone who has spent hours
chasing memory corruption caused by a pointer bug will be very happy with
this aspect of Java

Java được thiết kế để viết nhiều dạng theo nhiều cách khác nhau. Java tập trung vào việc kiểm tra sớm các khả năng có thể xảy ra vấn đề. Java > C++, Java có mô hình con trỏ giúp loại bỏ khả năng ghi đè bộ nhớ và làm hỏng dữ liệu. Trình biên dịch có thể phát hiện được nhiều vấn đề giúp hạn chế lỗi 

1.2.5 Secure

Java is intended to be used in networked/distributed environments.
Toward that end, a lot of emphasis has been placed on security. Java
enables the construction of virus-free, tamper-free systems.

Java cho phép xây dựng hệ thống virus-free, tamper-free

From the beginning, Java was designed to make certain kinds of attacks
impossible, among them:
• Overrunning the runtime stack—a common attack of worms and viruses
• Corrupting memory outside its own process space
• Reading or writing files without permission

Java được thiết kế để không thể tấn công bằng cách
• Overruning time stack
• Corrupting memory outside its own process space
• Reading or writing files without permission

1.2.6 Architecture-Neutral

1.2.7 Portable 

1.2.8 Interpreted    
Jshell

1.2.9 High-Performance
JIT just-in-time become so good

1.2.10 Multithreaded
benefits of multithreading are better interactive responsiveness
and real-time behavior.
Nowadays, we care about concurrency because Moore’s law has come to an
end. Instead of faster processors, we just get more of them, and we have to
keep them busy. Yet when you look at most programming languages, they show
a shocking disregard for this problem.
Java was well ahead of its time. It was the first mainstream language to
support concurrent programming. As you can see from the white paper, its
motivation was a little different. At the time, multicore processors were
exotic, but web programming had just started, and processors spent a lot of
time waiting for a response from the server. Concurrent programming was
needed to make sure the user interface didn’t freeze.
Concurrent programming is never easy, but Java has done a very good job
making it manageable.
Hỗ trợ lập trình đa luồng

1.2.11 Dynamic
In a number of ways, Java is a more dynamic language than C or C++. It
was designed to adapt to an evolving environment. Libraries can freely
add new methods and instance variables without any ef ect on their
clients. In Java, finding out runtime type information is straightforward.
This is an important feature in situations where code needs to be added to a
running program. A prime example is code that is downloaded from the
Internet to run in a browser. In C or C++, this is indeed a major challenge, but
the Java designers were well aware of dynamic languages that made it easy to
evolve a running program. Their achievement was to bring this feature to a
mainstream programming language.
NOTE:
Shortly after the initial success of Java, Microsoft released a product called
J++ with a programming language and virtual machine that were almost
identical to Java. This effort failed to gain traction, and Microsoft followed
through with another language called C# that also has many similarities to
Java but runs on a different virtual machine. This book does not cover J++ or

1.3 Java Applets and the Internet



