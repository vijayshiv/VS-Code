arr = [10, 23, 12, 1, 2, 65, 89, 8, 5, 90]
print(f'Original array is -> {arr}')
def recursion(arr,depth):
  str = [] # step 1
  if depth == -1: #step 2
    return str

  str.append(arr[depth]) #step 3
  n = recursion(arr,depth-1) #step 4 
  if len(n) > 0:
    str.extend(n)

  return str

r = recursion(arr,len(arr)-1)
print(f'Reverse array is -> {r}')