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

class Shape():
    def __init__(self, height : float, width : float, length : float):
        self.height = height
        self.width = width
        self.length = length
    def volume(self):
        return self.height*self.width*self.length

class Cube(Shape):
    def __init__(self, height):
        self.height = height
        self.width = height
        self.length = height

Box = Cube(12)
print(Box.volume())