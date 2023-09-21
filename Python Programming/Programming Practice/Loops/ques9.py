# Write a program to calculate the sum of series up to n term. For example, if n =5 the series will become 2 + 22 + 222 + 2222 + 22222 = 24690


n = int(input('Enter the number of sequence -> '))
# first number of sequence
start = int(input("Enter the number whose sequence you want -> "))
const_start = start
sum_seq = 0

print("The series is ->",end=" ")
# run loop n times
for i in range(0, n):
    print(start, end=" ")
    sum_seq += start
    # calculate the next term
    start = start * 10 + const_start
print("\nSum of above series is:", sum_seq)
