# Calculator class
class Calculator:
    # constructor
    def __init__(self, input1, input2):
        self.input1 = input1
        self.input2 = input2
        self.result = 0
    # adder method
    def adder(self):
        # adder formula
        self.result += self.input1 + self.input2
        # print results
        print("adder: ", self.result)
    # subtractor method
    def subtractor(self):
        # subtractor method
        self.result += self.input1-self.input2
        # print results
        print("subtractor: ", self.result)
    # multiplier method
    def multiplier(self):
        # multipiler formula
        self.result += self.input1*self.input2
        # print results
        print("multiplier: ", self.result)
    # divider method
    def divider(self):
        # divider formula
        self.result += self.input1/self.input2
        # print results
        print("divider: ", self.result)
    # clear output
    def clear(self):
        self.result += 0
# get input for input1
input1 = int(input("Enter input 1: "))
# get input for input2
input2 = int(input("Enter input 2: "))
# new object
cal = Calculator(input1, input2)
# call adder method
cal.adder()
# clear
cal.clear()
# call subtractor method
cal.subtractor()
# clear
cal.clear()
# call multiplier method
cal.multiplier()
# clear
cal.clear()
# call divider method
cal.divider()
# clear
cal.clear()

