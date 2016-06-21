function admin($scope, $http) {
    $http.get('http://localhost:8080/restAdmin?adminId=admin').
        success(function(data) {
            $scope.admin = data;
        });
}
