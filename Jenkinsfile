peline{
    agent {
        label 'vm2'
    }
    tools {
        git 'vm2-git'
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
