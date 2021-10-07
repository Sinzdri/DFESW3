file = open("wods.txt", "r")

outfile = ""

for line in range(len(file.readline())):
    if line % 2 == 0:
        outfile += file.readline()
    else:
        file.readline()

file = open("wods.txt", "w")
file.write(outfile)
file.close()
