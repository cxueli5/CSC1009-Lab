# switch function with module variable
def switch(module):
    # dictionary to define module values
    moduleInfo={
        "CSC1009": "Object-Oriented Programming",
        "CSC1006": "Mathematics 2",
        "CSC1010": "Computer Networks",
        "CSC1008": "Data Structure"
    }
    # if not inside dictionary, display this
    return moduleInfo.get(module, "Unknown Module")
# enter an input for module
module = input("Enter an input: ")
# print results
print(switch(module))
