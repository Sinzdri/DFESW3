with open("teams.txt", "r") as file:
    lines = file.readlines()
    lines[0] = "This is a new line\n"
    stringlines = ""
    for i in lines:
        stringlines += i

with open("teams.txt", "w") as file:
    file.write(stringlines)

with open("teams.txt", "r") as file:
    newlines = file.readlines()
    for i in newlines:
        print(str(i[:-1]))
