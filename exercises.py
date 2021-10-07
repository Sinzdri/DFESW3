# import pdb
# # mark = int(input("Input your mark"))
# # if mark >= 85:
# #     print("Distinction")
# # elif 85 > mark >= 65:
# #     print("Pass")
# # else:
# #     print("Fail")

# #No elif statement

# #if mark >= 85:
# #    print("Distinction")
# #if 85 > mark >= 65:
# #    print("Pass")
# #if mark < 65:
# #    print("Fail")

# # names = []
# # for i in range (5):
# #     names.append(input("What is your name"))

# # for name in names:
# #     print(name, "is awesome!")

# # string = input("Provide potential palindrome").lower()
# # revstring = ""
# # for i in range (len(string)):
# #     revstring = revstring + string[-1-i]
# # if revstring == string:
# #     print("Palindrome provided")
# # else:
# #     print("Not a palindrome")


# # string = str(input("Provide potential palindrome")).lower()
# # revstring = string[::-1]
# # if(revstring) == string:
# #     print("Palindrome provided")
# # else:
# #     print("Not a palindrome")


# # C to F and F to C
# # temp = input("Give Temperature, ending C or F for unit")
# # lastchar = temp[-1] #Get final character to determine unit given
# # if lastchar.lower() == 'f':
# #     tempcel = ((int(temp[:-1])-32)/9)*5
# #     print(str(temp) + " is " + str(round(tempcel)) + "C")
# # elif lastchar.lower() == 'c':
# #     tempfar = (int(temp[:-1])/5)*9+32
# #     print(str(temp) + " is " + str(round(tempfar)) + "F")
# # else:
# #     print("Please check your input format") 

# # x,y = 0,1 #fibunacci sequence
# # while y<250:
# #     print(y)
# #     x,y = y, x+y


# # Function to calculate overall grade for student
# # def gradecalc(name, homework, assessment, finals):
# #     grade=round(((homework+assessment+finals)/175)*100)
# #     if grade >= 80:gradeletter = "A"
# #     elif grade >= 70:gradeletter = "B"
# #     elif grade >= 60:gradeletter = "C"
# #     elif grade >= 50:gradeletter = "D"
# #     elif grade >= 40:gradeletter = "E"
# #     else: gradeletter = "F"
# #     return(name + " scored " + str(grade) +"% which gives them a grade " + gradeletter )

# # print(gradecalc(input("Student name"), int(input("Homework score")), int(input("Assessment score")), int(input("Exam score"))))


# #Find largest number
# # def biggestnum(num1, num2, num3):
# #     if num1 > num2:
# #         if num1 > num3:
# #             return num1
# #         else: return num3
# #     else:
# #         if num2 > num3:
# #             return num2
# #         else: return num3

# # print(biggestnum(8, 600, 100))


# # def total(numbers):
# #     total = 0
# #     for number in numbers:
# #         total += number
# #     return total

# # print(total([8,2,3,0,7]))

# # def multiplysum(numbers):
# #     multiple = 1
# #     for number in numbers:
# #         multiple *= number
# #     return multiple

# # print(multiplysum([8,2,3,-1,7]))

# # def revstring(string):
# #     revstring = ""
# #     for i in range (len(string)):
# #         revstring = revstring + string[-1-i]
# #     return revstring

# # print(revstring("Hello"))

# # def factorial(number):
# #     factor = number
# #     while number > 1:
# #         factor = factor*(number-1)
# #         number = number-1
# #     return factor

# # print(factorial(4))
# pdb.set_trace()
# def rangecheck(number, givenrange):
#     extractedrange = []
#     for i in givenrange:
#         extractedrange.append(i)
#     if number in extractedrange:return True
#     else: return False


# print(rangecheck(10, range(0, 50)))

# import re
# def Casesum(givenstring):
#     lowercase = re.findall("[a-z]", givenstring)
#     uppercase = re.findall("[A-Z]", givenstring)
#     return("Number of Upper case characters :" + str(len(uppercase)) + "  Number of Lower case character:" + str(len(lowercase)))

# print(Casesum("NumberTestWordsHello"))

