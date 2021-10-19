# file = open("wods.txt", "r")

# outfile = ""
# print (range(1,len(file.readlines())))
# for line in range(1,len(file.readline())):
#     if line % 2 == 0:
#         outfile += file.readline()
#     else:
#         file.readline()

# file = open("wods.txt", "w")
# file.write(outfile)
# file.close()

with open("teams.txt", "w") as file:
    teams = "I\nDon't\nReally\nKnow\nSports\n"
    file.write(teams)

with open("teams.txt", "r") as file:
    lines = file.readlines()
    print(lines[0])
    print(lines[3])


