# clockTime class
from turtle import showturtle


class clockTime:
    # constructor
    def __init__(self, hours, mins, secs):
        self.hours = hours
        self.mins = mins
        self.secs = secs
    # setHours method
    def setHours(self, hours):
        # set hours
        self.hours = hours
    # setMinutes method
    def setMinutes(self, mins):
        # set mins
        self.mins = mins
    # setSecs method
    def setSecs(self, secs):
        # set second
        self.secs = secs
    # setTime method
    def setTime(self, hours, mins, secs):
        # set time
        self.hours = hours
        self.mins = mins
        self.secs = secs
    # showTime method
    def showTime(self):
        print(self.hours,":",self.mins,":",self.secs)
# get input for hours
hours = int(input("Enter hours: "))
# get input for mins
mins = int(input("Enter mins: "))
# get input for secs
secs = int(input("Enter secs: "))
# new object
time = clockTime(hours, mins, secs)
# show current time
time.showTime()
# call setHours method
time.setHours(2)
# call setMins method
time.setMinutes(30)
# call setSecs method
time.setSecs(25)
# show new time
time.showTime()
# call new setTime
time.setTime(3,45,40)
# show new time
time.showTime()

