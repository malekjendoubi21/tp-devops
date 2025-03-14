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

        stage('Build Docker Image') {
            steps {
                script {
                    sh """
                    docker build -t malekjendoubi/timesheet:1.0.0 .
                    """
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        sh """
                        docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}
                        docker push malekjendoubi/timesheet:1.0.0
                        """
                    }
                }
            }
        }
    }
}
