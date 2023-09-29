pipeline {
    agent any
    stages{
        stage('pull'){
            echo "hello pull complete"
        }
        stage('build'){
            echo "hello build done"
        }
        stage('test'){
            echo "hello test completed"
        }
        stage('deploy'){
            echo "hello your application is deployed"
        }
    }
}