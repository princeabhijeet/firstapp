pipeline {
	agent any
	stages {
		
		stage("Git Checkout") {
			steps {
				echo "Git checkout START"
				git branch: 'develop', poll: false, url: 'https://github.com/princeabhijeet/firstapp'
				echo "Git checkout COMPLETE"
			}
			
		}
		
	}
}