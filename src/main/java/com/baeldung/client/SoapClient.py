import zeep

wsdl = 'http://localhost:8080/ws/calculator.wsdl'
client = zeep.Client(wsdl=wsdl)

print("1. Tính giai thừa")
print("2. Tính toán + - * /")
while(True):
    choose = int(input("Nhập lựa chọn (1, 2): "))
    if(choose == 1):
        number = int(input("Nhập số: "))
        try:
            print("Kết quả trả về: " + str(client.service.exp(number)))
        except Exception as e: 
            print(e)
    elif(choose == 2):
        number1 = float(input("Nhập vào số thứ nhất: "))
        number2 = float(input("Nhập vào số thứ hai: "))
        operation = input("Nhập vào phép toán (+,-,*,/): ")
        try:
            print("Kết quả trả về: " + str(client.service.calculator(number1,number2,operation)))
        except Exception as e: 
            print(e)
    else:
        break
    print("")
