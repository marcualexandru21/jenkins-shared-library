#!/user/bin/env groovy

def call() {
    echo "building the application... This is a Jenkins Shared Library function call $BRANCH_NAME"
    sh 'mvn package'
}