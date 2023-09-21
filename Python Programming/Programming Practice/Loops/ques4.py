n = int(input("Enter the value of n -> "))
l = []
for i in range(n):
    num = int(input("Enter the elements -> "))
    l.append(num)
print(l)

new_l = []
for data in l:
    if (data % 5 == 0):
        new_l.append(data)

print(f'The new list is {new_l}')