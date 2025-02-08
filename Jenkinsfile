pipeline{
    agent {
        label 'vm2'
    }
    stages{
        stage('Maven Build'){
            steps{
                sh "mvn --version"
                sh "mvn clean install"
            }
        }
    }
}
