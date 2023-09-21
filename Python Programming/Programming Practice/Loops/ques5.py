n = int(input("Enter the number -> "))
temp = n
c = 0
while(n > 0):
    n = n//10
    c = c + 1

print(f'The number of digits in {temp} is {c}')