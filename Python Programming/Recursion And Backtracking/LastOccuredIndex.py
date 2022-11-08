from ctypes.wintypes import tagRECT


n = int(input("Enter the length of the list : "))
arr = []
for i in range(0,n):
    ele = int(input(f'Enter the {i}th element : '))
    arr.append(ele)
print(arr)
target = int(input("Enter the targer element for last index : "))

def lastindex(arr, i, target):
    if(i == len(arr)):
        return -1
    
    liisa = lastindex(arr, i + 1, target)
    if(liisa == -1):
        if(arr[i] == target):
            return i
        else:
            return -1
    else:
        return liisa

ans = lastindex(arr, 0, target)
print(f'The last index of Target element -> {target} is {ans}')