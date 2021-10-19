class Budget():
    objects = [] #inialise list to track budgets
    budget_number = 0
    def __init__(self, category: str, balance: float):
        Budget.objects.append(self) #append list to keep track of all budgets
        self.category = category #category input for overview function to know name of budget
        self.balance = balance

    def statement(self):
        return(str(self.category) + " balance is £" + str(self.balance))
    def deposit(self, funds: float):
        print(f"£{funds} successfully deposited to {self.category}")
        self.balance += funds
    def withdraw(self, funds: float):
        if self.balance < funds:  #potential check to prevent negative balance
            print(f"..({self.category}) Insufficient funds to comeplete the withdrawel." f" Not able to complete operation.")
        else:
            print(f"£{funds} successfully with withdrawn from {self.category}")
            self.balance -= funds   
    def transfer(self, funds: float, targetcat):
        if not isinstance(targetcat, Budget):
                print(f"{targetcat} is not a valid budget account.")
        else:
            self.withdraw(funds)
            targetcat.deposit(funds)
    def __str__(self):
        return f"{self.category} has a current balance of {self.balance}."

def budgetoverview(category):
    total=0
    for i in Budget.objects:
        total += i.balance
    budgetoverview = (category.balance/total)*100
    return str(category.category) + " makes up " + str(round(budgetoverview, 2)) + "% of the total budget."

Food = Budget("Food", 15000)
Clothing = Budget("Clothing", 10000)
Entertainment = Budget("Entertainment", 5000)
Travel = Budget("Travel", 10000)
Food.transfer(5000, Clothing)
food = "bad account sample"
Clothing.transfer(5000, food)
print(Food.statement())
print(Clothing.statement())
print(Entertainment.statement())
print(Travel.statement())
print(budgetoverview(Food))
