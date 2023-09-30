pipeline {
    agent any
    stages{
        stage('pull'){
            steps{
            echo "hello pull complete"
            }
        }
        stage('build'){
            steps{
            echo "hello build done"
            }
        }
        stage('test'){
            steps{
            echo "hello test completed"
            }
        }
    }
}