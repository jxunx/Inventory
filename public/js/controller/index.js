function login($scope, $http) {
    $scope.admin = {};

    $scope.submitForm = function() {
        if (!loginForm.$invalid) {
            $http({
             method  : 'POST',
             url     : '/login',
             data    : $.param($scope.admin),  // pass in data as strings
             headers : { 'Content-Type': 'application/x-www-form-urlencoded' }  // set the headers so angular passing info as form data (not request payload)
             })
                .success(function(data) {
                    console.log(JSON.stringify(data));
                    $scope.admin=data;
                });
        }
    }
}
