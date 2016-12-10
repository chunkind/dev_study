'use strict'
var http = require('http');
var express = require('express');

var items = [
    {
        name:'우유',
        price:2000
    },
    {
        name:'홍차',
        price:5000
    },
    {
        name:'커피',
        price:5000
    }
];

var app = express();
app.use(express.static('public'));
app.use(app.router);

app.all('/data.html',function(request, response){
    var output = '';
    output += '<!DOCTYPE html>';
    output += '<html>';
    output += '<head>';
    output += '     <title>Data HTML</title>';
    output += '</head>';
    output += '<body>';
    
    items.forEach(function(item){
        output += '<div>';
        output += '     <h1>' + item.name + '</h1>';
        output += '     <h1>' + item.price + '</h1>';
        output += '</div>';
    });
    
    output += '</body>';
    output += '</html>';
    
    response.send(output);
});

app.all('/data.json',function(request, response){
    response.send(items);
});

app.all('/data.xml',function(request, response){
    var output = '';
    output += '<?xml version="1.0" encoding="UTF-8" ?>';
    output += '<products>';

    items.map((item) => {
        output += '<product>';
        output += '     <name>' + item.name + '</name>';
        output += '     <price>' + item.price + '</price>';
        output += '</product>';
    })
    output += '</products>';
    response.type('text/xml');
    response.send(output);
});

http.createServer(app).listen(52273, () => console.log('Server Running at http://127.0.0.1:52273'));








