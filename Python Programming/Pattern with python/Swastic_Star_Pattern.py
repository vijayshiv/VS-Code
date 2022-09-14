n = int(input("Enter the length of swastic : "))

for i in range(1, n + 1):
    for j in range(1, n + 1):
        if(i == 1):
            if(j == n or j <= n // 2 + 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        elif(i <= n // 2):
            if(j == n or j == n // 2 + 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        elif(i == n // 2 + 1):
            print("*", end=" ")
        elif(i < n):
            if(j == 1 or j == n // 2 + 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        else:
            if(j == 1 or j >= n // 2 + 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
    print()