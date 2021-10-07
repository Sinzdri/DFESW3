# class Students():
#     def __init__(self, name, age, class_):
#         self.name = name
#         self.age = age
#         self.class_ = class_
#     def avgtest(self, score1, score2, score3):
#         avgscore = (score1 + score2 + score3)/3
#         return avgscore

# Bob = Students("Bob", 16, "chemistry")

# print(Bob.avgtest(26, 22, 6))

# class Test():
#     def __init__(self, letters):
#         self.letters = letters
#     def search(self, x):
#         if x in self.letters:
#             return True
#         else: return False


# vowelchecker = Test("aeiouAEIOU")
# straightlines = Test("AEFHIKLMNTVWXYZ")
# notroman = Test("ABEFGHJKNOPQRSTUWYZ")


# print(vowelchecker.search('a'))
# print(straightlines.search('B'))
# print(notroman.search('X'))

# from random import randint
# class Dice():
#     def __init__(self, dicesides):
# #        self.numberofdice = numberofdice
#         self.dicesides = dicesides
#     def roll(self, numberofdice):
#         roles = []
#         while numberofdice > 0:
#             roles.append(randint(1,self.dicesides)) 
#             numberofdice -= 1
#         return roles

# d10 = Dice(10)
# print(d10.roll(5))

class Budget():
    objects = [] #inialise list to track budgets
    def __init__(self, category, balance):
        Budget.objects.append(self) #append list to keep track of all budgets
        self.category = category #need category input for overview function to know name of budget as workaround
        self.balance = balance

    def statement(self):
        return(str(self.category) + " balance is £" + str(self.balance))
    def deposit(self, funds):
        self.balance += funds
    def withdraw(self, funds):
        self.balance -= funds
    def transfer(self, funds, targetcat):
        self.withdraw(funds)
        targetcat.deposit(funds)

def budgetoverview(category):
    total=0
    for i in Budget.objects:
        total += i.balance
    budgetoverview = (category.balance/total)*100
    return str(category.category) + " makes up " + str(round(budgetoverview, 2)) + "% of the total budget."

Food = Budget("Food", 20000)
Clothing = Budget("Clothing", 10000)
Entertainment = Budget("Entertainment", 5000)
Travel = Budget("Travel", 10000)
Food.withdraw(5000)
Food.transfer(5000, Clothing)
print(Food.statement())
print(Clothing.statement())
print(Entertainment.statement())
print(Travel.statement())
print(budgetoverview(Food))
