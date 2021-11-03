from flask import Flask, render_template
from mssql_module import *

# Flask App 생성
app = Flask(__name__)

# 메인 페이지 (http://localhost:5000/)
@app.route('/')
def index():
    return render_template('index14.html', title = '데이터베이스 실습')

# 추가 페이지 (http://localhost:5000/student)
@app.route('/student')
def student():
    # 데이터베이스 연결
    conn, cursor = connect_db()
    
    # query문 작성, student 테이블의 내용을 전부 가져옴
    query = "SELECT * FROM student"
    # query문 실행
    cursor.execute(query)
    
    # data list에 넣을 student 테이블의 모든 값을 가져온다
    dl = cursor.fetchall()
    
    # 데이터베이스 연결 종료
    disconnect_db()
    
    # 데이터를 넘겨서 보여줄 html문서와 title
    # 그리고 query문으로 얻은 데이터들을 저장할 data_list변수
    return render_template('base.html',
                           title= 'student',
                           data_list= dl)

# 추가 페이지 (http://localhost:5000/instructor)
@app.route('/instructor')
def instructor():
    # 데이터베이스 연결
    conn, cursor = connect_db()
    
    # query문 작성, instructor 테이블의 내용을 전부 가져옴
    query = "SELECT * FROM instructor"
    # query문 실행
    cursor.execute(query)
    
    # data list에 넣을 instructor 테이블의 모든 값을 가져온다
    dl = cursor.fetchall()
    
    # 데이터베이스 연결 종료
    disconnect_db()
    
    # 데이터를 넘겨서 보여줄 html문서와 title
    # 그리고 query문으로 얻은 데이터들을 저장할 data_list변수
    return render_template('base.html',
                            title= 'instructor',
                            data_list= dl)

# spyder에서 flask를 실행하기 위한 app.run() 함수
app.run()