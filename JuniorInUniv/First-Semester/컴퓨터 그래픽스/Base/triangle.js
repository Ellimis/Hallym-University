var gl;
var points;

window.onload = function init()
{
    var canvas = document.getElementById("gl-canvas");

    // WebGL 을 쓸 수 있는지 확인 
    gl = WebGLUtils.setupWebGL(canvas);
    if(!gl) {
        alert("WebGL isn't available");
    }

    // 2차원의 점 세개를 기록( (-1, -1), (0, 1), (1, -1) )
    var vertices = new Float32Array([-1, -1, 0, 1, 1, -1]);

    // Configure WebGL
    // 화면에 보이는 직사각형, 텔레비전 모니터의 크기
    gl.viewport(0, 0, canvas.width, canvas.height);
    // 배경색을 지정, RGBA
    gl.clearColor(1.0, 1.0, 1.0, 1.0);

    // Load Shaders and initialize attribute buffers
    // html 파일에서 각 쉐이더에 맞는 기본 설정으로 컴파일한다.
    var program = initShaders(gl, "vertex-shader", "fragment-shader");
    // 컴파일된 것을 연결된 쉐이더를 쓴다고 알려줌
    gl.useProgram(program);

    // Load the data into the GPU
    // CPU 상의 데이터들을 GPU 로 넘기기 위한 버퍼
    var bufferId = gl.createBuffer();
    gl.bindBuffer(gl.ARRAY_BUFFER, bufferId);
    // 유동적인 물 같은 경우는 매번 vertices가 움직이므로
    // 이 버퍼는 건들이지 않는다는 의미의 gl.STATIC_DRAW
    gl.bufferData(gl.ARRAY_BUFFER, vertices, gl.STATIC_DRAW);

    // Associate out shader variables with out data buffer
    // vertex 속성값들을 지정해주는 버퍼
    // html vertex-shader 부분에서 선언한 vPosition 을 연결해주고 있음
    var vPosition = gl.getAttribLocation(program, "vPosition");
    // 위의 위치에 float 타입으로 2차원을 넣고 false(nomalize, 길이가 1인 벡터)로 설정 
    gl.vertexAttribPointer(vPosition, 2, gl.FLOAT, false, 0, 0);
    // 활성화
    gl.enableVertexAttribArray(vPosition);

    //
    render();
};

function render() {
    // 아까 지정한 배경색으로 지우고 컬러 버퍼(우리가 그리고자 하는 그림)를 채운다
    gl.clear(gl.COLOR_BUFFER_BIT);
    // 삼각형을 그림, 0부터 세개씩 끊어서
    gl.drawArrays(gl.TRIANGLES, 0, 3);
}