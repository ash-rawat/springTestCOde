pipeline{
    agent {
        label 'node2'
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
