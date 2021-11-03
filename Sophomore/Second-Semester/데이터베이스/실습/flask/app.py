from flask import Flask, render_template

# Flask App 생성
app = Flask(__name__)

# http://localhost:5000/
# 메인 페이지 (http://localhost:5000/)
@app.route("/")
def index():
    return render_template("index.html")
    #return "<h1>Hello, Flask</h1>"
    
# 추가 페이지 (http://localhost:5000/test)
@app.route("/test")
def test():
    return render_template("test.html")
    #return "<h1>Hello, Test Page</h1>"
    
# 추가 페이지 (http://localhost:5000/info)
#@app.route("/info")
#def info():
#    return "<h1>Hello, Here is info page</h1>"

app.run()