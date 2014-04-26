var express 	 = require('express'),
	path 		 = require('path')
	routes 		 = require('./server/routes/main'),
	auth 		 = require('./config/passport'),
	passport 	 = require('passport'),
	bodyParser 	 = require('body-parser'),
	cookieParser = require('cookie-parser'),
	session 	 = require('express-session');
	
var	app = express();


app.set('views', path.join(__dirname + '/client/views'));
app.set('view engine', 'jade');
app.use(express.static(__dirname + '/client/public'));
app.use(cookieParser());
app.use(bodyParser());
app.use(session({ secret: 'keyboard cat' }));
app.use(passport.initialize());
app.use(passport.session());



auth(passport);
//Define the routes
routes(app, passport);

app.set('port', process.env.PORT || 3000);


app.listen(app.get('port'));