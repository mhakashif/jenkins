pipeline {
    agent {
        node {
            label 'jenkins-slave'
        }
    }
    stages {
        stage('Stage 1') {
            steps {
                echo 'myfirstjob to this world!' 
            }
        }
    }
}