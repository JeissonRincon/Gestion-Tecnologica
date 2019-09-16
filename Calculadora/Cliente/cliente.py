from flask import Flask
from flask import render_template,request, make_response
import request

app = Flask(__name__)

@app.route('/cliente', methods=['POST','GET'])
def cliente():
    
