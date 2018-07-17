<h1>Introduction to Service Design and Engineering (fall 2016) - Client Assignment 3 </h1>

<h2>RAFFAELLA TRAN |University of Trento</h2>

<h2>SOAP Web Services</h2>

Client

Server repository: https://github.com/raffu12/introsde-2016-assignment-3-sever
I worked alone

- introsde.document.client: contains the file needed to make all the requests to my server;
 - introsde.document.ws: contains all generated files from wsimport of my server;

Configuration files

- build.xml: contains all targets to run the code;
- ivy.xml: contains all dependencies to run the project and to download them.

Install

In order to execute the client you need the following technologies (in the brackets you see the version used to develop):

Java (jdk1.8.0_102)
ANT (version 1.9.4)
Then, clone the repository. Run in your terminal:

git clone https://github.com/raffu12/introsde-2016-assignment-3-client && cd introsde-2016-assignment-3-client


How to run the client

My server wsdl file is at: http://localhost:6902/ws/people?wsdl 

Working with it:
you have to download introsde-2016-assignment-3-server run it as explain in preview and
cd introsde-2016-assignment-3-client
ant execute.client

create a build directory and compile the code in the src folder. You can find the compiled code in build folder;
a log file is generated client.log;
