module.exports = function(app, passport)
{
	app.get('/', function(req, res)
	{
		res.render('home', {title: 'Home'});
	});

	app.get('/login', function(req, res)
	{
		res.render('login', {title: 'Home'});
	});

	app.post('/login', passport.authenticate('local'), function(req, res) 
  	{
	    // If this function gets called, authentication was successful.
	    // `req.user` contains the authenticated user.

	    console.log('i get here');
	    res.redirect('/dashboard');
	});

	app.get('/dashboard', passport.authenticate('local'), function(req, res)
	{
		res.render('dashboard/main', {title: 'Home'});
	});
}