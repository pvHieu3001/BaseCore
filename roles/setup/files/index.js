var http = ('http');
var server = http.createServer(function(req, res){
    res.writeHead(200);
    res.end("Hello www");
});
server.listen(3000);