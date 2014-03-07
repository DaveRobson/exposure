module.exports = function(grunt)
{
	grunt.initConfig(
	{
		pkg: grunt.file.readJSON('package.json'),

		express:
		{
			dev:
			{
				options:
				{
					script: 'app.js'
				}
			}
		}
	});

	grunt.loadNpmTasks('grunt-express-server');

	grunt.registerTask('default', ['express']);
}