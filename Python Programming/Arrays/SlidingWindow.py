
List = [2,3,4,7,9,2,1,3]
def fixed_sliding(arr: List, k: int) -> List:
    cur_subarray = sum(arr[:k])
    result = [cur_subarray]

    for i in range(1, len(arr) - k + 1):
        cur_subarray = cur_subarray - arr[i-1]
        cur_subarray = cur_subarray + arr[i+k-1]

        result.append(cur_subarray)
    return result

ans = fixed_sliding(List, 2)
print(ans)