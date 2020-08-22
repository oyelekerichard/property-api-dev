def agentLabel = 'devslave'
def branchName = BRANCH_NAME

def committer = "";
if (branchName == "staging") {
    agentLabel = "staging"
} else if(branchName == "master") {
    agentLabel = "prod1"
} else {
    agentLabel = "devslave"
}

pipeline {

    agent {label agentLabel}
    tools {
        maven 'maven'
        jdk 'jdk'
    }
    stages {
        stage ('Initialize') {
            steps {
                script {
                    sh 'git log --format="%ae" | head -1 > commit-author.txt'
                    committer = readFile('commit-author.txt').trim()
                    def msg = "STARTED: ${env.JOB_NAME} #${env.BUILD_NUMBER} by ${committer}: \n${env.BUILD_URL}"
                }
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage('Deployment') {
            when { anyOf { branch 'dev'; branch 'master'; branch 'staging' } }
            stages {
                      stage('Build Live') {
                          steps{
                              sh 'rm -f ./src/main/resources/application.properties'
                              sh 'cp /opt/property.application.properties ./src/main/resources/application.properties'
                              sh 'mvn clean install -DskipTests'
                              sh "docker-compose build --no-cache"
                          }
                      }
                      stage('Start Live') {
                          environment {
                              BRANCH = "${env.BRANCH_NAME}"
                          }
                          steps{
                              sh "docker-compose up -d"
                          }
                      }
            }
        }
    }

}