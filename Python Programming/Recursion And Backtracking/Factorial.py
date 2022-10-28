n = int(input("Enter the number here : "))
def fact(n):
    if(n == 1):
        return 1
    return n*fact(n - 1)

print(f'The factorial of {n} is {fact(n)}')