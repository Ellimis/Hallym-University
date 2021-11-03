import pymssql

# 연결할 데이터베이스 서버 및 계정 정보
host = '210.115.229.77:2433'
user = '20195124'
password = 's195124@hallym'
database = user

# 데이터베이스 Connection 및 Cursor
connection = None
cursor = None

# 데이터베이스 연결
def connect_db():
    global connection, cursor
    
    # 현재 데이터베이스에 연결한 상태가 아닐 때 
    if connection == None and cursor == None:
        connection = pymssql.connect(host, user, password, database)
        cursor = connection.cursor()
    
    return connection, cursor

# 데이터베이스 연결 종료
def disconnect_db():
    global connection, cursor
    
    # 둘다 None이 아닐 때(현재 데이터를 사용하고자 데이터베이스에 연결한 상태일 때)
    if connection != None and cursor != None:
        connection.close()
        connection = cursor = None