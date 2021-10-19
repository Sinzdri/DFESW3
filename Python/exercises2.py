#remove items from a list while iterating
from typing import Counter


number_list = [10,20,30,40,50,60,70,80,90,100]
for i in range(len(number_list) - 1, -1, -1):   #by starting at the end and working backwards we avoid any issues with list removals reducing the list length
    if number_list[i] > 50:
        del number_list[i]
        
print(number_list)

#Reverse mapping of a dictionary
ascii_dict = {'A': 65, 'B': 66, 'C': 67, 'D': 68}
newdict = {}
for i in ascii_dict:
    var1 = i
    var2 = ascii_dict[i]
    newdict[var2] = var1
ascii_dict = newdict
print(ascii_dict)

# more efficient alternative
# newdict = {value: key for key, value in asciidict.items()} 
# print(newdict)

# Dictionary
d1 = {'A': 65, 'B': 66, 'C': 67, 'D': 68, 'E': 69, 'F': 70}

# Filter dict using following keys
l1 = ['A', 'C', 'F']

new_d = {key: d1[key] for key in l1}
print(new_d)

n=0
for i in range(5,0,-1):
    n += 1
    for j in range(1, i+1):
        print(n, end=' ')
    print('\r')