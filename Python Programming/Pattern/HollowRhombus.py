n = int(input("Enter the side of rhombus : "))
os = n // 2
s = -1


for i in range(1, n + 1):
    for j in range(1, os+1):
        print("  ", end=" ")
    print("*", end=" ")
    for j in range(1, s+1):
        print("  ", end=" ")
    if(i > 1 and i < n):
        print("* ", end=" ")
    if(i <= n // 2):
        os = os - 1
        s = s + 2
    else:
        os = os + 1
        s = s - 2 
    print()