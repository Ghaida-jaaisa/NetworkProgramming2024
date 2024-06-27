# NetworkProgramming2024
All projects bulid in using java
## CalculateSumOfArrayOfIntegersUsingThreds 
### Task : you have an array of size n , initialize the array with random numbers , the initialize 2 working thread , each thread have to calculate the summation of half the elements of array 
Thread 1 -> have to calculate from begining to size/2 , Thread 2 -> have to calculate from size/2 to end 

## FindPassStudent
### Task: suppose that each line in a text file contain a name of student & his grades first , second , and final separated by space (Exmaple : Ghaida 25 24 49 ) where the highest rate 25 25 50 . Write a program that reads the name & the text from file from the keyboard & saved the names and results of passed student ( result >= 50 ) in a new file 
note : use either printwriter or printstream class

## ReadFileContent 
### Task: Read two files names from the console , then the application should open the two files & read their content  & store the content of the files in a new file 

## CalculateSummationFromFilesUsingThread
### Using_CALLBACK 
The program have to calculate the summation of numbers stored in file , each working thread  have to calcualte the summation from different file , all process are doing at  the same time

## MaxOfArray
### Using Callable interface
  Task : Using callabe interface  , create 2 threads each one have to find the maximum element in array ,   
    give the first half of the array to the first thread and the other half to the second  
    use : ExecutorsService class and future 

## CalculateSumUsingCallableInterface
### Task : The main have to create thread return arraylist of file names to main , then main have to create group of threads each thread recieve file name then calculate summaion of numbers inside this files , print summations on screen.

## ReadDomainsFromFile
### Task : The main have to open text file named Domain.txt then read all file , each line has different domain name give each domain to thread , where # of threads equal to # of entries in file . each thread have to generate DNS resolution IN PARALLEL with other thread, then print IP on screen .
