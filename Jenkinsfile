
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
         stage('MVN SONARQUBE') {
            steps {
                script {
                    // Utilisation du token depuis Jenkins credentials
                    withCredentials([string(credentialsId: 'sonarqube-token', variable: 'SONAR_TOKEN')]) {
                        sh "mvn sonar:sonar -Dsonar.login=${SONAR_TOKEN} -Dmaven.test.skip=true"
                    }
                }
            }
         }
        stage('Deploy to Nexus') {
                    steps {
                        script {
                            sh """
                            mvn deploy -DaltDeploymentRepository=nexus::default::http://192.168.56.10:8082/repository/maven-releases/
                            """
                        }
                    }
                }

      

    stage('docker image Stage') {
                      steps {
                     sh """
docker login -u malekjendoubi -p malek12345
docker push malekjendoubi/timesheet:1.0.0


        
}}
}
}
