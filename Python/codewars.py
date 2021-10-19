# def zero(operation = None):
#     if operation == None:
#         return 0
#     else:
#         return operation(0)
# def one(operation = None):
#     if operation == None:
#         return 1
#     else:
#         return operation(1)
# def two(operation = None):
#     if operation == None:
#         return 2
#     else:
#         return operation(2)
# def three(operation = None):
#     if operation == None:
#         return 3
#     else:
#         return operation(3)
# def four(operation = None):
#     if operation == None:
#         return 4
#     else:
#         return operation(4)
# def five(operation = None):
#     if operation == None:
#         return 5
#     else:
#         return operation(5)
# def six(operation = None):
#     if operation == None:
#         return 6
#     else:
#         return operation(6)
# def seven(operation = None):
#     if operation == None:
#         return 7
#     else:
#         return operation(7)
# def eight(operation = None):
#     if operation == None:
#         return 8
#     else:
#         return operation(8)
# def nine(operation = None):
#     if operation == None:
#         return 9
#     else:
#         return operation(9)


# def plus(a): return lambda y: y + a #lambda function let's create function to use external variable
# def minus(a): return lambda y: y - a
# def times(a): return lambda y: y * a
# def divided_by(a): return lambda y: y / a


def max_sequence(arr):
    sum_ = 0
    z = 0
    x = []
    if len(arr) <=1:
        x = arr
        return sum
    else:
        for perm in max_sequence(arr[1:]):
            for i in range(len(arr)):
                x = perm[:i] + arr[0:1] + perm[i:]
    for i in x:
        y = sum(x)
        if y>=z:
            z = y
        return  z
    return sum

print(max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
