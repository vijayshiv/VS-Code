Result =[]
scorelist = []

if __name__ == '__main__':
    for _ in range(int(input())):
        name = input()
        score = float(input())
        Result+=[[name,score]]
        scorelist+=[score]
    b=sorted(list(set(scorelist)))
    print(b)
    print(Result)

    # a = sorted(Result)
    # print(a)


     

    # for a,c in sorted(Result):
    #     if c==b:
    #         print(a)


# v = [12,34,45,56,56,80,34,45]
# b = sorted(set(v))[1]
# print(b)