pipeline {

	agent any
	
	tools {
		maven 'Maven 3.9.0'
		jdk 'JDK 17'
	}
	
	stages {
		stage("Maven Clean") {
			steps {
				echo "STAGE: Maven clean - START"
				sh "mvn clean"
				echo "STAGE: Maven clean - COMPLETE"
			}
		}
	}
}