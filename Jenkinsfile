pipeline{
    agent {
        docker {
            image "maven:3.6.0-jdk-13"
            label "node2"
        }
    }
    stages{
        stage('Maven Build'){
            steps{
                sh "mvn --version"
                sh "mvn clean install"
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
}
