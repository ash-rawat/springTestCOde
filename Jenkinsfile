pipeline{
    agent 'vm'
    stages{
        stage('Maven Build'){
            steps{
                sh "mvn --version"
                sh "mvn clean install"
            }
        }
    }
}
