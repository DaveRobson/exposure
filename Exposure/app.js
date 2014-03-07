var express = require('express'),
	path = require('path');
	
var	app = express();


app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');
app.use(express.compress());
app.use(express.favicon());

app.use(express.static(path.join(__dirname, 'public')));


app.get('/', function(req, res)
{
	res.render('home', {title: 'Home'});
});

app.set('port', process.env.PORT || 3000);


app.listen(app.get('port'));