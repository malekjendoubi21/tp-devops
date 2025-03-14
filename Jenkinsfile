
pipeline {
    agent any

    tools { 
        jdk 'JAVA_HOME' 
        maven 'M2_HOME' 
    }

    stages {
        stage('GIT') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/malekjendoubi21/tp-devops.git'
            }
        }

        stage('Compile Stage') {
            steps {
                sh 'mvn clean compile'
            }
        }
        

      
 stage('docker image Stage') {
                      steps {
                          sh 'docker build -t timesheet:1.0.0 https://github.com/malekjendoubi21/tp-devops.git'
            }
        }



        

}
}
