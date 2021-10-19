with open("sample.txt", "r") as file:
    line = file.read().replace('\n', ' ')
    print(line)