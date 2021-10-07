def square_digits(num):
    test = []
    string =""
    x=0
    start = str(num)
    for i in start:
        test.append(start[x])
        x = x+1
    for i in test:
        i = int(i)**2
        string = string + str(i)
    return int(string)


print(square_digits(9119))