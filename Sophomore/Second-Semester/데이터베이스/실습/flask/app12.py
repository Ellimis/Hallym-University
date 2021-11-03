from flask import Flask, render_template

# Flask app 생성
app = Flask(__name__)

# http://localhost:5000/
# 메인 페이지 (http://localhost:5000/)
@app.route('/')
def index():
    return render_template('index12.html',
                           title = 'Flask Template Test',
                           home_str = 'Hello Flask!',
                           home_list = [1, 2, 3, 4, 5])

# 추가 페이지 (http://localhost:5000/test)
@app.route('/test')
def info():
    return render_template('test.html')

app.run()