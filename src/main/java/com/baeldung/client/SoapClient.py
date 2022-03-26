import zeep

wsdl = 'http://localhost:8080/ws/calculator.wsdl'
client = zeep.Client(wsdl=wsdl)

while(True):
    number1 = float(input("Nhập vào số thứ nhất: "))
    number2 = float(input("Nhập vào số thứ hai: "))
    operation = input("Nhập vào phép toán (+,-,*,/,^): ")
    try:
        print("Kết quả trả về: " + str(client.service.calculator(number1,number2,operation.strip())))
    except Exception as e: 
        print(e)
    print("")
