# Taking the list from user
n = int(input("Enter the value of n -> "))
l = []
for i in range(n):
    num = int(input("Enter the elements -> "))
    l.append(num)
print(f'The list -> {l}')

# using the reversed funvtion
print("The revered list using reverse function ->", end=" ")
new_l = reversed(l)
for data in new_l:
    print(data, end=" ")

# using swap method -> here the original list is changed
for i in range(len(l) // 2):
    l[i], l[-1 - i] = l[-1 - i], l[i]
print(f'\nThe reversed list -> {l}')