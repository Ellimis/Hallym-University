from flask import Flask, render_template
from mssql_module import *

# Flask app 생성
app = Flask(__name__)

# 메인 페이지 (http://localhost:5000/)
@app.route('/')
def index():
    # 데이터베이스 연결
    conn, cursor = connect_db()
    query = "SELECT * FROM instructor"
    cursor.execute(query)
    
    rows = cursor.fetchall()
    
    # 데이터베이스 연결 종료
    disconnect_db()
    
    return render_template('index13_1.html',
                           title = 'Flask Template Test',
                           home_str = 'Hello Flask!',
                           home_list = rows)

# 추가 페이지 (http://localhost:5000/test)
@app.route('/test')
def info():
    return render_template('test.html')

app.run()