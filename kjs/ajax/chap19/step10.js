/*
    라우터
    사용자의 요청에 따라 사용자가 필요한 정보를 제공하는 것을 라우트라고 한다.
*/

var http = require('http');
var express = require('express');

//자주 사용하는 미들웨어
var app = express();
app.use(express.static('public'));
app.use(app.router);
/*
    router 미들웨어를 사용하면 아래 메서드를 사용할 수 있다.
    app.get() - 클라이언트의 GET 요청을 처리 한다.
    app.post() - 클라이언트의 POST 요청을 처리 한다.
    app.put() - 클라이언트의 PUT 요청을 처리 한다.
    app.del() - 클라이언트의 DELETE 요청을 처리 한다.
    app.all() - 클라이언트의 모든 요청을 처리 한다.
*/

//라우트
app.all('/a', function(request, response){
    response.send('<h1>Page A</h1>');
});
app.all('/b', function(request, response){
    response.send('<h1>Page B</h1>');
});
app.all('/c', function(request, response){
    response.send('<h1>Page C</h1>');
});

http.createServer(app).listen(52273, function(){
    console.log('Server Running at http://127.0.0.1:52273');
});