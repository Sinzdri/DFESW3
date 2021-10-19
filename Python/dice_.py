from random import randint
def d6(numberofdice):
    roles = []
    while numberofdice > 0:
        roles.append(randint(1,6)) 
        numberofdice -= 1
    return roles
