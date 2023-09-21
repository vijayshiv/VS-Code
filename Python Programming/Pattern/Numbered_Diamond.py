n = int(input("Enter the length : "))

sp = n // 2
st = 1
val = 1

if(n % 2 != 0):
    for i in range(1, n + 1):
        for j in range(1, sp + 1):
            print("  ", end=" ")
        cval = val
        for j in range(1, st + 1):
            print(f'{cval} ', end=" ")
            if(j <= st // 2):
                cval = cval + 1
            else:
                cval = cval - 1
        
        if(i <= n // 2):
            sp = sp - 1
            st = st + 2
            val = val + 1
        else:
            sp = sp + 1
            st = st - 2
            val = val - 1
        print()
else:
    print("Enter only ODD number !!!! Try again ")