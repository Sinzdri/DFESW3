# price = {"Burger":5}
# user_funds = 10.31
# item_price = price["Burger"]

# if item_price < user_funds:
#     print("You have enough money!")
# if item_price == user_funds:
#     print("You have the precise amount of money")
# if item_price > user_funds:
#     print("Sorry you don't have enough money")

# def product(n):
#     total = 1
#     for i in n:
#         total *= i
#     return total

# print(product([4,4,5]))


def is_prime(x):
    if x < 1:
        return False
    elif x == 2 or x == 3: return True
    else:
        for n in range(2, x):
            if x % n == 0:
                return False
        return True

returnVar = is_prime(5)
print(returnVar)

# item_list = ["Burger", "Hotdog", "Bun", "Ketchup", "Cheese"]
# for i in item_list:
#     print(i)

# print(item_list[4])