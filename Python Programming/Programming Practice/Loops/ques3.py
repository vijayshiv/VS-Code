n = int(input("Enter the value of n -> "))

sum = 0
for i in range(1, n+1):
    sum = sum + i

print(f'The sum of natural number till {n} is {sum}')