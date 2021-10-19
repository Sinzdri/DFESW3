from random import randint
class Dice():
    def __init__(self, dicesides):
        self.dicesides = dicesides
    def roll(self, numberofdice):
        roles = []
        while numberofdice > 0:
            roles.append(randint(1,self.dicesides)) 
            numberofdice -= 1
        return roles

d10 = Dice(10)
print(d10.roll(5))
d20 = Dice(20)
print(d10.roll(2)+d20.roll(2))