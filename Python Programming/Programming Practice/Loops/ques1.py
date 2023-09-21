# https://www.w3resource.com/python-exercises/
n = int(input("Enter the number -> "))

# using for loop
print("Answer using for loop -> ")
for i in range(1, n + 1):
    print(i, end=" ")

# using while loop
print("\nAnswer using while loop -> ")
i = 1
while (i <= n):
    print(i, end=" ")
    i = i + 1
