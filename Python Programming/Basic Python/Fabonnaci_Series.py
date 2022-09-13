n = int(input("Entyer the number : "))

a= 0
b = 1

count = 2
i = 1
print(f'The series 1th number is 0')
while(count <= n):
    temp = b
    b = b + a
    a = temp
    count = count + 1
    i = i + 1
    print(f'The series {i}th number is {b}' ) 